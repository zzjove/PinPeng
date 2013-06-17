package domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Myrequest entity. @author MyEclipse Persistence Tools
 */

public class Myrequest implements java.io.Serializable {

	// Fields

	private Integer requestid;
	private Customer customer;
	private Date myrequestTime;
	private String content;
	private double price;
	private Integer status;
	private Integer amount;
	private Integer weight;
	private Set customers = new HashSet(0);
	private Set myorders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Myrequest() {
	}

	/** minimal constructor */
	public Myrequest(Customer customer, Date myrequestTime, double price,
			Integer status, Integer amount, Integer weight) {
		this.customer = customer;
		this.myrequestTime = myrequestTime;
		this.price = price;
		this.status = status;
		this.amount = amount;
		this.weight = weight;
	}

	/** full constructor */
	public Myrequest(Customer customer, Date myrequestTime, String content,
			double price, Integer status, Integer amount, Integer weight,
			Set customers, Set myorders) {
		this.customer = customer;
		this.myrequestTime = myrequestTime;
		this.content = content;
		this.price = price;
		this.status = status;
		this.amount = amount;
		this.weight = weight;
		this.customers = customers;
		this.myorders = myorders;
	}

	// Property accessors

	public Integer getRequestid() {
		return this.requestid;
	}

	public void setRequestid(Integer requestid) {
		this.requestid = requestid;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getMyrequestTime() {
		return this.myrequestTime;
	}

	public void setMyrequestTime(Date myrequestTime) {
		this.myrequestTime = myrequestTime;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Set getCustomers() {
		return this.customers;
	}

	public void setCustomers(Set customers) {
		this.customers = customers;
	}

	public Set getMyorders() {
		return this.myorders;
	}

	public void setMyorders(Set myorders) {
		this.myorders = myorders;
	}

}