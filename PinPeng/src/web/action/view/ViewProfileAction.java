package web.action.view;

import com.opensymphony.xwork2.ActionSupport;

public class ViewProfileAction extends ActionSupport {
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String execute() throws Exception {
		if(type.equals("view"))
			return "view";
		return "edit";
	}
}
