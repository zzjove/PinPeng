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
	private Friendship friendship;
	private Set evaluationsForBeRecordedId = new HashSet(0);
	private Set myrequests = new HashSet(0);
	private Set myrequests_1 = new HashSet(0);
	private Set evaluationsForRecordId = new HashSet(0);
	private Set myorders = new HashSet(0);
	private Set messagesForSendTo = new HashSet(0);
	private Set messagesForCustomerid = new HashSet(0);

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
			String password, boolean sex, String email, Friendship friendship,
			Set evaluationsForBeRecordedId, Set myrequests, Set myrequests_1,
			Set evaluationsForRecordId, Set myorders, Set messagesForSendTo,
			Set messagesForCustomerid) {
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
		this.friendship = friendship;
		this.evaluationsForBeRecordedId = evaluationsForBeRecordedId;
		this.myrequests = myrequests;
		this.myrequests_1 = myrequests_1;
		this.evaluationsForRecordId = evaluationsForRecordId;
		this.myorders = myorders;
		this.messagesForSendTo = messagesForSendTo;
		this.messagesForCustomerid = messagesForCustomerid;
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

	public Friendship getFriendship() {
		return this.friendship;
	}

	public void setFriendship(Friendship friendship) {
		this.friendship = friendship;
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

	public Set getMyorders() {
		return this.myorders;
	}

	public void setMyorders(Set myorders) {
		this.myorders = myorders;
	}

	public Set getMessagesForSendTo() {
		return this.messagesForSendTo;
	}

	public void setMessagesForSendTo(Set messagesForSendTo) {
		this.messagesForSendTo = messagesForSendTo;
	}

	public Set getMessagesForCustomerid() {
		return this.messagesForCustomerid;
	}

	public void setMessagesForCustomerid(Set messagesForCustomerid) {
		this.messagesForCustomerid = messagesForCustomerid;
	}

}