package service;

import dao.CustomerDao;
import domain.Customer;

public class UserService {
	private CustomerDao customerDao = new CustomerDao();
	//更新用户信息
	public void updateUser(Customer customer){
		customerDao.mofidy_customer(customer);
	}
	//检查是否存在用户
	public boolean isExist(int userid){
		Customer user = customerDao.findby_customerid(userid);
		if(user != null)
			return true;
		return false;
	}
	//添加用户
	public void add(Customer customer){
		customerDao.add_customer(customer);
	}
}
