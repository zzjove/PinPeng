package web.action.control;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import web.formbean.SendNoticeForm;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;
import domain.Message;

public class SendNoticeAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		SendNoticeForm form = utils.WebUtils.requestToBean(request,
				SendNoticeForm.class);

		Customer customer = (Customer) ActionContext.getContext().getSession()
				.get("customer"); // 得到寄出人的customer
		Customer send_to_customer = dao.CustomerDao.findby_name(form
				.getSend_to()); // 得到收件人的customer

		if (send_to_customer != null) {
			Message message = new Message(send_to_customer, customer,
					form.getContent(), new Date(), false);
			dao.MessageDao.add_message(message);
		}

		return "success";
	}
}
