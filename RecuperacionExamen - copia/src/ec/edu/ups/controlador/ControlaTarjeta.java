package ec.edu.ups.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.ComidaDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.entidades.Comida;
import ec.edu.ups.entidades.Pedido;
import ec.edu.ups.entidades.Tarjeta;

/**
 * Servlet implementation class ControlaTarjeta
 */
@WebServlet("/ControlaTarjeta")
public class ControlaTarjeta extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ComidaDAO comidaDao;
	private List<Comida> listacomida;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControlaTarjeta() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		//Boolean active = Boolean.valueOf(request.getParameter("1"));
		//	String active = request.getParameter("transporte");
		//System.out.println(active);
		//if("ON".equals(active)){			
		//System.out.println("sosaaaaa");
		// check box is selected
		//} else{
		// check box is not selected

		//}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Pedido pe = Pedido.getInstance(); 
		Comida comida = Comida.getInstance(); 
		Tarjeta tarjeta = Tarjeta.getInstance();
		Pedido pedido = Pedido.getInstance();
		comidaDao = DAOFactory.getFactory().getComidaDAO();
		//String[] myarr = request.getParameterValues("porfa");
		String[] results = request.getParameterValues("porfa");
		System.out.println("q gaybor"+ results);
		int numero;
		int suma=0;
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
			List<String>prueba= comidaDao.find1(results[i]);
			comida.setNombre(results[i]);
			System.out.println("los precios"+prueba);
			String delim = "-";
			
			StringBuilder sb = new StringBuilder();
				sb.append(results[0]);
				sb.append(delim);
			sb.append(results[i]);
			String s=tarjeta.getNumerotarjeta();
			tarjeta.setNumerotarjeta(s);
			String res = sb.toString();
			System.out.println("ADRIANNN"+res);
			pedido.setPlatos(res);
			
			//t.setNumero(prueba.get(0).getNumero());
			for (int j = 0; j < prueba.size(); j++) {
				numero=Integer.parseInt(prueba.get(j));
				suma=suma+numero;
				System.out.println("esta es la sumasdasdasdaasas: "+ suma);
				String total= String.valueOf(suma);
				pe.setTotal(suma);
				int manda= pe.getTotal();
				System.out.println("q paso mijin xqqq"+manda);
				//getServletContext().getRequestDispatcher("/Publica/Tarjeta.jsp").forward(request, response);
				//response.sendRedirect("/RecuperacionExamen/Publica/Editar.jsp");
				request.setAttribute("pedido", pe);       
				request.setAttribute("comida", comida);
				request.setAttribute("pedido", pedido);
				request.setAttribute("tarjeta", tarjeta);
			}
		}
		request.getRequestDispatcher("/Publica/Editar.jsp").forward(request, response);
	}

}