package web.action.view;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;

public class ViewSpaceAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Customer customer = (Customer) ActionContext.getContext().getSession()
				.get("customer");
		List myrequest_list = dao.MyrequestDao.findby_customerid(customer
				.getCustomerid());
		ActionContext.getContext().getSession()
				.put("myrequest_list", myrequest_list);
		
		return "success";
	}
}
