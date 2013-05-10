package domain;

import java.sql.Timestamp;

/**
 * Message entity. @author MyEclipse Persistence Tools
 */

public class Message implements java.io.Serializable {

	// Fields

	private Integer messageid;
	private Customer customer;
	private String content;
	private Timestamp sendTime;
	private Integer sendTo;
	private Boolean status;

	// Constructors

	/** default constructor */
	public Message() {
	}

	/** minimal constructor */
	public Message(Customer customer, Timestamp sendTime, Integer sendTo,
			Boolean status) {
		this.customer = customer;
		this.sendTime = sendTime;
		this.sendTo = sendTo;
		this.status = status;
	}

	/** full constructor */
	public Message(Customer customer, String content, Timestamp sendTime,
			Integer sendTo, Boolean status) {
		this.customer = customer;
		this.content = content;
		this.sendTime = sendTime;
		this.sendTo = sendTo;
		this.status = status;
	}

	// Property accessors

	public Integer getMessageid() {
		return this.messageid;
	}

	public void setMessageid(Integer messageid) {
		this.messageid = messageid;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(Timestamp sendTime) {
		this.sendTime = sendTime;
	}

	public Integer getSendTo() {
		return this.sendTo;
	}

	public void setSendTo(Integer sendTo) {
		this.sendTo = sendTo;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}