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
		if(type== null || !type.equals("out")){
			type = "in";
			//����	
			Message msg1 = new Message();
			msg1.setContent("aaa");
			Message msg2 = new Message();
			msg2.setContent("bbb");
			Message msg3 = new Message();
			msg3.setContent("ccc");
			messageBox.add(msg1);
			messageBox.add(msg2);
			messageBox.add(msg3);
		}
		else{
			//����
			Message msg1 = new Message();
			msg1.setContent("ddd");
			Message msg2 = new Message();
			msg2.setContent("eee");
			Message msg3 = new Message();
			msg3.setContent("fff");
			messageBox.add(msg1);
			messageBox.add(msg2);
			messageBox.add(msg3);
		}
		//List inMessage = service.getInMsgByUserId(customer);


		ActionContext.getContext().put("messageBox", messageBox);		

		return "success";
	}
	

}
