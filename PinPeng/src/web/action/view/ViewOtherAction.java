package web.action.view;

import service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;

public class ViewOtherAction extends ActionSupport {
	private int customerid;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	@Override
	public String execute() throws Exception {
		System.out.println(customerid);
		UserService service = new UserService();
		Customer customer = service.get(customerid);
		ActionContext.getContext().put("other", customer);
		return "success";
	}
}