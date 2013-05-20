package dao;

import hibernatesession.HibernateSessionFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.Order;

public class OrderDao {

	public static void add_order (Order order){
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();

		session.save(order);
		session.flush();

		transaction.commit();
		session.close();
	}
}
