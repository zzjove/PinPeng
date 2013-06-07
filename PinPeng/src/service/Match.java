package service;

import domain.Customer;
import domain.Myorder;
import domain.Myrequest;
import domain.Restriction;
import domain.ShoppingType;

public class Match {

	private int value;
	private Myrequest myrequest;
	private ShoppingType shoppingtype;
	private Restriction restriction;
	private Customer customer;
	private Myorder	myorder;

	public Match(int value, Myrequest myrequest, ShoppingType shoppingtype,
			Restriction restriction, Customer customer) {
		this.value = value;
		this.myrequest = myrequest;
		this.shoppingtype = shoppingtype;
		this.restriction = restriction;
		this.customer = customer;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Myrequest getMyrequest() {
		return myrequest;
	}

	public void setMyrequest(Myrequest myrequest) {
		this.myrequest = myrequest;
	}

	public ShoppingType getShoppingType() {
		return shoppingtype;
	}

	public void setShoppingType(ShoppingType shoppingType) {
		this.shoppingtype = shoppingType;
	}

	public Restriction getRestriction() {
		return restriction;
	}

	public void setRestriction(Restriction restriction) {
		this.restriction = restriction;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
