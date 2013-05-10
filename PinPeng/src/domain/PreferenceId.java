package domain;

/**
 * PreferenceId entity. @author MyEclipse Persistence Tools
 */

public class PreferenceId implements java.io.Serializable {

	// Fields

	private Customer customer;
	private Request request;

	// Constructors

	/** default constructor */
	public PreferenceId() {
	}

	/** full constructor */
	public PreferenceId(Customer customer, Request request) {
		this.customer = customer;
		this.request = request;
	}

	// Property accessors

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Request getRequest() {
		return this.request;
	}

	public void setRequest(Request request) {
		this.request = request;
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
				&& ((this.getRequest() == castOther.getRequest()) || (this
						.getRequest() != null && castOther.getRequest() != null && this
						.getRequest().equals(castOther.getRequest())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCustomer() == null ? 0 : this.getCustomer().hashCode());
		result = 37 * result
				+ (getRequest() == null ? 0 : this.getRequest().hashCode());
		return result;
	}

}