package web.action.control;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import web.formbean.SendRequestForm;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;
import domain.Myorder;
import domain.Myrequest;
import domain.Restriction;
import domain.ShoppingType;

public class MatchRequestAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub

		SendRequestForm form = (SendRequestForm) ActionContext.getContext()
				.getSession().get("form");

		// �õ���ǰcustomer
		Customer customer = (Customer) ActionContext.getContext().getSession()
				.get("customer");

		Myrequest myrequest = form.get_myrequest(); // �õ�myrequest���ұ���
		myrequest.setRequestid(dao.MyrequestDao.find_max_requestid() + 1);
		dao.MyrequestDao.add_myrequest(myrequest);

		ShoppingType shoppingtype = form.get_shoppingtype(myrequest); // ��myreuqest��Ӧ��shoppingtype���ұ���
		shoppingtype.setAmountTo((double) 100);
		shoppingtype.setRequestid(myrequest.getRequestid());
		dao.ShoppingTypeDao.add_shoppingtype(shoppingtype);

		Restriction restriction = form.get_restriction(myrequest); // ��myreuqest��Ӧ��restriction���ұ���
		restriction.setRequestid(myrequest.getRequestid());
		dao.RestrictionDao.add_restriction(restriction);

		// �����µ�һ��order
		Set myrequest_set = new HashSet();
		myrequest_set.add(myrequest);
		// Set shoppingtype_set = new HashSet();
		// shoppingtype_set.add(shoppingtype);
		// Set restriction_set = new HashSet();
		// restriction_set.add(restriction);

		Myorder myorder = new Myorder(customer, 1, new Date(),
				myrequest.getPrice(), 1, myrequest.getAmount(),
				myrequest.getWeight(), myrequest_set);
		dao.MyorderDao.add_order(myorder); // ��order���������ݿ�
		shoppingtype.setRequestid(-1); //
		// ��order��Ӧ��restriction��shoppingtype����
		restriction.setRequestid(-1);
		shoppingtype.setOrderid(myorder.getOrderid());
		restriction.setOrderid(myorder.getOrderid());
		dao.ShoppingTypeDao.add_shoppingtype(shoppingtype);
		dao.RestrictionDao.add_restriction(restriction);

		return "success";
	}
}
