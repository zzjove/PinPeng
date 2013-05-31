package dao;

import hibernatesession.HibernateSessionFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.Evaluation;

public class EvaluationDao {

	public static void add_evaluation(Evaluation evaluation) {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();

		session.save(evaluation);
		session.flush();

		transaction.commit();
		session.close();
	}
}
