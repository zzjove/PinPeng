package dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import HibernateConfigure.HibernateSessionFactory;
import domain.Admin;

public class AdminDao {

	public static Admin add_admin(Admin admin) {

		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();

		session.save(admin);
		session.flush();

		transaction.commit();
		session.close();

		return null;
	}

	public static Admin findby_adminid(int adminid) {

		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from admin where adminid=";
		List admin_list = session.createSQLQuery(sql + adminid + ";")
				.addEntity(Admin.class).list();

		session.close();

		Iterator it = admin_list.iterator();
		if (it.hasNext()) {
			return ((Admin) it.next());
		} else {
			return null;
		}
	}

	public static Admin findby_name(String name) {

		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from admin where name=";
		List admin_list = session.createSQLQuery(sql + name + ";")
				.addEntity(Admin.class).list();

		session.close();

		Iterator it = admin_list.iterator();
		if (it.hasNext()) {
			Admin admin_temp = (Admin) it.next();
			return admin_temp;
		} else {
			return null;
		}
	}

	public static Admin findby_adminid_pw(int adminid, String password) {
		Admin admin = findby_name(adminid + "");
		if (password.equals(admin.getPassword())) {
			return admin;
		}
		return null;
	}
}
