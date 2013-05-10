package domain;

/**
 * CustomerOrder entity. @author MyEclipse Persistence Tools
 */

public class CustomerOrder implements java.io.Serializable {

	// Fields

	private CustomerOrderId id;

	// Constructors

	/** default constructor */
	public CustomerOrder() {
	}

	/** full constructor */
	public CustomerOrder(CustomerOrderId id) {
		this.id = id;
	}

	// Property accessors

	public CustomerOrderId getId() {
		return this.id;
	}

	public void setId(CustomerOrderId id) {
		this.id = id;
	}

}