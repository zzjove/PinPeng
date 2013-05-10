package domain;

/**
 * OrderRequest entity. @author MyEclipse Persistence Tools
 */

public class OrderRequest implements java.io.Serializable {

	// Fields

	private OrderRequestId id;

	// Constructors

	/** default constructor */
	public OrderRequest() {
	}

	/** full constructor */
	public OrderRequest(OrderRequestId id) {
		this.id = id;
	}

	// Property accessors

	public OrderRequestId getId() {
		return this.id;
	}

	public void setId(OrderRequestId id) {
		this.id = id;
	}

}