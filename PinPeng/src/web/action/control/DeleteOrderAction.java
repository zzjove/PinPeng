package web.action.control;

import service.MyrequestService;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteOrderAction extends ActionSupport {
	private int requestid;
	public int getRequestid() {
		return requestid;
	}
	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}
	@Override
	public String execute() throws Exception {
		//检查id是否合法
		//。。。
		MyrequestService requestService = new MyrequestService();
		requestService.delete(requestid);
		return "success";
	}
}