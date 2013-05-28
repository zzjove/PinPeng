package dao;

import java.util.List;

import hibernatesession.HibernateSessionFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.Discount;

public class DiscountDao {
	public static void add_discount(Discount discount) {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();

		session.save(discount);
		session.flush();

		transaction.commit();
		session.close();
	}

	public static void modify_discount(Discount discount) {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();

		session.update(discount);
		session.flush();

		transaction.commit();
		session.close();
	}

	public static List findby_shopping_store(int shopping_store) {
		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from discount where shopping_store=";
		List discount_list = session.createSQLQuery(sql + shopping_store + ";")
				.addEntity(Discount.class).list();
		session.close();

		return discount_list;
	}

}
