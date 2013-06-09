package service;

import java.util.List;

import dao.MessageDao;
import domain.Customer;

public class MessageService {
	private MessageDao messageDao = new MessageDao();
	//�����û�id��message
	public List getInMsgByUserId(Customer customer){
		return messageDao.findby_sendto(customer.getCustomerid());
	}
	public List getOutMsgByUserId(Customer customer){
		return messageDao.findby_customerid(customer.getCustomerid());
	}
}
