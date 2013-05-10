package domain;

/**
 * Restriction entity. @author MyEclipse Persistence Tools
 */

public class Restriction implements java.io.Serializable {

	// Fields

	private Integer restrictionid;
	private Request request;
	private Integer type;
	private Integer maxPeople;
	private Integer shoppingStore;
	private Integer maxDay;
	private Integer payment;
	private Integer payer;
	private Boolean dormLimited;
	private Boolean othertakeLimited;
	private Boolean manLimited;
	private Boolean buyLimited;
	private Boolean goodsFree;
	private String notice;

	// Constructors

	/** default constructor */
	public Restriction() {
	}

	/** minimal constructor */
	public Restriction(Request request, Integer type, Integer maxPeople,
			Integer shoppingStore, Integer maxDay, Integer payment,
			Integer payer, Boolean dormLimited, Boolean othertakeLimited,
			Boolean manLimited, Boolean buyLimited, Boolean goodsFree) {
		this.request = request;
		this.type = type;
		this.maxPeople = maxPeople;
		this.shoppingStore = shoppingStore;
		this.maxDay = maxDay;
		this.payment = payment;
		this.payer = payer;
		this.dormLimited = dormLimited;
		this.othertakeLimited = othertakeLimited;
		this.manLimited = manLimited;
		this.buyLimited = buyLimited;
		this.goodsFree = goodsFree;
	}

	/** full constructor */
	public Restriction(Request request, Integer type, Integer maxPeople,
			Integer shoppingStore, Integer maxDay, Integer payment,
			Integer payer, Boolean dormLimited, Boolean othertakeLimited,
			Boolean manLimited, Boolean buyLimited, Boolean goodsFree,
			String notice) {
		this.request = request;
		this.type = type;
		this.maxPeople = maxPeople;
		this.shoppingStore = shoppingStore;
		this.maxDay = maxDay;
		this.payment = payment;
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

	public Request getRequest() {
		return this.request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getMaxPeople() {
		return this.maxPeople;
	}

	public void setMaxPeople(Integer maxPeople) {
		this.maxPeople = maxPeople;
	}

	public Integer getShoppingStore() {
		return this.shoppingStore;
	}

	public void setShoppingStore(Integer shoppingStore) {
		this.shoppingStore = shoppingStore;
	}

	public Integer getMaxDay() {
		return this.maxDay;
	}

	public void setMaxDay(Integer maxDay) {
		this.maxDay = maxDay;
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

	public Boolean getDormLimited() {
		return this.dormLimited;
	}

	public void setDormLimited(Boolean dormLimited) {
		this.dormLimited = dormLimited;
	}

	public Boolean getOthertakeLimited() {
		return this.othertakeLimited;
	}

	public void setOthertakeLimited(Boolean othertakeLimited) {
		this.othertakeLimited = othertakeLimited;
	}

	public Boolean getManLimited() {
		return this.manLimited;
	}

	public void setManLimited(Boolean manLimited) {
		this.manLimited = manLimited;
	}

	public Boolean getBuyLimited() {
		return this.buyLimited;
	}

	public void setBuyLimited(Boolean buyLimited) {
		this.buyLimited = buyLimited;
	}

	public Boolean getGoodsFree() {
		return this.goodsFree;
	}

	public void setGoodsFree(Boolean goodsFree) {
		this.goodsFree = goodsFree;
	}

	public String getNotice() {
		return this.notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

}