package service;

import dao.CustomerDao;
import domain.Customer;

public class UserService {
	private CustomerDao customerDao = new CustomerDao();
	//更新用户信息
	public void updateUser(Customer customer){
		customerDao.mofidy_customer(customer);
	}
}
