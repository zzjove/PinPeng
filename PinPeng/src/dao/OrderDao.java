package dao;

import java.util.Iterator;
import java.util.List;

import hibernatesession.HibernateSessionFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.Order;

public class OrderDao {

	public static void add_order(Order order) {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();

		session.save(order);
		session.flush();

		transaction.commit();
		session.close();
	}

	public static Order findby_orderid(int orderid) {
		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from order where orderid=";
		List order_list = session.createSQLQuery(sql + orderid + ";")
				.addEntity(Order.class).list();
		session.close();

		if (order_list.isEmpty()) {
			return null;
		} else {
			Iterator iterator = order_list.iterator();
			return (Order) iterator.next();
		}

	}
}
