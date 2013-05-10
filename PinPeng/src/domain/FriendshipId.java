package domain;

/**
 * FriendshipId entity. @author MyEclipse Persistence Tools
 */

public class FriendshipId implements java.io.Serializable {

	// Fields

	private Customer customer;
	private Customer customer_1;

	// Constructors

	/** default constructor */
	public FriendshipId() {
	}

	/** full constructor */
	public FriendshipId(Customer customer, Customer customer_1) {
		this.customer = customer;
		this.customer_1 = customer_1;
	}

	// Property accessors

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Customer getCustomer_1() {
		return this.customer_1;
	}

	public void setCustomer_1(Customer customer_1) {
		this.customer_1 = customer_1;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FriendshipId))
			return false;
		FriendshipId castOther = (FriendshipId) other;

		return ((this.getCustomer() == castOther.getCustomer()) || (this
				.getCustomer() != null && castOther.getCustomer() != null && this
				.getCustomer().equals(castOther.getCustomer())))
				&& ((this.getCustomer_1() == castOther.getCustomer_1()) || (this
						.getCustomer_1() != null
						&& castOther.getCustomer_1() != null && this
						.getCustomer_1().equals(castOther.getCustomer_1())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCustomer() == null ? 0 : this.getCustomer().hashCode());
		result = 37
				* result
				+ (getCustomer_1() == null ? 0 : this.getCustomer_1()
						.hashCode());
		return result;
	}

}