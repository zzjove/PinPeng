package domain;

/**
 * Friendship entity. @author MyEclipse Persistence Tools
 */

public class Friendship implements java.io.Serializable {

	// Fields

	private FriendshipId id;

	// Constructors

	/** default constructor */
	public Friendship() {
	}

	/** full constructor */
	public Friendship(FriendshipId id) {
		this.id = id;
	}

	// Property accessors

	public FriendshipId getId() {
		return this.id;
	}

	public void setId(FriendshipId id) {
		this.id = id;
	}

}