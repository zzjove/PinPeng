package domain;

/**
 * Friendship entity. @author MyEclipse Persistence Tools
 */

public class Friendship implements java.io.Serializable {

	// Fields

	private FriendshipId id;
	private Customer customer;

	// Constructors

	/** default constructor */
	public Friendship() {
	}

	/** minimal constructor */
	public Friendship(FriendshipId id) {
		this.id = id;
	}

	/** full constructor */
	public Friendship(FriendshipId id, Customer customer) {
		this.id = id;
		this.customer = customer;
	}

	// Property accessors

	public FriendshipId getId() {
		return this.id;
	}

	public void setId(FriendshipId id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}