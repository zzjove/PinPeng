package domain;

/**
 * OrderRequest entity. @author MyEclipse Persistence Tools
 */

public class OrderRequest implements java.io.Serializable {

	// Fields

	private OrderRequestId id;
	private Myrequest myrequestByToRequestid;
	private Myrequest myrequestByRequestid;
	private Order order;

	// Constructors

	/** default constructor */
	public OrderRequest() {
	}

	/** full constructor */
	public OrderRequest(OrderRequestId id, Myrequest myrequestByToRequestid,
			Myrequest myrequestByRequestid, Order order) {
		this.id = id;
		this.myrequestByToRequestid = myrequestByToRequestid;
		this.myrequestByRequestid = myrequestByRequestid;
		this.order = order;
	}

	// Property accessors

	public OrderRequestId getId() {
		return this.id;
	}

	public void setId(OrderRequestId id) {
		this.id = id;
	}

	public Myrequest getMyrequestByToRequestid() {
		return this.myrequestByToRequestid;
	}

	public void setMyrequestByToRequestid(Myrequest myrequestByToRequestid) {
		this.myrequestByToRequestid = myrequestByToRequestid;
	}

	public Myrequest getMyrequestByRequestid() {
		return this.myrequestByRequestid;
	}

	public void setMyrequestByRequestid(Myrequest myrequestByRequestid) {
		this.myrequestByRequestid = myrequestByRequestid;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}