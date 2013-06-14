package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.Friendship;

public class FriendshipDao {

	public static void add_friendship(Friendship friendship) {
		Session session = hibernatesession.HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();

		session.save(friendship);
		session.flush();

		transaction.commit();
		session.close();
	}
}
