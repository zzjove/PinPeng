package dao;

import hibernatesession.HibernateSessionFactory;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import domain.Restriction;

public class RestrictionDao {

	public static Restriction findby_requestid(int requestid) {

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

	public static Restriction findby_restrictiontid(int restrictiontid) {

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

}
