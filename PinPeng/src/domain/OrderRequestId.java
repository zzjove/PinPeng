package domain;

/**
 * OrderRequestId entity. @author MyEclipse Persistence Tools
 */

public class OrderRequestId implements java.io.Serializable {

	// Fields

	private Order order;
	private Request request;

	// Constructors

	/** default constructor */
	public OrderRequestId() {
	}

	/** full constructor */
	public OrderRequestId(Order order, Request request) {
		this.order = order;
		this.request = request;
	}

	// Property accessors

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
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
		if (!(other instanceof OrderRequestId))
			return false;
		OrderRequestId castOther = (OrderRequestId) other;

		return ((this.getOrder() == castOther.getOrder()) || (this.getOrder() != null
				&& castOther.getOrder() != null && this.getOrder().equals(
				castOther.getOrder())))
				&& ((this.getRequest() == castOther.getRequest()) || (this
						.getRequest() != null && castOther.getRequest() != null && this
						.getRequest().equals(castOther.getRequest())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getOrder() == null ? 0 : this.getOrder().hashCode());
		result = 37 * result
				+ (getRequest() == null ? 0 : this.getRequest().hashCode());
		return result;
	}

}