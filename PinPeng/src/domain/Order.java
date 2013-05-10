package domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer orderid;
	private Short status;
	private Timestamp beginTime;
	private Timestamp endTime;
	private Integer maxPeople;
	private Integer discountMoney;
	private Double price;
	private Set orderRequests = new HashSet(0);
	private Set customerOrders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Short status, Timestamp beginTime, Timestamp endTime,
			Integer maxPeople, Integer discountMoney, Double price) {
		this.status = status;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.maxPeople = maxPeople;
		this.discountMoney = discountMoney;
		this.price = price;
	}

	/** full constructor */
	public Order(Short status, Timestamp beginTime, Timestamp endTime,
			Integer maxPeople, Integer discountMoney, Double price,
			Set orderRequests, Set customerOrders) {
		this.status = status;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.maxPeople = maxPeople;
		this.discountMoney = discountMoney;
		this.price = price;
		this.orderRequests = orderRequests;
		this.customerOrders = customerOrders;
	}

	// Property accessors

	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Timestamp getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Timestamp beginTime) {
		this.beginTime = beginTime;
	}

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public Integer getMaxPeople() {
		return this.maxPeople;
	}

	public void setMaxPeople(Integer maxPeople) {
		this.maxPeople = maxPeople;
	}

	public Integer getDiscountMoney() {
		return this.discountMoney;
	}

	public void setDiscountMoney(Integer discountMoney) {
		this.discountMoney = discountMoney;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Set getOrderRequests() {
		return this.orderRequests;
	}

	public void setOrderRequests(Set orderRequests) {
		this.orderRequests = orderRequests;
	}

	public Set getCustomerOrders() {
		return this.customerOrders;
	}

	public void setCustomerOrders(Set customerOrders) {
		this.customerOrders = customerOrders;
	}

}