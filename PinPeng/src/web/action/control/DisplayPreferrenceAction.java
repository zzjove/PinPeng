package web.action.control;

import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;

public class DisplayPreferrenceAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub

		Customer customer = (Customer) ActionContext.getContext().getSession()
				.get("customer");

		Set preferrenceSet = customer.getMyrequests();

		return "success";
	}

}
