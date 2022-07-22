package dao;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import datos.*;
import java.util.*;
public class PermisoDao {
	private static Session session;
    private Transaction tx;
	  private void iniciaOperacion() throws HibernateException {
	        session = HibernateUtil.getSessionFactory().openSession();
	        tx = session.beginTransaction();
	    }

	    private void manejaExcepcion(HibernateException he) throws HibernateException {
	        tx.rollback();
	        throw new HibernateException("ERROR en la capa de acceso a datos", he);
	    }
	    public Permiso traerPermiso(int idPermiso)throws HibernateException{
	    	Permiso objeto= null;
	    	try {
	    		iniciaOperacion();
	    		objeto= (Permiso) session.createQuery("from Permiso p where p.idPermiso = "+idPermiso+"").uniqueResult();
	    		Hibernate.initialize(objeto.getPersona());
	    		Hibernate.initialize(objeto.getRodado());
	    		Hibernate.initialize(objeto.getDesdeHasta());
	    	}finally {
	    		session.close();
	    	}
	    	return objeto;
	    }
	    
}
