package dao;

import hibernatesession.HibernateSessionFactory;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.CustomerOrder;

public class CustomerOrderDao {

	public static List<CustomerOrder> findby_customerid(int customerid) {

		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from customer_order where customertid=";
		List customerorder_list = session
				.createSQLQuery(sql + customerid + ";")
				.addEntity(CustomerOrder.class).list();

		session.close();

		return customerorder_list;

	}

	public static CustomerOrder findby_orderid(int orderid) {

		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from customer_order where orderid=";
		List customerorder_list = session.createSQLQuery(sql + orderid + ";")
				.addEntity(CustomerOrder.class).list();

		session.close();

		Iterator it = customerorder_list.iterator();
		if (it.hasNext()) {
			return ((CustomerOrder) it.next());
		} else {
			return null;
		}
	}

	public static void add_CustomerOrder(CustomerOrder customerorder) {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();

		session.update(customerorder);
		session.flush();

		transaction.commit();
		session.close();
	}

}
