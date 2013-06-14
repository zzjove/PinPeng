package ww_test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import utils.Match;

import domain.Customer;
import domain.Friendship;
import domain.Message;
import domain.Myorder;
import domain.Myrequest;
import domain.Restriction;
import domain.ShoppingType;

public class Test {

	/**
	 * @param args
	 * @throws ParseException
	 */

	private void test_1() {
		Customer customer = dao.CustomerDao.findby_customerid(2);
		Myorder myorder = dao.MyorderDao.findby_orderid(2);
		ShoppingType shoppingtype = dao.ShoppingTypeDao.findby_orderid(2);
		Restriction restriction = dao.RestrictionDao.findby_orderid(2);
		List<Match> match_list = new ArrayList<Match>();

		List<Myorder> myorder_list = dao.MyorderDao.find_valid_order_list();
		Iterator<Myorder> it = myorder_list.iterator();

		while (it.hasNext()) {
			Myorder temp_myorder = (Myorder) it.next();
			ShoppingType temp_shoppingtype = dao.ShoppingTypeDao
					.findby_orderid(temp_myorder.getOrderid());
			Restriction temp_restriction = dao.RestrictionDao
					.findby_orderid(temp_myorder.getOrderid());

			int value = utils.CalculateConverter.get_match_value(myorder,
					temp_myorder, shoppingtype, temp_shoppingtype, restriction,
					temp_restriction);
			if (value != -1) {
				Match match = new Match(value, temp_myorder, temp_shoppingtype,
						temp_restriction, customer);
				match_list.add(match);
				System.out.println(match.getMyorder().getOrderid());
			}
		}
	}

	private static void test_2() {
		Customer customer = dao.CustomerDao.findby_customerid(2);
		Myrequest myrequest = new Myrequest(customer, new Date(), 1, 1, 1, 1);

		myrequest.getCustomers().add(customer);
		customer.getMyrequests().add(myrequest);

		dao.MyrequestDao.add_myrequest(myrequest);
		dao.CustomerDao.mofidy_customer(customer);

		Customer newcustomer = dao.CustomerDao.findby_customerid(2);
		if (newcustomer.getMyrequests().isEmpty()) {
			System.out.println("new CustomeridB is empty!!!");
		}

	}

	private static void test_3() {
		Customer customer = dao.CustomerDao.findby_customerid(2);
		Customer otherCustomer = dao.CustomerDao.findby_customerid(17);

		Friendship friendship = new Friendship(customer, otherCustomer);
		dao.FriendshipDao.add_friendship(friendship);

		// if (customer.getFriendshipsForCustomeridB().isEmpty()) {
		// System.out.println("~~~~~~~~ is empty!!!");
		// }
		// otherCustomer.set
		// customer.getFriendshipsForCustomeridB().add(otherCustomer);
		// customer.setCredit(2222);
		//
		// otherCustomer.getFriendshipsForCustomeridB().add(customer);
		// dao.CustomerDao.mofidy_customer(customer);
		// dao.CustomerDao.mofidy_customer(otherCustomer);
		//
		// if (customer.getFriendshipsForCustomeridB().isEmpty()) {
		// System.out.println("CustomeridB is empty!!!");
		// }
		//
		// // =========================test
		// Customer newcustomer = dao.CustomerDao.findby_customerid(2);
		// if (newcustomer.getFriendshipsForCustomeridB().isEmpty()) {
		// System.out.println("new CustomeridB is empty!!!");
		// }

	}

	public static void main(String[] args) throws ParseException {

		test_3();
	}
}
