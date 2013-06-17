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

		// 得到当前customer
		Customer customer = (Customer) ActionContext.getContext().getSession()
				.get("customer");

		Myrequest myrequest = form.get_myrequest(); // 得到myrequest并且保存
		myrequest.setRequestid(dao.MyrequestDao.find_max_requestid() + 1);
		dao.MyrequestDao.add_myrequest(myrequest);

		ShoppingType shoppingtype = form.get_shoppingtype(myrequest); // 将myreuqest对应的shoppingtype并且保存
		shoppingtype.setAmountTo((double) 100);
		shoppingtype.setRequestid(myrequest.getRequestid());
		dao.ShoppingTypeDao.add_shoppingtype(shoppingtype);

		Restriction restriction = form.get_restriction(myrequest); // 将myreuqest对应的restriction并且保存
		restriction.setRequestid(myrequest.getRequestid());
		dao.RestrictionDao.add_restriction(restriction);

		// 产生新的一个order
		Set myrequest_set = new HashSet();
		myrequest_set.add(myrequest);
		// Set shoppingtype_set = new HashSet();
		// shoppingtype_set.add(shoppingtype);
		// Set restriction_set = new HashSet();
		// restriction_set.add(restriction);

		Myorder myorder = new Myorder(customer, 1, new Date(),
				myrequest.getPrice(), 1, myrequest.getAmount(),
				myrequest.getWeight(), myrequest_set);
		dao.MyorderDao.add_order(myorder); // 将order保存至数据库
		shoppingtype.setRequestid(-1); //
		// 将order对应的restriction和shoppingtype保存
		restriction.setRequestid(-1);
		shoppingtype.setOrderid(myorder.getOrderid());
		restriction.setOrderid(myorder.getOrderid());
		dao.ShoppingTypeDao.add_shoppingtype(shoppingtype);
		dao.RestrictionDao.add_restriction(restriction);

		return "success";
	}
}
