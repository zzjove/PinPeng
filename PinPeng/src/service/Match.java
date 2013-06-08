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
	private Myorder myorder;

	public Match(int value, Myrequest myrequest, ShoppingType shoppingtype,
			Restriction restriction, Customer customer) {
		this.value = value;
		this.myrequest = myrequest;
		this.shoppingtype = shoppingtype;
		this.restriction = restriction;
		this.customer = customer;
	}

	public Match(int value, Myorder myorder, ShoppingType shoppingtype,
			Restriction restriction, Customer customer) {
		this.value = value;
		this.myorder = myorder;
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

	public ShoppingType getShoppingtype() {
		return shoppingtype;
	}

	public void setShoppingtype(ShoppingType shoppingtype) {
		this.shoppingtype = shoppingtype;
	}

	public Myorder getMyorder() {
		return myorder;
	}

	public void setMyorder(Myorder myorder) {
		this.myorder = myorder;
	}
}
