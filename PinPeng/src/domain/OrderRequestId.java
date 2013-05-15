package domain;

/**
 * OrderRequestId entity. @author MyEclipse Persistence Tools
 */

public class OrderRequestId implements java.io.Serializable {

	// Fields

	private Order order;
	private Myrequest myrequest;

	// Constructors

	/** default constructor */
	public OrderRequestId() {
	}

	/** full constructor */
	public OrderRequestId(Order order, Myrequest myrequest) {
		this.order = order;
		this.myrequest = myrequest;
	}

	// Property accessors

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
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
		if (!(other instanceof OrderRequestId))
			return false;
		OrderRequestId castOther = (OrderRequestId) other;

		return ((this.getOrder() == castOther.getOrder()) || (this.getOrder() != null
				&& castOther.getOrder() != null && this.getOrder().equals(
				castOther.getOrder())))
				&& ((this.getMyrequest() == castOther.getMyrequest()) || (this
						.getMyrequest() != null
						&& castOther.getMyrequest() != null && this
						.getMyrequest().equals(castOther.getMyrequest())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getOrder() == null ? 0 : this.getOrder().hashCode());
		result = 37 * result
				+ (getMyrequest() == null ? 0 : this.getMyrequest().hashCode());
		return result;
	}

}