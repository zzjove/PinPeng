package ww_test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;

import utils.CalculateConverter;
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
		Myrequest myrequest = dao.MyrequestDao.findby_requestid(10);// Test
		Myorder otherOrder = dao.MyorderDao.findby_orderid(1);

		myrequest.setStatus(2);
		dao.MyrequestDao.modify_myrequest(myrequest);

		int value = CalculateConverter.get_match_value(myrequest, otherOrder,
				myrequest.getShoppingType(), otherOrder.getShoppingType(),
				myrequest.getRestriction(), otherOrder.getRestriction());

		// �Ƿ����ƥ����
		if (value == -1) { // ��ƥ��
			System.out.println("ƥ�䲻����!");
		} else {// ƥ��
			Set myorderSet = myrequest.getMyorders();
			myorderSet.add(otherOrder); // ���RequestOrder��
			dao.MyrequestDao.modify_myrequest(myrequest); // �������ݿ�

			CalculateConverter.plus_restriction(myrequest.getRestriction(),
					otherOrder.getRestriction()); // ��restriction�ϲ�
			dao.RestrictionDao.modify_restriction(otherOrder.getRestriction());// �������ݿ�
		}

		// otherOrder.getRestriction();
		// Set otherorderSet=otherRequest.getMyorders();
		// Iterator it =myorderSet.iterator();
		// while (it

	}

	public static void main(String[] args) throws ParseException {

		test_3();
	}
}
