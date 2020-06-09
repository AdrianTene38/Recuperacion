package ec.edu.ups.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.PedidoDAO;
import ec.edu.ups.entidades.Pedido;

/**
 * Servlet implementation class BuscaFecha
 */
@WebServlet("/BuscaFecha")
public class BuscaFecha extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Pedido pedido;
	private PedidoDAO pedidoDao;
	private List<Pedido> listaPedido;
	//
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscaFecha() {
        super();
        pedidoDao = DAOFactory.getFactory().getPedidoDAO();
        pedido= new Pedido();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		// TODO Auto-generated method stub
				javax.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("/Publica/Buscar2.jsp");

				Pedido t = Pedido.getInstance();
				String n=request.getParameter("codiguito");
				List<Pedido>prueba= pedidoDao.BuscarCorreoP(n);
			//	System.out.println("tama;o222"+ prueba.size());
				System.out.println();
				request.setAttribute("lista", prueba);
				dispatcher.forward(request, response);}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
