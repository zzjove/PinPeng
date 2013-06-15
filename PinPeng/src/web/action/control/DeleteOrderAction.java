package web.action.control;

import service.OrderService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Myrequest;

public class DeleteOrderAction extends ActionSupport {
	private int orderid;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	@Override
	public String execute() throws Exception {
		//检查id是否合法
		//。。。
		OrderService orderService = new OrderService();
		orderService.delete(orderid);
		return "success";
	}
}