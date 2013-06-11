package web.action.control;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PreferOrderAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		ActionContext.getContext().getSession().get("otherRequest");
		
		return "success";
	}

}
