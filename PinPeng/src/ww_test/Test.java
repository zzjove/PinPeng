package ww_test;

import java.text.ParseException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import domain.Customer;
import domain.Myorder;

public class Test {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {

		Customer customer = dao.CustomerDao.findby_customerid(2);
		Myorder order = new Myorder(1, new Date(), new Date(), 1, 1, 1.00, 1, 1, 1,
				1, 1, 1, 1, 1, null, null);
		Set  customerSet=new HashSet();
		customerSet.add(customer);
		order.setCustomers(customerSet);
		dao.MyorderDao.add_order(order);
		//CustomerOrder customerorderid = new CustomerOrderId(customer, order);
		//CustomerOrderDao.add_CustomerOrderId(customerorderid);
	}

}
