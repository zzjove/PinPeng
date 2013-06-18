package service;

import dao.CustomerDao;
import domain.Customer;

public class UserService {
	private CustomerDao customerDao = new CustomerDao();
	//�����û���Ϣ
	public void updateUser(Customer customer){
		customerDao.mofidy_customer(customer);
	}
	//����Ƿ�����û�
	public boolean isExist(int userid){
		Customer user = customerDao.findby_customerid(userid);
		if(user != null)
			return true;
		return false;
	}
	//����û�
	public void add(Customer customer){
		customerDao.add_customer(customer);
	}
}
