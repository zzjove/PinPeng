package service;

import dao.CustomerDao;
import domain.Customer;

public class UserService {
	private CustomerDao customerDao = new CustomerDao();
	//�����û���Ϣ
	public void updateUser(Customer customer){
		customerDao.mofidy_customer(customer);
	}
}
