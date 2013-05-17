package ww_test;


import hibernatesession.HibernateSessionFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.Admin;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		//admin.setDiscounts(11);
		admin.setName("ww");
		admin.setPassword("12356");
		admin.setSex(false);
		
		Session session=HibernateSessionFactory.getSession();
		Transaction transation=session.beginTransaction();
		
		session.save(admin);
		session.flush();
		
		transation.commit();
		session.close();
	}

}
