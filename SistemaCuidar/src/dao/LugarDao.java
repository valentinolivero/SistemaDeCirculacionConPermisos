package dao;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import datos.*;
import java.util.*;
public class LugarDao {
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
	    
	    public Lugar traerLugar(int id) throws HibernateException{
	    	Lugar objeto= null;
	    	try {
	    		iniciaOperacion();
	    		objeto= (Lugar) session.createQuery("from Lugar l where l.idLugar = '"+id+"'").uniqueResult();
	    	}finally {
	    		session.close();
	    	}
	    	return objeto;
	    }
}
