package dao;

import hibernatesession.HibernateSessionFactory;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.Customer;

public class CustomerDao {

	public static Customer findby_customerid(int customerid) {// 通过customerid寻找顾客

		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from customer where customerid=";
		List customer_list = session.createSQLQuery(sql + customerid + ";")
				.addEntity(Customer.class).list();

		session.close();

		Iterator it = customer_list.iterator();
		if (it.hasNext()) {
			Customer customer_temp = (Customer) it.next();
			return customer_temp;
		} else {
			return null;
		}
	}

	public static Customer loginby_studentid_pw(int studentid, String password) {// 通过学号与密码寻找顾客

		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from customer where studentid=";
		List customer_list = session.createSQLQuery(sql + studentid + ";")
				.addEntity(Customer.class).list();

		Iterator it = customer_list.iterator();
		if (it.hasNext()) {
			Customer customer_temp = (Customer) it.next();
			if (customer_temp.getPassword().equals(password))
				return customer_temp;
		}

		return null;
	}

	public static void add_customer(Customer customer) {
		Session session = hibernatesession.HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();

		session.save(customer);
		session.flush();

		transaction.commit();
		session.close();
	}

	public static void mofidy_customer(Customer customer) {
		Session session = hibernatesession.HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();

		session.update(customer);
		session.flush();

		transaction.commit();
		session.close();
	}

	public static Customer findby_name(String name) {
		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from customer where name='";
		List customer_list = session.createSQLQuery(sql + name + "';")
				.addEntity(Customer.class).list();

		session.close();

		Iterator it = customer_list.iterator();
		if (it.hasNext()) {
			Customer customer_temp = (Customer) it.next();
			return customer_temp;
		} else {
			return null;
		}
	}

	public static Set find_prefer_myrequestlist(int customerid) {

		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from customer where customerid=";
		List customer_list = session.createSQLQuery(sql + customerid + ";")
				.addEntity(Customer.class).list();

		Iterator it = customer_list.iterator();
		if (it.hasNext()) {
			Customer customer_temp = (Customer) it.next();
			Set myrequest_set = customer_temp.getMyrequests();
			session.close();
			return myrequest_set;
		} else {
			session.close();
			return null;
		}
	}
}
