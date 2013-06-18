package service;

import dao.MyorderDao;
import domain.Myorder;

public class MyorderService {
	private MyorderDao orderDao = new MyorderDao();

	// 根据order id删除order
	public void delete(int orderid) {
		Myorder order = orderDao.findby_orderid(orderid);
		order.setStatus(0);
		// orderDao.update(order.getOrderid());
	}

	// 根据order id 得到order
	public Myorder get(int orderid) {
		Myorder order = orderDao.findby_orderid(orderid);
		return order;
	}

	public void update(Myorder myorder) {
		orderDao.modify_order(myorder);
	}
}
