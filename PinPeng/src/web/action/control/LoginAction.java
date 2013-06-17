package web.action.control;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import web.formbean.LoginForm;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;

public class LoginAction extends ActionSupport {

	private Customer user;
	
	private String randomNum;



	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		randomNum = (String) request.getSession().getAttribute("randomNum");
		LoginForm form = utils.WebUtils.requestToBean(request, LoginForm.class);
		form.setRandomNum(randomNum);
		boolean check = form.vaild();
		//У��ʧ�����ر��ύҳ�棬������Ϣ
		if(!check){
			request.setAttribute("form", form);
			return "error";
		}
		int studentid = Integer.parseInt(form.getCustomer());
		user = dao.CustomerDao.loginby_studentid_pw(studentid,
				form.getPassword());

		if (user == null) {
			form.getErrors().put("username", "�û��������벻ƥ��");
			request.setAttribute("form", form);
			return "error";
		}

		ActionContext.getContext().getSession().put("customer", user);
		return "success";
		
	}

}
