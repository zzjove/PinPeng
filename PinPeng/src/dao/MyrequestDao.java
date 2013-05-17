package dao;

import hibernatesession.HibernateSessionFactory;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.Myrequest;

public class MyrequestDao {

	public static Myrequest findby_requestid(int requestid) {

		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from Myrequest where requestid=";
		List myrequest_list = session.createSQLQuery(sql + requestid + ";")
				.addEntity(Myrequest.class).list();

		session.close();

		Iterator it = myrequest_list.iterator();
		if (it.hasNext()) {
			return ((Myrequest) it.next());
		} else {
			return null;
		}
	}
	
	public static void add_myrequest(Myrequest myrequest){
		Session session=HibernateSessionFactory.getSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(myrequest);
		session.flush();
		
		transaction.commit();
		session.close();
	}
	
	public static void modify_myrequest(Myrequest myrequest){
		Session session=HibernateSessionFactory.getSession();
		Transaction transaction=session.beginTransaction();
		
		session.update(myrequest);
		session.flush();
		
		transaction.commit();
		session.close();
	}
	

}
