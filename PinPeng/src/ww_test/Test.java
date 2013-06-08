package ww_test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import service.Match;

import domain.Customer;
import domain.Myorder;
import domain.Restriction;
import domain.ShoppingType;

public class Test {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {

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

			int value = service.CalculateConverter.get_match_value(myorder,
					temp_myorder, shoppingtype, temp_shoppingtype, restriction,
					temp_restriction);
			if (value != -1) {
				Match match = new Match(value, temp_myorder, temp_shoppingtype,
						temp_restriction, customer);
				match_list.add(match);
				System.out.println(match.getMyorder().getOrderid());
			}
		}
		// Set customerSet = new HashSet();
		// customerSet.add(customer);
		// order.setCustomers(customerSet);
		// dao.MyorderDao.add_order(order);
		// CustomerOrder customerorderid = new CustomerOrderId(customer, order);
		// CustomerOrderDao.add_CustomerOrderId(customerorderid);

	}
}
