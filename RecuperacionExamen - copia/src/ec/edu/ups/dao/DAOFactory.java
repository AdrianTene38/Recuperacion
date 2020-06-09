package ec.edu.ups.dao;

import ec.edu.ups.jpa.JPADAOFactory;

public abstract class DAOFactory {
	// Ser�a mejor por inyecci�n de objetos


	protected static DAOFactory factory = new JPADAOFactory();

	public static DAOFactory getFactory() {

		return factory;
	}
	

	public abstract PedidoDAO getPedidoDAO();
	public abstract TarjetaDAO getTarjetaDAO();
	public abstract ComidaDAO getComidaDAO();



}