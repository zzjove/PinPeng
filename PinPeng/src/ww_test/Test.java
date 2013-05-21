package ww_test;

import hibernatesession.HibernateSessionFactory;

import java.text.ParseException;

import org.hibernate.Session;

public class Test {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {

		Session session = HibernateSessionFactory.getSession();

		int max = (Integer) session.createQuery(
				"select max(m.requestid) from Myrequest m").uniqueResult();

		session.close();

		System.out.println(max);
	}

}
