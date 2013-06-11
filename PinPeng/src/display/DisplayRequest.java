package display;

import utils.DataConverter;
import domain.Myrequest;
import domain.Restriction;
import domain.ShoppingType;

public class DisplayRequest {

	private String myrequestTime; // request的信息
	private String content;
	private double price;
	private String status;
	private double amount;
	private double weight;

	private String shoppingStore; // shoppingtype的信息
	private String subShoppingStore;
	private String discountInfo;
	private int discountType;

	private int maxPeople;// restriction的信息
	private String endDay;
	private String payer;
	private String dormLimited;
	private String othertakeLimited;
	private String manLimited;
	private String buyLimited;
	private String goodsFree;
	private String notice;

	public String getMyrequestTime() {
		return myrequestTime;
	}

	public void setMyrequestTime(String myrequestTime) {
		this.myrequestTime = myrequestTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getShoppingStore() {
		return shoppingStore;
	}

	public void setShoppingStore(String shoppingStore) {
		this.shoppingStore = shoppingStore;
	}

	public String getSubShoppingStore() {
		return subShoppingStore;
	}

	public void setSubShoppingStore(String subShoppingStore) {
		this.subShoppingStore = subShoppingStore;
	}

	public String getDiscountInfo() {
		return discountInfo;
	}

	public void setDiscountInfo(String discountInfo) {
		this.discountInfo = discountInfo;
	}

	public int getDiscountType() {
		return discountType;
	}

	public void setDiscountType(int discountType) {
		this.discountType = discountType;
	}

	public int getMaxPeople() {
		return maxPeople;
	}

	public void setMaxPeople(int maxPeople) {
		this.maxPeople = maxPeople;
	}

	public String getEndDay() {
		return endDay;
	}

	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getDormLimited() {
		return dormLimited;
	}

	public void setDormLimited(String dormLimited) {
		this.dormLimited = dormLimited;
	}

	public String getOthertakeLimited() {
		return othertakeLimited;
	}

	public void setOthertakeLimited(String othertakeLimited) {
		this.othertakeLimited = othertakeLimited;
	}

	public String getManLimited() {
		return manLimited;
	}

	public void setManLimited(String manLimited) {
		this.manLimited = manLimited;
	}

	public String getBuyLimited() {
		return buyLimited;
	}

	public void setBuyLimited(String buyLimited) {
		this.buyLimited = buyLimited;
	}

	public String getGoodsFree() {
		return goodsFree;
	}

	public void setGoodsFree(String goodsFree) {
		this.goodsFree = goodsFree;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public void toDisplay(Myrequest myrequest, ShoppingType shoppingtype,
			Restriction restriction) {
		myrequestTime = DataConverter.convert_date_time(myrequest
				.getMyrequestTime());
		content = myrequest.getContent();
		price = myrequest.getPrice();
		status = DataConverter.convert_request_status(myrequest.getStatus());
		amount = myrequest.getAmount();
		weight = myrequest.getWeight();

		shoppingStore = DataConverter.convert_shoppingstore(shoppingtype
				.getShoppingStore());
		subShoppingStore = shoppingtype.getSubShoppingStore();
		discountInfo = DataConverter.convert_discountinfo(shoppingtype);
		discountType = shoppingtype.getDiscountType();

		maxPeople = restriction.getMaxPeople();
		endDay = DataConverter.convert_date_day(restriction.getEndDay());
		payer = DataConverter.convert_me_other(restriction.getPayer());
		dormLimited = DataConverter.convert_me_other(restriction
				.getDormLimited());
		othertakeLimited = DataConverter.convert_me_other(restriction
				.getOthertakeLimited());
		manLimited = DataConverter.convert_sex(restriction.getManLimited());
		buyLimited = DataConverter.convert_yes_no(restriction.getBuyLimited());
		goodsFree = DataConverter.convert_me_other(restriction.getGoodsFree());
		notice = restriction.getNotice();
	}

}
