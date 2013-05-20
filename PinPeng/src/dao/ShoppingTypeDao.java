package dao;

import hibernatesession.HibernateSessionFactory;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.ShoppingType;

public class ShoppingTypeDao {

	public static ShoppingType findby_requestid(int requestid) {//根据requestid找一个shoppingtype

		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from restriction where requestid=";
		List restriction_list = session.createSQLQuery(sql + requestid + ";")
				.addEntity(ShoppingType.class).list();

		session.close();

		Iterator it = restriction_list.iterator();
		if (it.hasNext()) {
			return ((ShoppingType) it.next());
		} else {
			return null;
		}
	}

	public static ShoppingType findby_shoppingtypeid(int shoppingtypeid) {//根据shoppingtypeid找一个shoppingtype

		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from restriction where requestid=";
		List restriction_list = session
				.createSQLQuery(sql + shoppingtypeid + ";")
				.addEntity(ShoppingType.class).list();

		session.close();

		Iterator it = restriction_list.iterator();
		if (it.hasNext()) {
			return ((ShoppingType) it.next());
		} else {
			return null;
		}
	}
	
	public static void add_shoppingtype(ShoppingType shoppingtype){//添加一个shoppingtype
		
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(shoppingtype);
		session.flush();
		
		transaction.commit();
		session.close();
		
	}

}
