package web.action.view;

import java.util.ArrayList;
import java.util.List;

import service.MessageService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;
import domain.Message;

public class ViewNoticeAction extends ActionSupport {

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String execute() throws Exception {
		MessageService service = new MessageService();
		Customer customer = (Customer) ActionContext.getContext().getSession()
				.get("customer");
		List messageBox = new ArrayList();
		if (type == null || !type.equals("out")) {
			type = "in";
			// 收信
			messageBox = service.getInMsgByUserId(customer);
		} else {
			// 发信
			messageBox = service.getOutMsgByUserId(customer);
		}
		ActionContext.getContext().put("messageBox", messageBox);
		return "success";
	}

}
