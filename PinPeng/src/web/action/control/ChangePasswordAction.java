package web.action.control;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import service.UserService;
import web.formbean.ChangePasswordForm;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;

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
		HttpServletRequest request = ServletActionContext.getRequest();
		ChangePasswordForm form = utils.WebUtils.requestToBean(request, ChangePasswordForm.class);
		boolean check = form.vaild();
		//校验失败跳回表单提交页面，回显信息
		if(!check){
			request.setAttribute("form", form);
			return "error";
		}
		customer = dao.CustomerDao.loginby_studentid_pw(customer.getCustomerid(),
				form.getNewpassword1());

		if (customer == null) {
			form.getErrors().put("oldpassword", "原密码输入有误");
			request.setAttribute("form", form);
			return "error";
		}
		customer.setPassword(newpassword1);
		UserService service = new UserService();
		service.updateUser(customer);
		ActionContext.getContext().put("systemMsg", "密码修改成功！");
		return "success";
	}

	


}
