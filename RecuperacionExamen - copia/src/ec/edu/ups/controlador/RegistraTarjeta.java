package ec.edu.ups.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.TarjetaDAO;
import ec.edu.ups.entidades.Comida;
import ec.edu.ups.entidades.Pedido;
import ec.edu.ups.entidades.Tarjeta;


/**
 * Servlet implementation class RegistraTarjeta
 */
@WebServlet("/RegistraTarjeta")
public class RegistraTarjeta extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TarjetaDAO tarjetita;
	private Tarjeta tarjeta;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistraTarjeta() {
		super();
		// TODO Auto-generated constructor stub
		tarjetita = DAOFactory.getFactory().getTarjetaDAO();
		tarjeta=new Tarjeta();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Pedido p = Pedido.getInstance();
		Tarjeta t = Tarjeta.getInstance();
		//Comida c = Comida.getInstance();
		//String numerot= request.getParameter("numerotarjeta");
		//t.setNumerotarjeta(numerot);
     	//c.getNombre();
     	//c.setNombre(c.getNombre());
		//System.out.print("ya vino mira v loco"+c.getNombre());
		tarjeta = new Tarjeta (request.getParameter("numerotarjeta"),request.getParameter("nombre"),request.getParameter("fechacaducidad"),request.getParameter("cvv"));
		tarjetita.create(tarjeta);
		t.setNumerotarjeta(request.getParameter("numerotarjeta"));
		//List<Comida>prueba;
		//c.setNombre(prueba.get(0).getNombre());
		//request.setAttribute("tarjeta", t);                    
		//request.setAttribute("pedido", p);                    
		//request.setAttribute("comida", c); 	
		response.sendRedirect("/RecuperacionExamen/MandaComida");
	}
	
	//response.sendRedirect(request.getContextPath() + "/Privada/Privada.html");
}