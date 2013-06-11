package display;

import utils.DataConverter;
import domain.Myorder;
import domain.ShoppingType;

public class DisplayOrder {

	private String status;
	private String beginTime;
	private int numberPeople; // oreder的信息
	private int amount;
	private double weight;

	private String shoppingStore; // shoppingtype的信息
	private String subShoppingStore;
	private String discountInfo;
	private int discountType;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public int getNumberPeople() {
		return numberPeople;
	}

	public void setNumberPeople(int numberPeople) {
		this.numberPeople = numberPeople;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
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

	public void toDisplay(Myorder myorder, ShoppingType shoppingtype) {

		beginTime = DataConverter.convert_date_time(myorder.getBeginTime());
		status = DataConverter.convert_order_status(myorder.getStatus());
		numberPeople = myorder.getNumberPeople();
		amount = myorder.getAmount();
		weight = myorder.getWeight();

		shoppingStore = DataConverter.convert_shoppingstore(shoppingtype
				.getShoppingStore());
		subShoppingStore = shoppingtype.getSubShoppingStore();
		discountInfo = DataConverter.convert_discountinfo(shoppingtype);
		discountType = shoppingtype.getDiscountType();
	}
}
