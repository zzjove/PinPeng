package web.action.view;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.MyorderDao;
import domain.Customer;

public class ViewSpaceAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		MyorderDao dao = new MyorderDao();
		List orders = dao.find_valid_order_list();
		System.out.println(orders.size());
		ActionContext.getContext().put("orders", orders);
		return "success";
	}
}
