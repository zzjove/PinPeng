package web.action.control;

import java.util.Iterator;

import service.MyrequestService;
import utils.DisplayRequest;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;
import domain.Myrequest;

public class PreferOrderAction extends ActionSupport {

	int requestId;

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Customer customer = (Customer) ActionContext.getContext().getSession()
				.get("customer");
		MyrequestService myrequestService = new MyrequestService();
		Myrequest myrequest = myrequestService
				.getRequest_by_requestid(requestId);

		myrequest.getCustomers().add(customer);
		myrequestService.update(myrequest);

		ActionContext.getContext().put("systemMsg", " ’≤ÿ≥…π¶");

		return "success";
	}
}
