package web.action.control;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.util.GetConstructor;

import service.MyorderService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.MyrequestDao;
import domain.Customer;
import domain.Myorder;
import domain.Myrequest;

public class CheckOrderAction extends ActionSupport {
	private int orderid;
	private int requestid;

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getRequestid() {
		return requestid;
	}

	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}

	@Override
	public String execute() throws Exception {
		MyorderService orderService = new MyorderService();
		Myorder order = orderService.get(orderid);

		List<Myrequest> requests = dao.MyrequestDao.findby_orderid(orderid);

		//
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		c1.setName("Mary");
		c2.setName("Bob");
		c3.setName("Peter");

		//
		Myrequest mr1 = new Myrequest();
		mr1.setAmount(10);
		mr1.setContent("aaa");
		mr1.setPrice(100);
		mr1.setWeight(20);
		mr1.setRequestid(1);
		mr1.setCustomer(c1);
		Myrequest mr2 = new Myrequest();
		mr2.setAmount(5);
		mr2.setContent("bbb");
		mr2.setPrice(200);
		mr2.setWeight(30);
		mr2.setRequestid(2);
		mr2.setCustomer(c2);
		Myrequest mr3 = new Myrequest();
		mr3.setAmount(3);
		mr3.setContent("ccc");
		mr3.setPrice(150);
		mr3.setWeight(2);
		mr3.setRequestid(5);
		mr3.setCustomer(c3);

		requests.add(mr1);
		requests.add(mr2);
		requests.add(mr3);
		ActionContext.getContext().put("requests", requests);
		ActionContext.getContext().put("order", order);
		ActionContext.getContext().put("orderid", orderid);
		ActionContext.getContext().put("requestid", requestid);
		System.out.println("-----------------CheckOrderAction");
		System.out.println("orderid:" + orderid + "    requestid:" + requestid);
		return "success";
	}
}