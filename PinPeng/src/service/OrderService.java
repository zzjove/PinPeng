package service;

import dao.MyorderDao;
import domain.Myorder;

public class OrderService {
		private MyorderDao orderDao = new MyorderDao();
		//¸ù¾Ýorder idÉ¾³ýorder
		public void delete(int orderid){
			Myorder order = orderDao.findby_orderid(orderid);
			order.setStatus(0);
			//orderDao.update(order.getOrderid());
		}
}
