package ec.edu.ups.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Entity implementation class for Entity: Persona
 *
 */

@Entity
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String numero;
	private  String fecha;
	private  String cliente;
	private  int total;
	private  String platos;
	public String getPlatos() {
		return platos;
	}
	public void setPlatos(String platos) {
		this.platos = platos;
	}

	private String observaciones;
	private static Pedido instance;	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public static void setInstance(Pedido instance) {
		Pedido.instance = instance;
	}

	public static Pedido getInstance() {
		if (instance == null)
			instance = new Pedido();
		return instance;
	
}
	public Pedido() {
		super();
	}

	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", fecha=" + fecha + ", cliente=" + cliente + ", total=" + total
				+ ", observaciones=" + observaciones + "]";
	}

	public Pedido(String numero, String fecha, String cliente, int total, String observaciones,String platos) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.cliente = cliente;
		this.total = total;
		this.observaciones = observaciones;
		this.platos = platos;
	}
}
