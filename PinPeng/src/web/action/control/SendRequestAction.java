package web.action.control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import sun.print.resources.serviceui;
import utils.ComparatorMatch;
import utils.Match;
import web.formbean.SendRequestForm;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;

import domain.Customer;
import domain.Myrequest;
import domain.Myorder;
import domain.Restriction;
import domain.ShoppingType;

public class SendRequestAction extends ActionSupport {

	private Myrequest myrequest = new Myrequest();
	private ShoppingType shoppingtype = new ShoppingType();
	private Restriction restriction = new Restriction();
	private Customer customer = new Customer();
	private Myorder myorder = new Myorder();

	private void get_form_and_saveit() { // ��form�еõ���Ϣ���������ݿ�
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		SendRequestForm form = utils.WebUtils.requestToBean(request,
				SendRequestForm.class);

		// �õ���ǰcustomer
		customer = (Customer) ActionContext.getContext().getSession()
				.get("customer");

		myrequest = form.get_myrequest(); // �õ�myrequest���ұ���
		myrequest.setRequestid(dao.MyrequestDao.find_max_requestid() + 1);
		dao.MyrequestDao.add_myrequest(myrequest);

		shoppingtype = form.get_shoppingtype(myrequest); // �õ�shoppingtype���ұ���
		shoppingtype.setAmountTo((double) 100);
		dao.ShoppingTypeDao.add_shoppingtype(shoppingtype);

		restriction = form.get_restriction(myrequest); // �õ�restriction���ұ���
		dao.RestrictionDao.add_restriction(restriction);

		// �����µ�һ��order
		Set myrequest_set = new HashSet();
		myrequest_set.add(myrequest);
		Set shoppingtype_set = new HashSet();
		shoppingtype_set.add(shoppingtype);
		Set restriction_set = new HashSet();
		restriction_set.add(restriction);

		myorder = new Myorder(customer, 1, new Date(), myrequest.getPrice(), 1,
				myrequest.getAmount(), myrequest.getWeight(), shoppingtype_set,
				myrequest_set, restriction_set);
		dao.MyorderDao.add_order(myorder); // ��order���������ݿ�

	}

	private void set_to_session() { // ��form�е���Ϣ����session

		ActionContext.getContext().getSession().put("myrequest", myrequest); // ȫ������session
		ActionContext.getContext().getSession()
				.put("shoppingtype", shoppingtype);
		ActionContext.getContext().getSession().put("restriction", restriction);

		// ��storeת�����ַ��������session
		ActionContext
				.getContext()
				.getSession()
				.put("store",
						utils.DataConverter
								.convert_shoppingstore(shoppingtype
										.getShoppingStore()));

		// ���Ƿ��޶�����ת�����ַ��������session
		ActionContext
				.getContext()
				.getSession()
				.put("dormlimited",
						utils.DataConverter.convert_yes_no(restriction
								.getDormLimited()));

		// ���Ƿ��޶�������ת�����ַ��������session
		ActionContext
				.getContext()
				.getSession()
				.put("payer",
						utils.DataConverter.convert_me_other(restriction
								.getPayer()));

		// ���Ƿ��޶�ȡ����ת�����ַ��������session
		ActionContext
				.getContext()
				.getSession()
				.put("othertakelimited",
						utils.DataConverter.convert_me_other(restriction
								.getOthertakeLimited()));

		// ���Ƿ�Ҫ����ת�����ַ��������session
		ActionContext
				.getContext()
				.getSession()
				.put("goodsfree",
						utils.DataConverter.convert_me_other(restriction
								.getGoodsFree()));

		// ���Ա�ת�����ַ��������session
		ActionContext
				.getContext()
				.getSession()
				.put("manlimited",
						utils.DataConverter.convert_me_other(restriction
								.getManLimited()));

		// ���Ƿ��޹�ת�����ַ��������session
		ActionContext
				.getContext()
				.getSession()
				.put("buylimited",
						utils.DataConverter.convert_yes_no(restriction
								.getBuyLimited()));
	}

	// private void get_match_request_list() { // �õ�ƥ���б�
	// List<Myrequest> myrequest_list = dao.MyrequestDao
	// .find_valid_request_list(); // �ҵ���ƥ���request
	// List<Match> match_list = new ArrayList<Match>();
	//
	// myrequest = dao.MyrequestDao.findby_requestid(33);
	// shoppingtype = dao.ShoppingTypeDao.findby_requestid(33);
	// restriction = dao.RestrictionDao.findby_requestid(33);
	//
	// Iterator<Myrequest> it = myrequest_list.iterator();
	// while (it.hasNext()) {
	//
	// Myrequest temp_myrequest = (Myrequest) it.next();
	// ShoppingType temp_shoppingtype = dao.ShoppingTypeDao
	// .findby_requestid(temp_myrequest.getRequestid());
	// Restriction temp_restriction = dao.RestrictionDao
	// .findby_requestid(temp_myrequest.getRequestid());
	// Customer temp_customer = temp_myrequest.getCustomer();
	//
	// int value = service.CalculateConverter.get_match_value(myrequest,
	// temp_myrequest, shoppingtype, temp_shoppingtype,
	// restriction, temp_restriction);
	//
	// if (value != -1) {
	// Match match = new Match(value, temp_myrequest,
	// temp_shoppingtype, temp_restriction, temp_customer);
	// match_list.add(match);
	// }
	// }
	//
	// Collections.sort(match_list, new ComparatorMatch()); // ��match_list��Ȩ����
	// if (match_list.size() >= 5)
	// match_list = match_list.subList(0, 5);
	//
	// List<Myrequest> new_myrequest_list = new ArrayList();
	// List<ShoppingType> new_shoppingtype_list = new ArrayList();
	// List<Restriction> new_restriction_list = new ArrayList();
	// List<Customer> new_customer_list = new ArrayList();
	//
	// Iterator<Match> new_it = match_list.iterator();
	// while (new_it.hasNext()) {
	//
	// Match match = (Match) new_it.next();
	// new_myrequest_list.add(match.getMyrequest());
	// new_shoppingtype_list.add(match.getShoppingtype());
	// new_restriction_list.add(match.getRestriction());
	// new_customer_list.add(match.getCustomer());
	//
	// }
	//
	// ActionContext.getContext().getSession()
	// .put("myrequest_list", new_myrequest_list);
	// ActionContext.getContext().getSession()
	// .put("shoppingtype_list", new_shoppingtype_list);
	// ActionContext.getContext().getSession()
	// .put("restriction_list", new_restriction_list);
	// ActionContext.getContext().getSession()
	// .put("customer_list", new_customer_list);
	//
	// ActionContext.getContext().getSession().put("match_list", match_list);
	//
	// }

	private void get_match_order_list() {
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

		Collections.sort(match_list, new ComparatorMatch()); // ��match_list��Ȩ����
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

		ActionContext.getContext().getSession()
				.put("myrequest_list", new_myrequest_list);
		ActionContext.getContext().getSession()
				.put("shoppingtype_list", new_shoppingtype_list);
		ActionContext.getContext().getSession()
				.put("restriction_list", new_restriction_list);
		ActionContext.getContext().getSession()
				.put("customer_list", new_customer_list);

		ActionContext.getContext().getSession().put("match_list", match_list);
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub

		get_form_and_saveit();
		set_to_session();
		get_match_order_list();

		return "success";
	}

}
