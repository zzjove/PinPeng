package domain;

/**
 * PreferenceId entity. @author MyEclipse Persistence Tools
 */

public class PreferenceId implements java.io.Serializable {

	// Fields

	private Customer customer;
	private Myrequest myrequest;

	// Constructors

	/** default constructor */
	public PreferenceId() {
	}

	/** full constructor */
	public PreferenceId(Customer customer, Myrequest myrequest) {
		this.customer = customer;
		this.myrequest = myrequest;
	}

	// Property accessors

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Myrequest getMyrequest() {
		return this.myrequest;
	}

	public void setMyrequest(Myrequest myrequest) {
		this.myrequest = myrequest;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PreferenceId))
			return false;
		PreferenceId castOther = (PreferenceId) other;

		return ((this.getCustomer() == castOther.getCustomer()) || (this
				.getCustomer() != null && castOther.getCustomer() != null && this
				.getCustomer().equals(castOther.getCustomer())))
				&& ((this.getMyrequest() == castOther.getMyrequest()) || (this
						.getMyrequest() != null
						&& castOther.getMyrequest() != null && this
						.getMyrequest().equals(castOther.getMyrequest())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCustomer() == null ? 0 : this.getCustomer().hashCode());
		result = 37 * result
				+ (getMyrequest() == null ? 0 : this.getMyrequest().hashCode());
		return result;
	}

}