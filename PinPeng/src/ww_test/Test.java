package ww_test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;

import utils.CalculateConverter;
import utils.ComparatorMatch;
import utils.Match;

import dao.MyorderDao;
import domain.Customer;
import domain.MatchResult;
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

	private static void test_1() {
		Customer customer = dao.CustomerDao.findby_customerid(2);
		Myorder myorder = dao.MyorderDao.findby_orderid(10);
		ShoppingType shoppingtype = dao.ShoppingTypeDao.findby_orderid(10);
		Restriction restriction = dao.RestrictionDao.findby_orderid(10);
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
			// System.out.println(temp_myorder.getOrderid() + "        " +
			// value);
			if (value >= 0) {
				Match match = new Match(value, temp_myorder, temp_shoppingtype,
						temp_restriction, customer);
				if (customer.getCustomerid() != match.getMyorder()
						.getCustomer().getCustomerid()) {
					match_list.add(match);
				}
				// System.out.println(match.getMyorder().getOrderid());
			}
		}

		Collections.sort(match_list, new ComparatorMatch()); // 对match_list加权排序
		if (match_list.size() >= 5)
			match_list = match_list.subList(0, 5);

		// List<Myrequest> new_myrequest_list = new ArrayList();
		// List<ShoppingType> new_shoppingtype_list = new ArrayList();
		// List<Restriction> new_restriction_list = new ArrayList();
		// List<Customer> new_customer_list = new ArrayList();

		Iterator<Match> new_it = match_list.iterator();
		// List<MatchResult> matchs = new ArrayList();

		while (new_it.hasNext()) {

			Match match = (Match) new_it.next();
			// new_myrequest_list.add(match.getMyrequest());
			// new_shoppingtype_list.add(match.getShoppingtype());
			// new_restriction_list.add(match.getRestriction());
			// new_customer_list.add(match.getCustomer());
			System.out.println(match.getMyorder().getOrderid() + "    "
					+ match.getValue());
			MatchResult mr = new MatchResult(match.getMyorder().getOrderid(),
					match.getMyorder().getBeginTime(), match.getMyorder()
							.getPrice(), match.getValue(), match.getCustomer()
							.getCredit(), match.getMyorder().getNumberPeople());

			// matchs.add(mr);
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

	// private static void test_3() {
	// Myrequest myrequest = dao.MyrequestDao.findby_requestid(10);// Test
	// Myorder otherOrder = dao.MyorderDao.findby_orderid(1);
	//
	// myrequest.setStatus(2);
	// dao.MyrequestDao.modify_myrequest(myrequest);
	//
	// int value = CalculateConverter.get_match_value(myrequest, otherOrder,
	// myrequest.getShoppingType(), otherOrder.getShoppingType(),
	// myrequest.getRestriction(), otherOrder.getRestriction());
	//
	// // 是否符合匹配项
	// if (value == -1) { // 不匹配
	// System.out.println("匹配不合适!");
	// } else {// 匹配
	// Set myorderSet = myrequest.getMyorders();
	// myorderSet.add(otherOrder); // 添加RequestOrder项
	// dao.MyrequestDao.modify_myrequest(myrequest); // 更新数据库
	//
	// CalculateConverter.plus_restriction(myrequest.getRestriction(),
	// otherOrder.getRestriction()); // 将restriction合并
	// dao.RestrictionDao.modify_restriction(otherOrder.getRestriction());//
	// 更新数据库
	// }

	// otherOrder.getRestriction();
	// Set otherorderSet=otherRequest.getMyorders();
	// Iterator it =myorderSet.iterator();
	// while (it

	// }

	public static void test_4() {
		Myrequest myrequest = dao.MyrequestDao.findby_requestid(15);
		Myorder myorder = dao.MyorderDao.findby_orderid(27);

		myrequest.getMyorders().add(myorder);
		// myorder.getMyrequests().add(myrequest);
		// myrequest.getMyorders().clear();
		// dao.MyorderDao.modify_order(myorder);
		dao.MyrequestDao.modify_myrequest(myrequest);
	}

	public static void test_5() {
		Customer customer = dao.CustomerDao.findby_customerid(2);
		Myrequest myrequest = dao.MyrequestDao.findby_requestid(30);

		Set myrequestsSet = customer.getMyrequests();
		if (myrequestsSet.isEmpty()) {
			System.out.println("空的");
		} else {
			System.out.println("有东西");
		}
		myrequest.getCustomers().add(customer);
		if (myrequestsSet.isEmpty()) {
			System.out.println("空的");
		} else {
			System.out.println("有东西");
		}
		dao.MyrequestDao.modify_myrequest(myrequest);
		// System.out.println(myrequest.getCustomer().getCustomerid());
	}

	public static void test_6() {
		Set mySet = new HashSet();
		mySet.add("222");
		mySet.remove("222");
		if (mySet.isEmpty()) {
			System.out.println("空的");
		} else {
			System.out.println("有东西");
		}
	}

	public static void main(String[] args) throws ParseException {

		test_1();
	}
}
