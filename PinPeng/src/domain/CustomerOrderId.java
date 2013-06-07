package domain;

/**
 * CustomerOrderId entity. @author MyEclipse Persistence Tools
 */

public class CustomerOrderId implements java.io.Serializable {

	// Fields

	private Customer customer;
	private Order order;

	// Constructors

	/** default constructor */
	public CustomerOrderId() {
	}

	/** full constructor */
	public CustomerOrderId(Customer customer, Order order) {
		this.customer = customer;
		this.order = order;
	}

	// Property accessors

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
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
				&& ((this.getOrder() == castOther.getOrder()) || (this
						.getOrder() != null && castOther.getOrder() != null && this
						.getOrder().equals(castOther.getOrder())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCustomer() == null ? 0 : this.getCustomer().hashCode());
		result = 37 * result
				+ (getOrder() == null ? 0 : this.getOrder().hashCode());
		return result;
	}

}