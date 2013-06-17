package web.action.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import service.UserService;

import web.formbean.RegisterForm;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;

public class UpdateProfileAction extends ActionSupport{

	private String email;
	private String qqNumber;
	private String telNumber;
	private int dormitory;
	public int getDormitory() {
		return dormitory;
	}
	public void setDormitory(int dormitory) {
		this.dormitory = dormitory;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQqNumber() {
		return qqNumber;
	}
	public void setQqNumber(String qqNumber) {
		this.qqNumber = qqNumber;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	@Override
	public String execute() throws Exception {		
		Customer customer = (Customer) ActionContext.getContext().getSession()
				.get("customer");
		
		customer.setEmail(email);
		customer.setQqNumber(qqNumber);
		customer.setTelNumber(telNumber);
		customer.setDormitory(dormitory);
		UserService service = new UserService();
		service.updateUser(customer);
		ActionContext.getContext().put("systemMsg", "个人资料修改成功！");
		return "success";
	}
}
