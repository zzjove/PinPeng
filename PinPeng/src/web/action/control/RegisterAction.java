package web.action.control;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import web.formbean.RegisterForm;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	private String randomNum;
	private static Cookie cookie = null;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		randomNum = (String) request.getSession().getAttribute("randomNum");
		RegisterForm form = utils.WebUtils.requestToBean(request,
				RegisterForm.class);
		form.setRandomNum(randomNum);

		System.out.println(form.get_customer().getName());
		dao.CustomerDao.add_customer(form.get_customer());

		return "success";
	}
}
