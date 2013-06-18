package web.action.control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import utils.ComparatorMatch;
import utils.Match;
import web.formbean.SendRequestForm;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;
import domain.MatchResult;
import domain.Myorder;
import domain.Myrequest;
import domain.Restriction;
import domain.ShoppingType;

public class MatchRequestAction extends ActionSupport {

	Customer customer;
	Myorder myorder;
	ShoppingType shoppingtype;
	Restriction restriction;
	Myrequest myrequest;

	private void save_form() {

		SendRequestForm form = (SendRequestForm) ActionContext.getContext()
				.getSession().get("form");

		// �õ���ǰcustomer
		customer = (Customer) ActionContext.getContext().getSession()
				.get("customer");

		myrequest = form.get_myrequest(); // �õ�myrequest���ұ���
		myrequest.setRequestid(dao.MyrequestDao.find_max_requestid() + 1);
		dao.MyrequestDao.add_myrequest(myrequest);

		shoppingtype = form.get_shoppingtype(myrequest); // ��myreuqest��Ӧ��shoppingtype���ұ���
		shoppingtype.setAmountTo((double) 100);
		shoppingtype.setRequestid(myrequest.getRequestid());
		dao.ShoppingTypeDao.add_shoppingtype(shoppingtype);

		restriction = form.get_restriction(myrequest); // ��myreuqest��Ӧ��restriction���ұ���
		restriction.setRequestid(myrequest.getRequestid());
		dao.RestrictionDao.add_restriction(restriction);

		// �����µ�һ��order
		Set myrequest_set = new HashSet();
		myrequest_set.add(myrequest);

		myorder = new Myorder(customer, 1, new Date(), myrequest.getPrice(), 1,
				myrequest.getAmount(), myrequest.getWeight(), myrequest_set);
		dao.MyorderDao.add_order(myorder); // ��order���������ݿ�
		shoppingtype.setRequestid(-1); // ��order��Ӧ��restriction��shoppingtype����
		restriction.setRequestid(-1);
		shoppingtype.setOrderid(myorder.getOrderid());
		restriction.setOrderid(myorder.getOrderid());
		dao.ShoppingTypeDao.add_shoppingtype(shoppingtype);
		dao.RestrictionDao.add_restriction(restriction);

		myrequest.getMyorders().add(myorder);// ��myorder��myrequest��������ϵ��
		dao.MyrequestDao.modify_myrequest(myrequest);
	}

	private void match_and_put_it_to_request() {// �õ�ƥ���б�����request
		List<Myorder> myorder_list = dao.MyorderDao.find_valid_order_list();
		Iterator<Myorder> it = myorder_list.iterator();
		List<Match> match_list = new ArrayList<Match>();

		while (it.hasNext()) {
			Myorder temp_myorder = (Myorder) it.next();
			ShoppingType temp_shoppingtype = dao.ShoppingTypeDao
					.findby_orderid(temp_myorder.getOrderid());
			Restriction temp_restriction = dao.RestrictionDao
					.findby_orderid(temp_myorder.getOrderid());

			int value = utils.CalculateConverter.get_match_value(myorder,
					temp_myorder, shoppingtype, temp_shoppingtype, restriction,
					temp_restriction);
			if (value >= 0) {
				Match match = new Match(value, temp_myorder, temp_shoppingtype,
						temp_restriction, customer);
				match_list.add(match);
				// System.out.println(match.getMyorder().getOrderid());
			}
		}

		Collections.sort(match_list, new ComparatorMatch()); // ��match_list��Ȩ����
		if (match_list.size() >= 5)
			match_list = match_list.subList(0, 5);

		// List<Myrequest> new_myrequest_list = new ArrayList();
		// List<ShoppingType> new_shoppingtype_list = new ArrayList();
		// List<Restriction> new_restriction_list = new ArrayList();
		// List<Customer> new_customer_list = new ArrayList();

		Iterator<Match> new_it = match_list.iterator();
		List<MatchResult> matchs = new ArrayList();

		while (new_it.hasNext()) {

			Match match = (Match) new_it.next();
			// new_myrequest_list.add(match.getMyrequest());
			// new_shoppingtype_list.add(match.getShoppingtype());
			// new_restriction_list.add(match.getRestriction());
			// new_customer_list.add(match.getCustomer());

			MatchResult mr = new MatchResult(match.getMyorder().getOrderid(),
					match.getMyorder().getBeginTime(), match.getMyorder()
							.getPrice(), match.getValue(), match.getCustomer()
							.getCredit(), match.getMyorder().getNumberPeople());

			matchs.add(mr);
		}

		MatchResult mr1 = new MatchResult();
		mr1.setCredit(3);
		mr1.setDate(new Date());
		mr1.setOrderId(26);
		mr1.setPeopleNum(5);
		mr1.setPrice(100);
		mr1.setValue(10);
		MatchResult mr2 = new MatchResult();
		mr2.setCredit(6);
		mr2.setDate(new Date());
		mr2.setOrderId(2);
		mr2.setPeopleNum(4);
		mr2.setPrice(200);
		mr2.setValue(20);
		MatchResult mr3 = new MatchResult();
		mr3.setCredit(5);
		mr3.setDate(new Date());
		mr3.setOrderId(29);
		mr3.setPeopleNum(6);
		mr3.setPrice(300);
		mr3.setValue(50);
		// List matchs = new ArrayList();
		matchs.add(mr1);
		matchs.add(mr2);
		matchs.add(mr3);
		ActionContext.getContext().put("matchs", matchs);
		ActionContext.getContext().getSession()
				.put("requestid", myrequest.getRequestid());
		// ActionContext.getContext().put("orderid",)
		System.out.println("-----------------MatchRequestAction");
		System.out.println("requestid" + myrequest.getRequestid());
		// ActionContext.getContext().put("myrequest_list", new_myrequest_list);
		// ActionContext.getContext().put("shoppingtype_list",
		// new_shoppingtype_list);
		// ActionContext.getContext()
		// .put("restriction_list", new_restriction_list);
		// ActionContext.getContext().put("customer_list", new_customer_list);
		//
		// ActionContext.getContext().put("match_list", match_list);
		//
		//
		//
		//
		// System.out.println(new_myrequest_list.size());
		// System.out.println(new_shoppingtype_list.size());
		// System.out.println(new_restriction_list.size());
		// System.out.println(new_customer_list.size());
		// System.out.println(match_list.size());
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		save_form();
		match_and_put_it_to_request();
		return "success";
	}
}
