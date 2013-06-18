package web.action.control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.criteria.Order;

import service.MyorderService;
import service.MyrequestService;
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
	int requestid;

	public int getRequestid() {
		return requestid;
	}

	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}

	private void save_form() {

		SendRequestForm form = (SendRequestForm) ActionContext.getContext()
				.getSession().get("form");

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
				if (customer.getCustomerid() != match.getMyorder()
						.getCustomer().getCustomerid()) {
					match_list.add(match);
				}
				// System.out.println(match.getMyorder().getOrderid());
			}
		}

		Collections.sort(match_list, new ComparatorMatch()); // ��match_list��Ȩ����
		if (match_list.size() >= 5)
			match_list = match_list.subList(0, 5);

		Iterator<Match> new_it = match_list.iterator();
		List<MatchResult> matchs = new ArrayList();

		while (new_it.hasNext()) {

			Match match = (Match) new_it.next();

			MatchResult mr = new MatchResult(match.getMyorder().getOrderid(),
					match.getMyorder().getBeginTime(), match.getMyorder()
							.getPrice(), match.getValue(), match.getCustomer()
							.getCredit(), match.getMyorder().getNumberPeople());

			matchs.add(mr);
		}

		ActionContext.getContext().put("matchs", matchs);
		ActionContext.getContext().getSession()
				.put("requestid", myrequest.getRequestid());
		System.out.println("-----------------MatchRequestAction");
		System.out.println("requestid" + myrequest.getRequestid());
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub

		MyrequestService myrequestService = new MyrequestService();
		// �õ���ǰcustomer
		customer = (Customer) ActionContext.getContext().getSession()
				.get("customer");

		if (requestid == 0) {
			save_form();
		} else {
			myrequest = myrequestService.getRequest_by_requestid(requestid);
			Iterator<Myorder> it = myrequest.getMyorders().iterator();
			myorder = (Myorder) it.next();
			shoppingtype = dao.ShoppingTypeDao.findby_orderid(myorder
					.getOrderid());
			restriction = dao.RestrictionDao.findby_orderid(myorder
					.getOrderid());
		}
		match_and_put_it_to_request();
		return "success";
	}
}
