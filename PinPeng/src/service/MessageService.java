package service;

import java.util.List;

import dao.MessageDao;
import domain.Customer;

public class MessageService {
	//private MessageDao messageDao = new MessageDao();
	//根据用户id找message
	public List getInMsgByUserId(Customer customer){
		return MessageDao.findby_sendto(customer.getCustomerid());
	}
	public List getOutMsgByUserId(Customer customer){
		return MessageDao.findby_customerid(customer.getCustomerid());
	}
}
