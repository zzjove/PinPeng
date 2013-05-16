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
	private Boolean sex;
	private String email;
	private Set friendshipsForCustomeridA = new HashSet(0);
	private Set friendshipsForCustomeridB = new HashSet(0);
	private Set evaluationsForBeRecordedId = new HashSet(0);
	private Set preferences = new HashSet(0);
	private Set myrequests = new HashSet(0);
	private Set evaluationsForRecordId = new HashSet(0);
	private Set customerOrders = new HashSet(0);
	private Set messages = new HashSet(0);

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(Integer customerid, Integer studentid) {
		this.customerid = customerid;
		this.studentid = studentid;
	}

	/** full constructor */
	public Customer(Integer customerid, Integer studentid, Integer credit,
			Integer dormitory, String telNumber, String qqNumber,
			Integer generosity, String name, String password, Boolean sex,
			String email, Set friendshipsForCustomeridA,
			Set friendshipsForCustomeridB, Set evaluationsForBeRecordedId,
			Set preferences, Set myrequests, Set evaluationsForRecordId,
			Set customerOrders, Set messages) {
		this.customerid = customerid;
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
		this.friendshipsForCustomeridA = friendshipsForCustomeridA;
		this.friendshipsForCustomeridB = friendshipsForCustomeridB;
		this.evaluationsForBeRecordedId = evaluationsForBeRecordedId;
		this.preferences = preferences;
		this.myrequests = myrequests;
		this.evaluationsForRecordId = evaluationsForRecordId;
		this.customerOrders = customerOrders;
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

	public Boolean getSex() {
		return this.sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set getFriendshipsForCustomeridA() {
		return this.friendshipsForCustomeridA;
	}

	public void setFriendshipsForCustomeridA(Set friendshipsForCustomeridA) {
		this.friendshipsForCustomeridA = friendshipsForCustomeridA;
	}

	public Set getFriendshipsForCustomeridB() {
		return this.friendshipsForCustomeridB;
	}

	public void setFriendshipsForCustomeridB(Set friendshipsForCustomeridB) {
		this.friendshipsForCustomeridB = friendshipsForCustomeridB;
	}

	public Set getEvaluationsForBeRecordedId() {
		return this.evaluationsForBeRecordedId;
	}

	public void setEvaluationsForBeRecordedId(Set evaluationsForBeRecordedId) {
		this.evaluationsForBeRecordedId = evaluationsForBeRecordedId;
	}

	public Set getPreferences() {
		return this.preferences;
	}

	public void setPreferences(Set preferences) {
		this.preferences = preferences;
	}

	public Set getMyrequests() {
		return this.myrequests;
	}

	public void setMyrequests(Set myrequests) {
		this.myrequests = myrequests;
	}

	public Set getEvaluationsForRecordId() {
		return this.evaluationsForRecordId;
	}

	public void setEvaluationsForRecordId(Set evaluationsForRecordId) {
		this.evaluationsForRecordId = evaluationsForRecordId;
	}

	public Set getCustomerOrders() {
		return this.customerOrders;
	}

	public void setCustomerOrders(Set customerOrders) {
		this.customerOrders = customerOrders;
	}

	public Set getMessages() {
		return this.messages;
	}

	public void setMessages(Set messages) {
		this.messages = messages;
	}

}