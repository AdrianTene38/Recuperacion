package ec.edu.ups.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.ComidaDAO;
import ec.edu.ups.dao.DAOFactory;

import ec.edu.ups.entidades.Comida;

/**
 * Servlet implementation class MandaComida
 */
@WebServlet("/MandaComida")
public class MandaComida extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ComidaDAO comidaDao;
	private List<Comida> listaTelefono;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MandaComida() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        comidaDao = DAOFactory.getFactory().getComidaDAO();
		Comida t= Comida.getInstance();
		List<Comida>prueba= comidaDao.findAll();
		request.setAttribute("lista", prueba);	
		getServletContext().getRequestDispatcher("/Publica/ListaComida.jsp").forward(request, response);	
		}	//RequestDispatcher dispatcher = request.getRequestDispatcher("Editar.jsp");
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
}