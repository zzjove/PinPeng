package service;

import dao.MyorderDao;
import domain.Myorder;

public class OrderService {
		private MyorderDao orderDao = new MyorderDao();
		//����order idɾ��order
		public void delete(int orderid){
			Myorder order = orderDao.findby_orderid(orderid);
			order.setStatus(0);
			//orderDao.update(order.getOrderid());
		}
}
