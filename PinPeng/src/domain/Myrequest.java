package domain;

import java.sql.Timestamp;
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
	private Double price;
	private Integer status;
	private Integer amount;
	private Integer weight;
	private Set restrictions = new HashSet(0);
	private Set shoppingTypes = new HashSet(0);
	private Set preferences = new HashSet(0);
	private Set orderRequestsForToRequestid = new HashSet(0);
	private Set orderRequestsForRequestid = new HashSet(0);

	// Constructors

	/** default constructor */
	public Myrequest() {
	}

	/** minimal constructor */
	public Myrequest(Customer customer, Timestamp myrequestTime, Double price,
			Integer status, Integer amount, Integer weight) {
		this.customer = customer;
		this.myrequestTime = myrequestTime;
		this.price = price;
		this.status = status;
		this.amount = amount;
		this.weight = weight;
	}

	/** full constructor */
	public Myrequest(Customer customer, Timestamp myrequestTime,
			String content, Double price, Integer status, Integer amount,
			Integer weight, Set restrictions, Set shoppingTypes,
			Set preferences, Set orderRequestsForToRequestid,
			Set orderRequestsForRequestid) {
		this.customer = customer;
		this.myrequestTime = myrequestTime;
		this.content = content;
		this.price = price;
		this.status = status;
		this.amount = amount;
		this.weight = weight;
		this.restrictions = restrictions;
		this.shoppingTypes = shoppingTypes;
		this.preferences = preferences;
		this.orderRequestsForToRequestid = orderRequestsForToRequestid;
		this.orderRequestsForRequestid = orderRequestsForRequestid;
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

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
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

	public Set getRestrictions() {
		return this.restrictions;
	}

	public void setRestrictions(Set restrictions) {
		this.restrictions = restrictions;
	}

	public Set getShoppingTypes() {
		return this.shoppingTypes;
	}

	public void setShoppingTypes(Set shoppingTypes) {
		this.shoppingTypes = shoppingTypes;
	}

	public Set getPreferences() {
		return this.preferences;
	}

	public void setPreferences(Set preferences) {
		this.preferences = preferences;
	}

	public Set getOrderRequestsForToRequestid() {
		return this.orderRequestsForToRequestid;
	}

	public void setOrderRequestsForToRequestid(Set orderRequestsForToRequestid) {
		this.orderRequestsForToRequestid = orderRequestsForToRequestid;
	}

	public Set getOrderRequestsForRequestid() {
		return this.orderRequestsForRequestid;
	}

	public void setOrderRequestsForRequestid(Set orderRequestsForRequestid) {
		this.orderRequestsForRequestid = orderRequestsForRequestid;
	}

}