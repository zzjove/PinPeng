package web.action.control;

import java.util.Iterator;

import utils.DisplayRequest;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;
import domain.Myrequest;

public class PreferOrderAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Myrequest myrequest = dao.MyrequestDao
				.findby_requestid(((DisplayRequest) ActionContext.getContext()
						.getSession().get("otherRequest")).getRequestid());
		Customer customer = dao.CustomerDao.findby_customerid(2);
		customer.getMyrequests().add(myrequest);
		dao.CustomerDao.mofidy_customer(customer);
		Customer temp = dao.CustomerDao.findby_customerid(2);
		Iterator it = temp.getMyrequests().iterator();
		// System.out.println(111111111);
		while (it.hasNext()) {
			Myrequest t = (Myrequest) it.next();
			// System.out.println(t.getRequestid());
		}
		return "success";
	}
}
