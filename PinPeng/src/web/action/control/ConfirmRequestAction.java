package web.action.control;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import web.formbean.SendRequestForm;

import com.opensymphony.xwork2.ActionSupport;

public class ConfirmRequestAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		SendRequestForm form = utils.WebUtils.requestToBean(request,
				SendRequestForm.class);
		boolean check = form.vaild();
		// 校验失败跳回表单提交页面，回显信息
		if (!check) {
			request.setAttribute("form", form);
			return "error";
		}
		request.setAttribute("form", form);
		
		return "success";
	}
}
