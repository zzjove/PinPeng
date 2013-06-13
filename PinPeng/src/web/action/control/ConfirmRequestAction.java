package web.action.control;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Myrequest;

public class ConfirmRequestAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Myrequest myreuest=dao.MyrequestDao.findby_requestid(10);
		Myrequest otherRequest = (Myrequest) ActionContext.getContext()
				.getSession().get("otherRequestClass");
		
		
		
		
		return "success";
	}
}
