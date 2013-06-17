package dao;

import hibernatesession.HibernateSessionFactory;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.Restriction;

public class RestrictionDao {

	public static Restriction findby_requestid(int requestid) {// ����һ��requestidѰ��һ��restriction

		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from restriction where requestid=";
		List restriction_list = session.createSQLQuery(sql + requestid + ";")
				.addEntity(Restriction.class).list();

		session.close();

		Iterator it = restriction_list.iterator();
		if (it.hasNext()) {
			return ((Restriction) it.next());
		} else {
			return null;
		}
	}

	public static Restriction findby_restrictiontid(int restrictiontid) {// ����restrictionid����һ��restriction

		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from restriction where requestid=";
		List restriction_list = session
				.createSQLQuery(sql + restrictiontid + ";")
				.addEntity(Restriction.class).list();

		session.close();

		Iterator it = restriction_list.iterator();
		if (it.hasNext()) {
			return ((Restriction) it.next());
		} else {
			return null;
		}
	}

	public static void add_restriction(Restriction restriction) {// ���һ��restriction
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();

		session.save(restriction);
		session.flush();

		transaction.commit();
		session.close();
	}

	public static Restriction findby_orderid(int orderid) {// ����һ��orderidѰ��һ��restriction

		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from restriction where orderid=";
		List restriction_list = session.createSQLQuery(sql + orderid + ";")
				.addEntity(Restriction.class).list();

		session.close();

		Iterator it = restriction_list.iterator();
		if (it.hasNext()) {
			return ((Restriction) it.next());
		} else {
			return null;
		}
	}

	public static void modify_restriction(Restriction restriction) {// �޸�һ��restriction
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();

		session.merge(restriction);
		session.flush();

		transaction.commit();
		session.close();
	}
}
