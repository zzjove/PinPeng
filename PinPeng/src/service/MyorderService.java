package service;

import dao.MyorderDao;
import domain.Myorder;

public class MyorderService {
	private MyorderDao orderDao = new MyorderDao();

	// ����order idɾ��order
	public void delete(int orderid) {
		Myorder order = orderDao.findby_orderid(orderid);
		order.setStatus(0);
		// orderDao.update(order.getOrderid());
	}

	// ����order id �õ�order
	public Myorder get(int orderid) {
		Myorder order = orderDao.findby_orderid(orderid);
		return order;
	}

	public void update(Myorder myorder) {
		orderDao.modify_order(myorder);
	}
}
