package domain;

/**
 * ShoppingType entity. @author MyEclipse Persistence Tools
 */

public class ShoppingType implements java.io.Serializable {

	// Fields

	private Integer shoppingTypeid;
	private Integer requestid;
	private Integer orderid;
	private double amountTo;
	private double discountDown;
	private double discountRate;
	private double quantityTo;
	private double freePost;
	private Integer shoppingStore;
	private String subShoppingStore;
	private Integer discountType;

	// Constructors

	/** default constructor */
	public ShoppingType() {
	}

	/** minimal constructor */
	public ShoppingType(Integer shoppingStore, Integer discountType) {
		this.shoppingStore = shoppingStore;
		this.discountType = discountType;
	}

	/** full constructor */
	public ShoppingType(Integer requestid, Integer orderid, double amountTo,
			double discountDown, double discountRate, double quantityTo,
			double freePost, Integer shoppingStore, String subShoppingStore,
			Integer discountType) {
		this.requestid = requestid;
		this.orderid = orderid;
		this.amountTo = amountTo;
		this.discountDown = discountDown;
		this.discountRate = discountRate;
		this.quantityTo = quantityTo;
		this.freePost = freePost;
		this.shoppingStore = shoppingStore;
		this.subShoppingStore = subShoppingStore;
		this.discountType = discountType;
	}

	// Property accessors

	public Integer getShoppingTypeid() {
		return this.shoppingTypeid;
	}

	public void setShoppingTypeid(Integer shoppingTypeid) {
		this.shoppingTypeid = shoppingTypeid;
	}

	public Integer getRequestid() {
		return this.requestid;
	}

	public void setRequestid(Integer requestid) {
		this.requestid = requestid;
	}

	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public double getAmountTo() {
		return this.amountTo;
	}

	public void setAmountTo(double amountTo) {
		this.amountTo = amountTo;
	}

	public double getDiscountDown() {
		return this.discountDown;
	}

	public void setDiscountDown(double discountDown) {
		this.discountDown = discountDown;
	}

	public double getDiscountRate() {
		return this.discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public double getQuantityTo() {
		return this.quantityTo;
	}

	public void setQuantityTo(double quantityTo) {
		this.quantityTo = quantityTo;
	}

	public double getFreePost() {
		return this.freePost;
	}

	public void setFreePost(double freePost) {
		this.freePost = freePost;
	}

	public Integer getShoppingStore() {
		return this.shoppingStore;
	}

	public void setShoppingStore(Integer shoppingStore) {
		this.shoppingStore = shoppingStore;
	}

	public String getSubShoppingStore() {
		return this.subShoppingStore;
	}

	public void setSubShoppingStore(String subShoppingStore) {
		this.subShoppingStore = subShoppingStore;
	}

	public Integer getDiscountType() {
		return this.discountType;
	}

	public void setDiscountType(Integer discountType) {
		this.discountType = discountType;
	}

}