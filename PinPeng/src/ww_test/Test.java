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
		Customer customer = new Customer(102989);
		// customer.setCustomerid(22);
		// Message message = new Message(customer, customer, new Date(), false);
		// message.set
		Set myrequest_list = new HashSet();// .getMyrequests();
		Myrequest myrequest=new Myrequest(customer, new Date(), 1, 0, 1, 1);
		myrequest.setCustomer(customer);
		// myrequest_list.add(myrequest);
		// customer.getMessagesForCustomerid();
		customer.setCredit(200);
		customer.getMyrequests().add(myrequest);
		// myrequest.setCustomer(customer)
		dao.CustomerDao.add_customer(customer);

		// System.out.println(((Myrequest) myrequest_list.iterator().next())
		// .getRequestid());
	}

	public static void main(String[] args) throws ParseException {

		test_2();
	}
}
