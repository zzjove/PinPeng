package web.action.view;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ViewSendrequestAction extends ActionSupport {	
	private String type;
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String execute() throws Exception {
		//���޸�
		if(type!= null && type.equals("change"))
			return "success";
		//����ɾ��session�е�form
		ActionContext.getContext().getSession().remove("form");
		return "success";
	}

}
