package domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Request entity. @author MyEclipse Persistence Tools
 */

public class Request implements java.io.Serializable {

	// Fields

	private Integer requestid;
	private Customer customer;
	private Timestamp requestTime;
	private String content;
	private Double price;
	private Set restrictions = new HashSet(0);
	private Set shoppingTypes = new HashSet(0);
	private Set preferences = new HashSet(0);
	private Set orderRequests = new HashSet(0);

	// Constructors

	/** default constructor */
	public Request() {
	}

	/** minimal constructor */
	public Request(Customer customer, Timestamp requestTime, Double price) {
		this.customer = customer;
		this.requestTime = requestTime;
		this.price = price;
	}

	/** full constructor */
	public Request(Customer customer, Timestamp requestTime, String content,
			Double price, Set restrictions, Set shoppingTypes, Set preferences,
			Set orderRequests) {
		this.customer = customer;
		this.requestTime = requestTime;
		this.content = content;
		this.price = price;
		this.restrictions = restrictions;
		this.shoppingTypes = shoppingTypes;
		this.preferences = preferences;
		this.orderRequests = orderRequests;
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

	public Timestamp getRequestTime() {
		return this.requestTime;
	}

	public void setRequestTime(Timestamp requestTime) {
		this.requestTime = requestTime;
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

	public Set getOrderRequests() {
		return this.orderRequests;
	}

	public void setOrderRequests(Set orderRequests) {
		this.orderRequests = orderRequests;
	}

}