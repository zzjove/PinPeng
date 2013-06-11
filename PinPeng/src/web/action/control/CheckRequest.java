package web.action.control;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import display.DisplayRequest;
import domain.Myrequest;
import domain.Restriction;
import domain.ShoppingType;

public class CheckRequest extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Myrequest otherRequest = dao.MyrequestDao.findby_requestid(10);
		ShoppingType shoppingtype=dao.ShoppingTypeDao.findby_requestid(10);
		Restriction restriction=dao.RestrictionDao.findby_requestid(10);
		
		DisplayRequest displayRequest=new DisplayRequest();
		displayRequest.toDisplay(otherRequest, shoppingtype, restriction);
		
		ActionContext.getContext().getSession()
				.put("otherRequest", displayRequest);
		return "success";
	}
}
