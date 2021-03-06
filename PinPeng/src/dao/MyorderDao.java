package dao;

import java.util.Iterator;
import java.util.List;

import hibernatesession.HibernateSessionFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.Myorder;

public class MyorderDao {

	public static void add_order(Myorder order) {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();

		session.save(order);
		session.flush();

		transaction.commit();
		session.close();
	}

	public static Myorder findby_orderid(int orderid) {
		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from myorder where orderid=";
		List order_list = session.createSQLQuery(sql + orderid + ";")
				.addEntity(Myorder.class).list();
		session.close();

		if (order_list.isEmpty()) {
			return null;
		} else {
			Iterator iterator = order_list.iterator();
			return (Myorder) iterator.next();
		}

	}

	public static List find_valid_order_list() {
		Session session = hibernatesession.HibernateSessionFactory.getSession();

		String sql = "SELECT myorder.* FROM myorder,restriction "
				+ "WHERE restriction.end_day > CURRENT_DATE "
				+ "AND restriction.orderid=myorder.orderid "
				+ "AND status BETWEEN 1 AND 2;";
		List myorder_list = session.createSQLQuery(sql)
				.addEntity(Myorder.class).list();

		return myorder_list;
	}

	public static List find_valid_order_list_by_customerid(int customerid) {
		Session session = hibernatesession.HibernateSessionFactory.getSession();

		String sql = "SELECT myorder.* FROM myorder,restriction "
				+ "WHERE restriction.end_day > CURRENT_DATE "
				+ "AND restriction.orderid=myorder.orderid "
				+ "AND status BETWEEN 1 AND 2;" + "AND customerid="
				+ customerid + ";";
		List myorder_list = session.createSQLQuery(sql)
				.addEntity(Myorder.class).list();

		return myorder_list;
	}

	public static int find_max_orderid() {// Ѱ������orderid

		Session session = HibernateSessionFactory.getSession();

		int max = (Integer) session.createQuery(
				"select max(m.orderid) from Myorder m").uniqueResult();

		session.close();

		return max;
	}

	public static void modify_order(Myorder order) {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();

		session.merge(order);
		session.flush();

		transaction.commit();
		session.close();
	}

	public static List findby_shoppingstore(int store) {
		Session session = hibernatesession.HibernateSessionFactory.getSession();

		String sql = "SELECT myorder.* "
				+ "FROM myorder,restriction,shopping_type "
				+ "WHERE myorder.orderid = restriction.orderid "
				+ "AND myorder.orderid = shopping_type.orderid "
				+ "AND restriction.end_day > CURRENT_DATE "
				+ "AND myorder.status BETWEEN 1 AND 2 "
				+ "AND shopping_type.shopping_store=" + store + ";";
		List myorder_list = session.createSQLQuery(sql)
				.addEntity(Myorder.class).list();

		return myorder_list;
	}
}
