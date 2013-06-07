package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private Integer customerid;
	private Integer studentid;
	private Integer credit;
	private Integer dormitory;
	private String telNumber;
	private String qqNumber;
	private Integer generosity;
	private String name;
	private String password;
	private boolean sex;
	private String email;
	private Set customersForCustomeridB = new HashSet(0);
	private Set customersForCustomeridA = new HashSet(0);
	private Set evaluationsForBeRecordedId = new HashSet(0);
	private Set myrequests = new HashSet(0);
	private Set myrequests_1 = new HashSet(0);
	private Set evaluationsForRecordId = new HashSet(0);
	private Set orders = new HashSet(0);
	private Set messages = new HashSet(0);

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(Integer studentid) {
		this.studentid = studentid;
	}

	/** full constructor */
	public Customer(Integer studentid, Integer credit, Integer dormitory,
			String telNumber, String qqNumber, Integer generosity, String name,
			String password, boolean sex, String email,
			Set customersForCustomeridB, Set customersForCustomeridA,
			Set evaluationsForBeRecordedId, Set myrequests, Set myrequests_1,
			Set evaluationsForRecordId, Set orders, Set messages) {
		this.studentid = studentid;
		this.credit = credit;
		this.dormitory = dormitory;
		this.telNumber = telNumber;
		this.qqNumber = qqNumber;
		this.generosity = generosity;
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.email = email;
		this.customersForCustomeridB = customersForCustomeridB;
		this.customersForCustomeridA = customersForCustomeridA;
		this.evaluationsForBeRecordedId = evaluationsForBeRecordedId;
		this.myrequests = myrequests;
		this.myrequests_1 = myrequests_1;
		this.evaluationsForRecordId = evaluationsForRecordId;
		this.orders = orders;
		this.messages = messages;
	}

	// Property accessors

	public Integer getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public Integer getStudentid() {
		return this.studentid;
	}

	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}

	public Integer getCredit() {
		return this.credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public Integer getDormitory() {
		return this.dormitory;
	}

	public void setDormitory(Integer dormitory) {
		this.dormitory = dormitory;
	}

	public String getTelNumber() {
		return this.telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getQqNumber() {
		return this.qqNumber;
	}

	public void setQqNumber(String qqNumber) {
		this.qqNumber = qqNumber;
	}

	public Integer getGenerosity() {
		return this.generosity;
	}

	public void setGenerosity(Integer generosity) {
		this.generosity = generosity;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getSex() {
		return this.sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set getCustomersForCustomeridB() {
		return this.customersForCustomeridB;
	}

	public void setCustomersForCustomeridB(Set customersForCustomeridB) {
		this.customersForCustomeridB = customersForCustomeridB;
	}

	public Set getCustomersForCustomeridA() {
		return this.customersForCustomeridA;
	}

	public void setCustomersForCustomeridA(Set customersForCustomeridA) {
		this.customersForCustomeridA = customersForCustomeridA;
	}

	public Set getEvaluationsForBeRecordedId() {
		return this.evaluationsForBeRecordedId;
	}

	public void setEvaluationsForBeRecordedId(Set evaluationsForBeRecordedId) {
		this.evaluationsForBeRecordedId = evaluationsForBeRecordedId;
	}

	public Set getMyrequests() {
		return this.myrequests;
	}

	public void setMyrequests(Set myrequests) {
		this.myrequests = myrequests;
	}

	public Set getMyrequests_1() {
		return this.myrequests_1;
	}

	public void setMyrequests_1(Set myrequests_1) {
		this.myrequests_1 = myrequests_1;
	}

	public Set getEvaluationsForRecordId() {
		return this.evaluationsForRecordId;
	}

	public void setEvaluationsForRecordId(Set evaluationsForRecordId) {
		this.evaluationsForRecordId = evaluationsForRecordId;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

	public Set getMessages() {
		return this.messages;
	}

	public void setMessages(Set messages) {
		this.messages = messages;
	}

}