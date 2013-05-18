package domain;

/**
 * CustomerOrderId entity. @author MyEclipse Persistence Tools
 */

public class CustomerOrderId implements java.io.Serializable {

	// Fields

	private Customer customer;
	private Integer orderid;

	// Constructors

	/** default constructor */
	public CustomerOrderId() {
	}

	/** full constructor */
	public CustomerOrderId(Customer customer, Integer orderid) {
		this.customer = customer;
		this.orderid = orderid;
	}

	// Property accessors

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CustomerOrderId))
			return false;
		CustomerOrderId castOther = (CustomerOrderId) other;

		return ((this.getCustomer() == castOther.getCustomer()) || (this
				.getCustomer() != null && castOther.getCustomer() != null && this
				.getCustomer().equals(castOther.getCustomer())))
				&& ((this.getOrderid() == castOther.getOrderid()) || (this
						.getOrderid() != null && castOther.getOrderid() != null && this
						.getOrderid().equals(castOther.getOrderid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCustomer() == null ? 0 : this.getCustomer().hashCode());
		result = 37 * result
				+ (getOrderid() == null ? 0 : this.getOrderid().hashCode());
		return result;
	}

}