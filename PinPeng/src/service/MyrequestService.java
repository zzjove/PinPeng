package service;

import java.util.List;

import dao.MyrequestDao;
import domain.Myorder;
import domain.Myrequest;

public class MyrequestService {
	private MyrequestDao requestDao = new MyrequestDao();

	public List getRequests(int userid) {
		return this.requestDao.findby_customerid(userid);
	}

	public void delete(int requestid) {
		Myrequest request = requestDao.findby_requestid(requestid);
		request.setStatus(0);
		requestDao.modify_myrequest(request);
	}

	public Myrequest getRequest_by_requestid(int requestid) {
		return this.requestDao.findby_requestid(requestid);
	}

	public void update(Myrequest myrequest) {
		requestDao.modify_myrequest(myrequest);
	}
}
