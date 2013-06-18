package service;

import dao.ShoppingTypeDao;
import domain.ShoppingType;

public class ShoppingTypeService {
	private ShoppingTypeDao dao = new ShoppingTypeDao();
	public ShoppingType getShoppingType(int requestid){
		return  dao.findby_requestid(requestid);
	}
}
