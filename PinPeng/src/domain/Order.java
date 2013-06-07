package domain;

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
	private double price;
	private Integer numberPeople;
	private Integer payment;
	private Integer payer;
	private Integer dormLimited;
	private Integer othertakeLimited;
	private Integer manLimited;
	private Integer buyLimited;
	private Integer goodsFree;
	private Set myrequests = new HashSet(0);
	private Set customers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Integer status, Date beginTime, Integer maxPeople,
			Integer discountMoney, double price, Integer numberPeople,
			Integer payment, Integer payer, Integer dormLimited,
			Integer othertakeLimited, Integer manLimited, Integer buyLimited,
			Integer goodsFree) {
		this.status = status;
		this.beginTime = beginTime;
		this.maxPeople = maxPeople;
		this.discountMoney = discountMoney;
		this.price = price;
		this.numberPeople = numberPeople;
		this.payment = payment;
		this.payer = payer;
		this.dormLimited = dormLimited;
		this.othertakeLimited = othertakeLimited;
		this.manLimited = manLimited;
		this.buyLimited = buyLimited;
		this.goodsFree = goodsFree;
	}

	/** full constructor */
	public Order(Integer status, Date beginTime, Date endTime,
			Integer maxPeople, Integer discountMoney, double price,
			Integer numberPeople, Integer payment, Integer payer,
			Integer dormLimited, Integer othertakeLimited, Integer manLimited,
			Integer buyLimited, Integer goodsFree, Set myrequests, Set customers) {
		this.status = status;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.maxPeople = maxPeople;
		this.discountMoney = discountMoney;
		this.price = price;
		this.numberPeople = numberPeople;
		this.payment = payment;
		this.payer = payer;
		this.dormLimited = dormLimited;
		this.othertakeLimited = othertakeLimited;
		this.manLimited = manLimited;
		this.buyLimited = buyLimited;
		this.goodsFree = goodsFree;
		this.myrequests = myrequests;
		this.customers = customers;
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

	public Integer getPayment() {
		return this.payment;
	}

	public void setPayment(Integer payment) {
		this.payment = payment;
	}

	public Integer getPayer() {
		return this.payer;
	}

	public void setPayer(Integer payer) {
		this.payer = payer;
	}

	public Integer getDormLimited() {
		return this.dormLimited;
	}

	public void setDormLimited(Integer dormLimited) {
		this.dormLimited = dormLimited;
	}

	public Integer getOthertakeLimited() {
		return this.othertakeLimited;
	}

	public void setOthertakeLimited(Integer othertakeLimited) {
		this.othertakeLimited = othertakeLimited;
	}

	public Integer getManLimited() {
		return this.manLimited;
	}

	public void setManLimited(Integer manLimited) {
		this.manLimited = manLimited;
	}

	public Integer getBuyLimited() {
		return this.buyLimited;
	}

	public void setBuyLimited(Integer buyLimited) {
		this.buyLimited = buyLimited;
	}

	public Integer getGoodsFree() {
		return this.goodsFree;
	}

	public void setGoodsFree(Integer goodsFree) {
		this.goodsFree = goodsFree;
	}

	public Set getMyrequests() {
		return this.myrequests;
	}

	public void setMyrequests(Set myrequests) {
		this.myrequests = myrequests;
	}

	public Set getCustomers() {
		return this.customers;
	}

	public void setCustomers(Set customers) {
		this.customers = customers;
	}

}