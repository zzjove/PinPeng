package web.action.control;

import java.util.Iterator;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;

public class MakeFriends extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		// Customer customer = (Customer)
		// ActionContext.getContext().getSession()
		// .get("customer");
		// customer = dao.CustomerDao.findby_customerid(2);
		// Customer otherCustomer = dao.CustomerDao.findby_customerid(17);
		//
		// customer.getCustomersForCustomeridB().add(otherCustomer);
		// otherCustomer.getCustomersForCustomeridB().add(customer);
		// dao.CustomerDao.mofidy_customer(customer);
		// dao.CustomerDao.mofidy_customer(otherCustomer);
		//
		// if (customer.getCustomersForCustomeridB().isEmpty()) {
		// System.out.println("CUstomeridB is empty!!!");
		// }
		//
		// // =========================test
		// Customer newcustomer = dao.CustomerDao.findby_customerid(2);
		// if (newcustomer.getCustomersForCustomeridB().isEmpty()) {
		// System.out.println("new CUstomeridB is empty!!!");
		// }
		// Iterator it = customer.getCustomersForCustomeridB().iterator();
		// while (it.hasNext()) {
		// Customer temp = (Customer) it.next();
		// System.out.println(temp.getStudentid());
		// }

		return "success";
	}

}
