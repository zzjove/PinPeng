package domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Myorder entity. @author MyEclipse Persistence Tools
 */

public class Myorder implements java.io.Serializable {

	// Fields

	private Integer orderid;
	private Customer customer;
	private Integer status;
	private Date beginTime;
	private double price;
	private Integer numberPeople;
	private Integer amount;
	private double weight;
	private ShoppingType shoppingType;
	private Set myrequests = new HashSet(0);
	private Restriction restriction;

	// Constructors

	/** default constructor */
	public Myorder() {
	}

	/** minimal constructor */
	public Myorder(Customer customer, Integer status, Date beginTime,
			double price, Integer numberPeople) {
		this.customer = customer;
		this.status = status;
		this.beginTime = beginTime;
		this.price = price;
		this.numberPeople = numberPeople;
	}

	/** full constructor */
	public Myorder(Customer customer, Integer status, Date beginTime,
			double price, Integer numberPeople, Integer amount, double weight,
			ShoppingType shoppingType, Set myrequests, Restriction restriction) {
		this.customer = customer;
		this.status = status;
		this.beginTime = beginTime;
		this.price = price;
		this.numberPeople = numberPeople;
		this.amount = amount;
		this.weight = weight;
		this.shoppingType = shoppingType;
		this.myrequests = myrequests;
		this.restriction = restriction;
	}

	// Property accessors

	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getNumberPeople() {
		return this.numberPeople;
	}

	public void setNumberPeople(Integer numberPeople) {
		this.numberPeople = numberPeople;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public ShoppingType getShoppingType() {
		return this.shoppingType;
	}

	public void setShoppingType(ShoppingType shoppingType) {
		this.shoppingType = shoppingType;
	}

	public Set getMyrequests() {
		return this.myrequests;
	}

	public void setMyrequests(Set myrequests) {
		this.myrequests = myrequests;
	}

	public Restriction getRestriction() {
		return this.restriction;
	}

	public void setRestriction(Restriction restriction) {
		this.restriction = restriction;
	}

}