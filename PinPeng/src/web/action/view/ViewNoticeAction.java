package web.action.view;

import java.util.ArrayList;
import java.util.List;

import service.MessageService;
import service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;
import domain.Message;
import domain.MessageBox;

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
		//UserService userService = new UserService();
		Customer customer = (Customer) ActionContext.getContext().getSession()
				.get("customer");
		List<Message>messages = new ArrayList();
		List messageBoxes = new ArrayList();
		if (type == null || !type.equals("out")) {
			type = "in";
			// 收信
			messages = service.getInMsgByUserId(customer);
			ActionContext.getContext().put("type", "in");
		} else {
			// 发信
			messages = service.getOutMsgByUserId(customer);
			ActionContext.getContext().put("type", "out");
		}
		for(Message message : messages){
			MessageBox tempBox = new MessageBox();
			tempBox.setContent(message.getContent());
			tempBox.setSendTime(message.getSendTime().toString());			
			tempBox.setSend(message.getCustomerByCustomerid().getName());
			tempBox.setSendTo(message.getCustomerBySendTo().getName());
			tempBox.setSendid(message.getCustomerByCustomerid().getCustomerid());
			tempBox.setSendToid(message.getCustomerBySendTo().getCustomerid());
			messageBoxes.add(tempBox);
		}
		ActionContext.getContext().put("messageBoxes", messageBoxes);
		return "success";
	}

}
