package web.action.control;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import service.UserService;
import web.formbean.RegisterForm;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;

public class RegisterAction extends ActionSupport {

	private String randomNum;
	private static Cookie cookie = null;

	public String getRandomNum() {
		return randomNum;
	}

	public void setRandomNum(String randomNum) {
		this.randomNum = randomNum;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		randomNum = (String) request.getSession().getAttribute("randomNum");
		RegisterForm form = utils.WebUtils.requestToBean(request,
				RegisterForm.class);
		form.setRandomNum(randomNum);
		boolean check = form.vaild();
		if(!check){
			request.setAttribute("form", form);
			return "error";
		}
		//�ж����ݿ����Ƿ���ڸ��û�
		UserService service = new UserService();
		if(service.isExist(Integer.parseInt(form.getStudentid()))){
			form.getErrors().put("studentid", "���û��Ѿ�����");
			request.setAttribute("form", form);
			return "error";
		}
		//
		Customer customer=form.get_customer();
		service.add(customer);
		ActionContext.getContext().getSession().put("customer", customer);
		return "success";
	}
}
