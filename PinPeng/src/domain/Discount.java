package domain;

import java.sql.Timestamp;

/**
 * Discount entity. @author MyEclipse Persistence Tools
 */

public class Discount implements java.io.Serializable {

	// Fields

	private Integer discountid;
	private Admin admin;
	private Integer shoppingStore;
	private String pictureUrl;
	private String website;
	private Integer status;
	private Timestamp time;

	// Constructors

	/** default constructor */
	public Discount() {
	}

	/** full constructor */
	public Discount(Admin admin, Integer shoppingStore, String pictureUrl,
			String website, Integer status, Timestamp time) {
		this.admin = admin;
		this.shoppingStore = shoppingStore;
		this.pictureUrl = pictureUrl;
		this.website = website;
		this.status = status;
		this.time = time;
	}

	// Property accessors

	public Integer getDiscountid() {
		return this.discountid;
	}

	public void setDiscountid(Integer discountid) {
		this.discountid = discountid;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Integer getShoppingStore() {
		return this.shoppingStore;
	}

	public void setShoppingStore(Integer shoppingStore) {
		this.shoppingStore = shoppingStore;
	}

	public String getPictureUrl() {
		return this.pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}