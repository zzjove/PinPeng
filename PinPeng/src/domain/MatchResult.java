package domain;

import java.util.Date;

public class MatchResult {
	private int orderId;
	private Date date;
	private double price;
	private int value;
	private int credit;
	private int peopleNum;

	public MatchResult() {
	}

	public MatchResult(int orderId, Date date, double d, int value,
			int credit, int peopleNum) {
		super();
		this.orderId = orderId;
		this.date = date;
		this.price = d;
		this.value = value;
		this.credit = credit;
		this.peopleNum = peopleNum;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getPeopleNum() {
		return peopleNum;
	}

	public void setPeopleNum(int peopleNum) {
		this.peopleNum = peopleNum;
	}
}
