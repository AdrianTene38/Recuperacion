package ec.edu.ups.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.PedidoDAO;
import ec.edu.ups.dao.TarjetaDAO;
import ec.edu.ups.entidades.Pedido;
import ec.edu.ups.entidades.Tarjeta;

/**
 * Servlet implementation class ControlaPedido
 */
@WebServlet("/ControlaPedido")
public class ControlaPedido extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PedidoDAO pedidito;
	private Pedido pedido;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlaPedido() {
        super();
        // TODO Auto-generated constructor stub
        pedidito = DAOFactory.getFactory().getPedidoDAO();
		pedido=new Pedido();
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
		
		System.out.print("q onda lego aqui,,??");
		String total1 =request.getParameter("total");
		int total=Integer.parseInt(total1);
		pedido = new Pedido (request.getParameter("numerotarjeta"),request.getParameter("fechapedido"),request.getParameter("cliente"),total,request.getParameter("observaciones"), request.getParameter("comida"));
		pedidito.create(pedido);		
		request.getRequestDispatcher("/Publica/Publica.html").forward(request, response);

	}

	
}
