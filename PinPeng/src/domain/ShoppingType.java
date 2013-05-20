package domain;

/**
 * ShoppingType entity. @author MyEclipse Persistence Tools
 */

public class ShoppingType implements java.io.Serializable {

	// Fields

	private Integer shoppingTypeid;
	private Myrequest myrequest;
	private Double amountTo;
	private Double discountDown;
	private Double discountRate;
	private Double quantityTo;
	private Double freePost;
	private Integer shoppingStore;
	private String subShoppingStore;
	private Integer discountType;

	// Constructors

	/** default constructor */
	public ShoppingType() {
	}

	/** minimal constructor */
	public ShoppingType(Myrequest myrequest, Integer shoppingStore,
			Integer discountType) {
		this.myrequest = myrequest;
		this.shoppingStore = shoppingStore;
		this.discountType = discountType;
	}

	/** full constructor */
	public ShoppingType(Myrequest myrequest, Double amountTo,
			Double discountDown, Double discountRate, Double quantityTo,
			Double freePost, Integer shoppingStore, String subShoppingStore,
			Integer discountType) {
		this.myrequest = myrequest;
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

	public Myrequest getMyrequest() {
		return this.myrequest;
	}

	public void setMyrequest(Myrequest myrequest) {
		this.myrequest = myrequest;
	}

	public Double getAmountTo() {
		return this.amountTo;
	}

	public void setAmountTo(Double amountTo) {
		this.amountTo = amountTo;
	}

	public Double getDiscountDown() {
		return this.discountDown;
	}

	public void setDiscountDown(Double discountDown) {
		this.discountDown = discountDown;
	}

	public Double getDiscountRate() {
		return this.discountRate;
	}

	public void setDiscountRate(Double discountRate) {
		this.discountRate = discountRate;
	}

	public Double getQuantityTo() {
		return this.quantityTo;
	}

	public void setQuantityTo(Double quantityTo) {
		this.quantityTo = quantityTo;
	}

	public Double getFreePost() {
		return this.freePost;
	}

	public void setFreePost(Double freePost) {
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