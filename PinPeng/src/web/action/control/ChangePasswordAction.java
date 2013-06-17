package web.action.control;

import service.UserService;
import utils.DisplayRequest;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;
import domain.Myrequest;
import domain.Restriction;
import domain.ShoppingType;

public class ChangePasswordAction extends ActionSupport {
	private String oldpassword;
	private String newpassword1;
	private String newpassword2;
	public String getOldpassword() {
		return oldpassword;
	}

	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}

	public String getNewpassword1() {
		return newpassword1;
	}

	public void setNewpassword1(String newpassword1) {
		this.newpassword1 = newpassword1;
	}

	public String getNewpassword2() {
		return newpassword2;
	}

	public void setNewpassword2(String newpassword2) {
		this.newpassword2 = newpassword2;
	}
	@Override
	public String execute() throws Exception {
		Customer customer = (Customer) ActionContext.getContext().getSession()
				.get("customer");
		//校验表单成功
		customer.setPassword(newpassword1);
		UserService service = new UserService();
		service.updateUser(customer);
		return "success";
	}

	


}
