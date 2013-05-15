package web.action.control;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import web.formbean.LoginForm;

import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;

public class LoginAction extends ActionSupport {

	private Customer customer;
	private String randomNum;
	private static Cookie cookie = null;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		randomNum = (String) request.getSession().getAttribute("randomNum");
		LoginForm form = utils.WebUtils.requestToBean(request, LoginForm.class);
		form.setRandomNum(randomNum);

		int studentid = Integer.parseInt(form.getStudentid());
		customer = dao.CustomerDao.loginby_studentid_pw(studentid,
				form.getPassword());

		if (customer == null) {
			form.getErrors().put("name", "用户名与密码不匹配");
			request.setAttribute("form", form);
			return "error";
		}

		return "success";
	}

}
