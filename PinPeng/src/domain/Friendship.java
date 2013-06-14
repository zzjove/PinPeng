package domain;

/**
 * Friendship entity. @author MyEclipse Persistence Tools
 */

public class Friendship implements java.io.Serializable {

	// Fields

	private Integer friendshipid;
	private Customer customerByCustomerid;
	private Customer customerByCustomeridB;

	// Constructors

	/** default constructor */
	public Friendship() {
	}

	/** minimal constructor */
	public Friendship(Customer customerByCustomeridB) {
		this.customerByCustomeridB = customerByCustomeridB;
	}

	/** full constructor */
	public Friendship(Customer customerByCustomerid,
			Customer customerByCustomeridB) {
		this.customerByCustomerid = customerByCustomerid;
		this.customerByCustomeridB = customerByCustomeridB;
	}

	// Property accessors

	public Integer getFriendshipid() {
		return this.friendshipid;
	}

	public void setFriendshipid(Integer friendshipid) {
		this.friendshipid = friendshipid;
	}

	public Customer getCustomerByCustomerid() {
		return this.customerByCustomerid;
	}

	public void setCustomerByCustomerid(Customer customerByCustomerid) {
		this.customerByCustomerid = customerByCustomerid;
	}

	public Customer getCustomerByCustomeridB() {
		return this.customerByCustomeridB;
	}

	public void setCustomerByCustomeridB(Customer customerByCustomeridB) {
		this.customerByCustomeridB = customerByCustomeridB;
	}

}