package web.action.control;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Myrequest;

public class ConfirmRequestAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Myrequest myrequest= (Myrequest) ActionContext.getContext()
				.getSession().get("myrequestSelected");
		myrequest=dao.MyrequestDao.findby_requestid(10);//Test
		Myrequest otherRequest = (Myrequest) ActionContext.getContext()
				.getSession().get("otherRequestClass");
		
		myrequest.setStatus(2);
		dao.MyrequestDao.modify_myrequest(myrequest);
		myrequest.getMyorders().iterator();
		
		
		return "success";
	}
}
