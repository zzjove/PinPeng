package domain;

import java.util.Date;

/**
 * Restriction entity. @author MyEclipse Persistence Tools
 */

public class Restriction implements java.io.Serializable {

	// Fields

	private Integer restrictionid;
	private Myrequest myrequest;
	private Myorder myorder;
	private Integer maxPeople;
	private Date endDay;
	private Integer payer;
	private Integer dormLimited;
	private Integer othertakeLimited;
	private Integer manLimited;
	private Integer buyLimited;
	private Integer goodsFree;
	private String notice;

	// Constructors

	/** default constructor */
	public Restriction() {
	}

	/** minimal constructor */
	public Restriction(Integer maxPeople, Date endDay, Integer payer,
			Integer dormLimited, Integer othertakeLimited, Integer manLimited,
			Integer buyLimited, Integer goodsFree) {
		this.maxPeople = maxPeople;
		this.endDay = endDay;
		this.payer = payer;
		this.dormLimited = dormLimited;
		this.othertakeLimited = othertakeLimited;
		this.manLimited = manLimited;
		this.buyLimited = buyLimited;
		this.goodsFree = goodsFree;
	}

	/** full constructor */
	public Restriction(Myrequest myrequest, Myorder myorder, Integer maxPeople,
			Date endDay, Integer payer, Integer dormLimited,
			Integer othertakeLimited, Integer manLimited, Integer buyLimited,
			Integer goodsFree, String notice) {
		this.myrequest = myrequest;
		this.myorder = myorder;
		this.maxPeople = maxPeople;
		this.endDay = endDay;
		this.payer = payer;
		this.dormLimited = dormLimited;
		this.othertakeLimited = othertakeLimited;
		this.manLimited = manLimited;
		this.buyLimited = buyLimited;
		this.goodsFree = goodsFree;
		this.notice = notice;
	}

	// Property accessors

	public Integer getRestrictionid() {
		return this.restrictionid;
	}

	public void setRestrictionid(Integer restrictionid) {
		this.restrictionid = restrictionid;
	}

	public Myrequest getMyrequest() {
		return this.myrequest;
	}

	public void setMyrequest(Myrequest myrequest) {
		this.myrequest = myrequest;
	}

	public Myorder getMyorder() {
		return this.myorder;
	}

	public void setMyorder(Myorder myorder) {
		this.myorder = myorder;
	}

	public Integer getMaxPeople() {
		return this.maxPeople;
	}

	public void setMaxPeople(Integer maxPeople) {
		this.maxPeople = maxPeople;
	}

	public Date getEndDay() {
		return this.endDay;
	}

	public void setEndDay(Date endDay) {
		this.endDay = endDay;
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

	public String getNotice() {
		return this.notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

}