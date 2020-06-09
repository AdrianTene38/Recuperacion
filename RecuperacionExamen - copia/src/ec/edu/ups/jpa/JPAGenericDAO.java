package ec.edu.ups.jpa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import ec.edu.ups.dao.GenericDAO;
import ec.edu.ups.entidades.Pedido;
import ec.edu.ups.entidades.Comida;
import ec.edu.ups.entidades.Tarjeta;


public class JPAGenericDAO<T, ID> implements GenericDAO<T, ID> {
	String cadena="";
	private Class<T> persistentClass;
	protected EntityManager em;
	public JPAGenericDAO(Class<T> persistentClass) {
		// TODO Auto-generated constructor stub
		this.persistentClass = persistentClass;
		this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	}
	@Override
	public void create(T entity) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		try {
			em.persist(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(">>>> ERROR:JPAGenericDAO:create " + e);
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}	finally {
			em.close();
		}


	}

	@Override
	public T read(ID id) {
		// TODO Auto-generated method stub
		return em.find(persistentClass, id);
	}

	@Override

	public void delete(T entity) {
		// TDO Auto-generated method stub
		em.getTransaction().begin();
		try {
			em.remove(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(">>>> ERROR:JPAGenericDAO:delete " + e);
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
	}

	@Override
	public void deleteByID(ID id) {
		// TODO Auto-generated method stub
	}

	@Override
    @SuppressWarnings({ "rawtypes", "unchecked" })

	public List<T> findAll() {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		List<T> lista = null;
		try {
			javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
			cq.select(cq.from(persistentClass));
			lista = em.createQuery(cq).getResultList();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;

	}


	@SuppressWarnings("unchecked")
	@Override
	public List<String> find1(String nombre) {
		cadena = ("SELECT u.precio FROM Comida u WHERE u.nombre = '" + nombre +  "'") ;
		List<String> res = (List<String>) em.createQuery(cadena, String.class).getResultList();
		System.out.println("QUE ESTA MAL "+res);
		em.clear();
		return (List<String>) res;
	

	}
	@Override
	public String logueo(String correo, String contra) {
		return cadena="";

	}
	@SuppressWarnings("unchecked")
	@Override
	public List<T> BuscarId(ID id) {
		return null;
		// TODO Auto-generated method stub

	}
	@SuppressWarnings("unchecked")
	@Override
	public List<T> BuscarCedula(String cedula) {
		cadena = ("SELECT p FROM Pedido p WHERE p.numero = '" + cedula + "'")  ;
		List<Pedido> res = (List<Pedido>) em.createQuery(cadena, Pedido.class).getResultList();
		System.out.println("somosa12");
		System.out.println(res);
		return (List<T>) res;
	}

	//"SELECT usu_nombre,usu_apellido FROM Usuario WHERE usu_cedula = '" + cedula + "'"  
	@SuppressWarnings("unchecked")
	@Override
	public List<T> BuscarCorreo(String correo) {
		// TODO Auto-generated method stub

		return (List<T>) null;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<T> BuscarCedulaP(String cedula) {
		// TODO Auto-generated method stub
		//"SELECT tel_numero,tel_tipo,tel_operadora FROM telefono WHERE usu_cedula = '" + cedula + "'"  
		return (List<T>) null;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<T> BuscarCorreoP(String correo) {
		// TODO Auto-generated method stub
		cadena = ("SELECT p FROM Pedido p WHERE p.fecha = '" + correo + "'")  ;
		List<Pedido> res = (List<Pedido>) em.createQuery(cadena, Pedido.class).getResultList();
		System.out.println("somosa12");
		System.out.println(res);
		return (List<T>) res;

	}
	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		try {
			em.merge(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(">>>> ERROR:JPAGenericDAO:update " + e);
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();

		}

	}

}