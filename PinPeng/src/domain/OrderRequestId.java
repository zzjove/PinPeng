package domain;

/**
 * OrderRequestId entity. @author MyEclipse Persistence Tools
 */

public class OrderRequestId implements java.io.Serializable {

	// Fields

	private Integer orderid;
	private Integer requestid;
	private Integer toRequestid;

	// Constructors

	/** default constructor */
	public OrderRequestId() {
	}

	/** full constructor */
	public OrderRequestId(Integer orderid, Integer requestid,
			Integer toRequestid) {
		this.orderid = orderid;
		this.requestid = requestid;
		this.toRequestid = toRequestid;
	}

	// Property accessors

	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Integer getRequestid() {
		return this.requestid;
	}

	public void setRequestid(Integer requestid) {
		this.requestid = requestid;
	}

	public Integer getToRequestid() {
		return this.toRequestid;
	}

	public void setToRequestid(Integer toRequestid) {
		this.toRequestid = toRequestid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrderRequestId))
			return false;
		OrderRequestId castOther = (OrderRequestId) other;

		return ((this.getOrderid() == castOther.getOrderid()) || (this
				.getOrderid() != null && castOther.getOrderid() != null && this
				.getOrderid().equals(castOther.getOrderid())))
				&& ((this.getRequestid() == castOther.getRequestid()) || (this
						.getRequestid() != null
						&& castOther.getRequestid() != null && this
						.getRequestid().equals(castOther.getRequestid())))
				&& ((this.getToRequestid() == castOther.getToRequestid()) || (this
						.getToRequestid() != null
						&& castOther.getToRequestid() != null && this
						.getToRequestid().equals(castOther.getToRequestid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getOrderid() == null ? 0 : this.getOrderid().hashCode());
		result = 37 * result
				+ (getRequestid() == null ? 0 : this.getRequestid().hashCode());
		result = 37
				* result
				+ (getToRequestid() == null ? 0 : this.getToRequestid()
						.hashCode());
		return result;
	}

}