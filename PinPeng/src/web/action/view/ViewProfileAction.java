package web.action.view;

import web.formbean.UserProfileForm;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;

public class ViewProfileAction extends ActionSupport {
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String execute() throws Exception {
		if(type.equals("view"))
			return "view";
		Customer customer = (Customer) ActionContext.getContext().getSession().get("customer");
		UserProfileForm form = new UserProfileForm();
		form.setEmail(customer.getEmail());
		form.setDormitory(customer.getDormitory().toString());
		form.setQqNumber(customer.getQqNumber());
		form.setTelNumber(customer.getTelNumber());
		ActionContext.getContext().put("form", form);
		return "edit";
	}
}
