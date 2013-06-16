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
		//若修改
		if(type!= null && type.equals("change"))
			return "success";
		//否则删除session中的form
		ActionContext.getContext().getSession().remove("form");
		return "success";
	}

}
