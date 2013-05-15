package dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import HibernateConfigure.HibernateSessionFactory;
import domain.ShoppingType;

public class ShoppingTypeDao {

	public static ShoppingType findby_requestid(int requestid) {

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

	public static ShoppingType findby_shoppingtypeid(int shoppingtypeid) {

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

}
