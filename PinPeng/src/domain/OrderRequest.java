package domain;

/**
 * OrderRequest entity. @author MyEclipse Persistence Tools
 */

public class OrderRequest implements java.io.Serializable {

	// Fields

	private OrderRequestId id;
	private Myrequest myrequestByToRequestid;

	// Constructors

	/** default constructor */
	public OrderRequest() {
	}

	/** full constructor */
	public OrderRequest(OrderRequestId id, Myrequest myrequestByToRequestid) {
		this.id = id;
		this.myrequestByToRequestid = myrequestByToRequestid;
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

}