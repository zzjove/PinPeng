package web.action.view;

import java.util.List;

import service.MyrequestService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.MyorderDao;
import domain.Customer;

public class ViewSpaceAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Customer customer = (Customer) ActionContext.getContext().getSession()
				.get("customer");
		MyrequestService service = new MyrequestService();
		List requests = service.getRequests(customer.getCustomerid());
		ActionContext.getContext().put("requests", requests);
		return "success";
	}
}
