package dao;

import hibernatesession.HibernateSessionFactory;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.Myrequest;

public class MyrequestDao {

	public static Myrequest findby_requestid(int requestid) {// 通过requestid寻找一个myrequest

		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from myrequest where requestid=";
		List myrequest_list = session.createSQLQuery(sql + requestid + ";")
				.addEntity(Myrequest.class).list();

		session.close();

		Iterator it = myrequest_list.iterator();
		if (it.hasNext()) {
			return ((Myrequest) it.next());
		} else {
			return null;
		}
	}

	public static void add_myrequest(Myrequest myrequest) {// 添加一个myrequest
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();

		session.save(myrequest);
		session.flush();

		transaction.commit();
		session.close();
	}

	public static void modify_myrequest(Myrequest myrequest) {// 更新一个myrequest
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();

		session.update(myrequest);
		session.flush();

		transaction.commit();
		session.close();
	}

	public static List findby_customerid(int customerid) {// 通过customerid寻找所有myrequest

		Session session = HibernateSessionFactory.getSession();
		
		String sql = "select * from myrequest where customerid=";
		List myrequest_list = session.createSQLQuery(sql + customerid + ";")
				.addEntity(Myrequest.class).list();

		session.close();

		return myrequest_list;
	}

}
