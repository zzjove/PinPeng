package web.action.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import web.formbean.SendRequestForm;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Myrequest;
import domain.Order;
import domain.Restriction;
import domain.ShoppingType;

public class SendRequestAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		SendRequestForm form = utils.WebUtils.requestToBean(request,
				SendRequestForm.class);

		// Customer
		// customer=(Customer)ActionContext.getContext().getSession().get("customer");

		Myrequest myrequest = form.get_myrequest();
		dao.MyrequestDao.add_myrequest(myrequest);

		ShoppingType shoppingtype = form.get_shoppingtype(myrequest);
		dao.ShoppingTypeDao.add_shoppingtype(shoppingtype);

		Restriction restriction = form.get_restriction(myrequest);
		dao.RestrictionDao.add_restriction(restriction);
		
		Order order=form.get_order(myrequest);
		

		ActionContext.getContext().getSession().put("myrequest", myrequest);
		ActionContext.getContext().getSession()
				.put("shoppingtype", shoppingtype);
		ActionContext.getContext().getSession().put("restriction", restriction);

		return "success";
	}

}
