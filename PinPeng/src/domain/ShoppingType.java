package domain;

/**
 * ShoppingType entity. @author MyEclipse Persistence Tools
 */

public class ShoppingType implements java.io.Serializable {

	// Fields

	private Integer shoppingTypeid;
	private Request request;
	private Double amountTo;
	private Double discountDown;
	private Double discountRate;
	private Double quantityTo;
	private Double freePost;

	// Constructors

	/** default constructor */
	public ShoppingType() {
	}

	/** minimal constructor */
	public ShoppingType(Request request) {
		this.request = request;
	}

	/** full constructor */
	public ShoppingType(Request request, Double amountTo, Double discountDown,
			Double discountRate, Double quantityTo, Double freePost) {
		this.request = request;
		this.amountTo = amountTo;
		this.discountDown = discountDown;
		this.discountRate = discountRate;
		this.quantityTo = quantityTo;
		this.freePost = freePost;
	}

	// Property accessors

	public Integer getShoppingTypeid() {
		return this.shoppingTypeid;
	}

	public void setShoppingTypeid(Integer shoppingTypeid) {
		this.shoppingTypeid = shoppingTypeid;
	}

	public Request getRequest() {
		return this.request;
	}

	public void setRequest(Request request) {
		this.request = request;
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

}