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
import domain.Myorder;
import domain.Myrequest;
import domain.Restriction;
import domain.ShoppingType;

public class MatchRequestAction extends ActionSupport {

	Customer customer;
	Myorder myorder;
	ShoppingType shoppingtype;
	Restriction restriction;

	private void save_form() {

		SendRequestForm form = (SendRequestForm) ActionContext.getContext()
				.getSession().get("form");

		// 得到当前customer
		customer = (Customer) ActionContext.getContext().getSession()
				.get("customer");

		Myrequest myrequest = form.get_myrequest(); // 得到myrequest并且保存
		myrequest.setRequestid(dao.MyrequestDao.find_max_requestid() + 1);
		dao.MyrequestDao.add_myrequest(myrequest);

		shoppingtype = form.get_shoppingtype(myrequest); // 将myreuqest对应的shoppingtype并且保存
		shoppingtype.setAmountTo((double) 100);
		shoppingtype.setRequestid(myrequest.getRequestid());
		dao.ShoppingTypeDao.add_shoppingtype(shoppingtype);

		restriction = form.get_restriction(myrequest); // 将myreuqest对应的restriction并且保存
		restriction.setRequestid(myrequest.getRequestid());
		dao.RestrictionDao.add_restriction(restriction);

		// 产生新的一个order
		Set myrequest_set = new HashSet();
		myrequest_set.add(myrequest);

		myorder = new Myorder(customer, 1, new Date(), myrequest.getPrice(), 1,
				myrequest.getAmount(), myrequest.getWeight(), myrequest_set);
		dao.MyorderDao.add_order(myorder); // 将order保存至数据库
		shoppingtype.setRequestid(-1); // 将order对应的restriction和shoppingtype保存
		restriction.setRequestid(-1);
		shoppingtype.setOrderid(myorder.getOrderid());
		restriction.setOrderid(myorder.getOrderid());
		dao.ShoppingTypeDao.add_shoppingtype(shoppingtype);
		dao.RestrictionDao.add_restriction(restriction);

		myrequest.getMyorders().add(myorder);// 将myorder与myrequest保存至关系表
		dao.MyrequestDao.modify_myrequest(myrequest);
	}

	private void match_and_put_it_to_request() {// 得到匹配列表并存入request
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
			if (value != -1) {
				Match match = new Match(value, temp_myorder, temp_shoppingtype,
						temp_restriction, customer);
				match_list.add(match);
				System.out.println(match.getMyorder().getOrderid());
			}
		}

		Collections.sort(match_list, new ComparatorMatch()); // 对match_list加权排序
		if (match_list.size() >= 5)
			match_list = match_list.subList(0, 5);

		List<Myrequest> new_myrequest_list = new ArrayList();
		List<ShoppingType> new_shoppingtype_list = new ArrayList();
		List<Restriction> new_restriction_list = new ArrayList();
		List<Customer> new_customer_list = new ArrayList();

		Iterator<Match> new_it = match_list.iterator();
		while (new_it.hasNext()) {

			Match match = (Match) new_it.next();
			new_myrequest_list.add(match.getMyrequest());
			new_shoppingtype_list.add(match.getShoppingtype());
			new_restriction_list.add(match.getRestriction());
			new_customer_list.add(match.getCustomer());

		}

		ActionContext.getContext().put("myrequest_list", new_myrequest_list);
		ActionContext.getContext().put("shoppingtype_list",
				new_shoppingtype_list);
		ActionContext.getContext()
				.put("restriction_list", new_restriction_list);
		ActionContext.getContext().put("customer_list", new_customer_list);

		ActionContext.getContext().getSession().put("match_list", match_list);
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		save_form();
		match_and_put_it_to_request();
		return "success";
	}
}
