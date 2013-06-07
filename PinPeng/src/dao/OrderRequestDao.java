package dao;

import hibernatesession.HibernateSessionFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.OrderRequest;

public class OrderRequestDao {

	public static void add_OrderRequest(OrderRequest orderrequest) {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();

		session.save(orderrequest);
		session.flush();

		transaction.commit();
		session.close();
	}

}
