package domain;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer orderid;
	private Integer status;
	private Date beginTime;
	private Date endTime;
	private Integer maxPeople;
	private Integer discountMoney;
	private Double price;
	private Set orderRequests = new HashSet(0);

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Integer status, Timestamp beginTime, Integer maxPeople,
			Integer discountMoney, Double price) {
		this.status = status;
		this.beginTime = beginTime;
		this.maxPeople = maxPeople;
		this.discountMoney = discountMoney;
		this.price = price;
	}

	/** full constructor */
	public Order(Integer status, Timestamp beginTime, Timestamp endTime,
			Integer maxPeople, Integer discountMoney, Double price,
			Set orderRequests) {
		this.status = status;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.maxPeople = maxPeople;
		this.discountMoney = discountMoney;
		this.price = price;
		this.orderRequests = orderRequests;
	}

	// Property accessors

	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
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

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
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

}