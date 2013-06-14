package web.action.control;

import utils.DisplayRequest;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Myrequest;
import domain.Restriction;
import domain.ShoppingType;

public class CheckRequestAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Myrequest otherRequest = dao.MyrequestDao.findby_requestid(10);
		ShoppingType shoppingtype = dao.ShoppingTypeDao.findby_requestid(10);
		Restriction restriction = dao.RestrictionDao.findby_requestid(10);

		otherRequest.setShoppingType(shoppingtype);
		otherRequest.setRestriction(restriction);

		DisplayRequest displayRequest = new DisplayRequest();
		displayRequest.toDisplay(otherRequest, shoppingtype, restriction);

		ActionContext.getContext().getSession()
				.put("otherRequest", displayRequest);
		ActionContext.getContext().getSession()
				.put("otherRequestClass", otherRequest);

		return "success";
	}
}
