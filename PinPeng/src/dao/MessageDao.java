package dao;

import java.util.Iterator;
import java.util.List;

import hibernatesession.HibernateSessionFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.Message;

public class MessageDao {

	public static Message findby_messageid(int messageid) {

		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from where messageid=";

		List message_list = session.createSQLQuery(sql + messageid + ";")
				.addEntity(Message.class).list();
		session.close();

		if (message_list.isEmpty()) {
			return null;
		} else {
			Iterator iterator = message_list.iterator();
			return (Message) iterator.next();
		}
	}

	public static void add_message(Message message) {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();

		session.save(message);
		session.flush();

		transaction.commit();
		session.close();
	}

	public static List findby_sendto(int sendto) {
		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from where sendto=";

		List message_list = session.createSQLQuery(sql + sendto + ";")
				.addEntity(Message.class).list();
		session.close();

		return message_list;
	}

	public static List findby_customerid(int customerid) {
		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from message where customerid=";

		List message_list = session.createSQLQuery(sql + customerid + ";")
				.addEntity(Message.class).list();
		session.close();

		return message_list;
	}
	
	public static List find_unreadmessage(int sendto){
		Session session = HibernateSessionFactory.getSession();

		String sql = "select * from message where status=0 and sendto=";

		List message_list = session.createSQLQuery(sql + sendto + ";")
				.addEntity(Message.class).list();
		session.close();

		return message_list;
	}
	
}
