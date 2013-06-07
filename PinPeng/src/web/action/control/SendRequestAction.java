package web.action.control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import service.ComparatorMatch;
import service.Match;
import web.formbean.SendRequestForm;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;
import domain.Myrequest;
import domain.Order;
import domain.OrderRequest;
import domain.Restriction;
import domain.ShoppingType;

public class SendRequestAction extends ActionSupport {

	private Myrequest myrequest;
	private ShoppingType shoppingtype;
	private Restriction restriction;
	private Customer customer;

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
		Set customer_set = new HashSet();
		customer_set.add(customer);

		Order order = new Order(1, myrequest.getMyrequestTime(),
				restriction.getEndDay(), restriction.getMaxPeople(), 20,
				myrequest.getPrice(), 1, restriction.getPayment(),
				restriction.getPayer(), restriction.getDormLimited(),
				restriction.getOthertakeLimited(), restriction.getManLimited(),
				restriction.getBuyLimited(), restriction.getGoodsFree(),
				myrequest_set, customer_set);
		dao.OrderDao.add_order(order); // ��order���������ݿ�

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
						service.DataConverter
								.convert_shoppingstore(shoppingtype
										.getShoppingStore()));

		// ���Ƿ��޶�����ת�����ַ��������session
		ActionContext
				.getContext()
				.getSession()
				.put("dormlimited",
						service.DataConverter.convert_yes_no(restriction
								.getDormLimited()));

		// ���Ƿ��޶�������ת�����ַ��������session
		ActionContext
				.getContext()
				.getSession()
				.put("payer",
						service.DataConverter.convert_me_other(restriction
								.getPayer()));

		// ���Ƿ��޶�ȡ����ת�����ַ��������session
		ActionContext
				.getContext()
				.getSession()
				.put("othertakelimited",
						service.DataConverter.convert_me_other(restriction
								.getOthertakeLimited()));

		// ���Ƿ�Ҫ����ת�����ַ��������session
		ActionContext
				.getContext()
				.getSession()
				.put("goodsfree",
						service.DataConverter.convert_me_other(restriction
								.getGoodsFree()));

		// ���Ա�ת�����ַ��������session
		ActionContext
				.getContext()
				.getSession()
				.put("manlimited",
						service.DataConverter.convert_me_other(restriction
								.getManLimited()));

		// ���Ƿ��޹�ת�����ַ��������session
		ActionContext
				.getContext()
				.getSession()
				.put("buylimited",
						service.DataConverter.convert_yes_no(restriction
								.getBuyLimited()));
	}

	private void get_match_list() { // �õ�ƥ���б�
		List<Myrequest> myrequest_list = dao.MyrequestDao.find_valid_request();
		List<Match> match_list = new ArrayList<Match>();

		myrequest = dao.MyrequestDao.findby_requestid(33);
		shoppingtype = dao.ShoppingTypeDao.findby_requestid(33);
		restriction = dao.RestrictionDao.findby_requestid(33);

		Iterator<Myrequest> it = myrequest_list.iterator();
		while (it.hasNext()) {

			Myrequest temp_myrequest = (Myrequest) it.next();
			ShoppingType temp_shoppingtype = dao.ShoppingTypeDao
					.findby_requestid(temp_myrequest.getRequestid());
			Restriction temp_restriction = dao.RestrictionDao
					.findby_requestid(temp_myrequest.getRequestid());
			Customer temp_customer = temp_myrequest.getCustomer();

			int value = service.CalculateConverter.get_match_value(myrequest,
					temp_myrequest, shoppingtype, temp_shoppingtype,
					restriction, temp_restriction);

			if (value != -1) {
				Match match = new Match(value, temp_myrequest,
						temp_shoppingtype, temp_restriction, temp_customer);
				match_list.add(match);
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
			new_shoppingtype_list.add(match.getShoppingType());
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
		get_match_list();

		return "success";
	}

}
