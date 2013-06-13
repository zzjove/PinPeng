package domain;

/**
 * FriendshipId entity. @author MyEclipse Persistence Tools
 */

public class FriendshipId implements java.io.Serializable {

	// Fields

	private Integer customeridA;
	private Integer customeridB;

	// Constructors

	/** default constructor */
	public FriendshipId() {
	}

	/** full constructor */
	public FriendshipId(Integer customeridA, Integer customeridB) {
		this.customeridA = customeridA;
		this.customeridB = customeridB;
	}

	// Property accessors

	public Integer getCustomeridA() {
		return this.customeridA;
	}

	public void setCustomeridA(Integer customeridA) {
		this.customeridA = customeridA;
	}

	public Integer getCustomeridB() {
		return this.customeridB;
	}

	public void setCustomeridB(Integer customeridB) {
		this.customeridB = customeridB;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FriendshipId))
			return false;
		FriendshipId castOther = (FriendshipId) other;

		return ((this.getCustomeridA() == castOther.getCustomeridA()) || (this
				.getCustomeridA() != null && castOther.getCustomeridA() != null && this
				.getCustomeridA().equals(castOther.getCustomeridA())))
				&& ((this.getCustomeridB() == castOther.getCustomeridB()) || (this
						.getCustomeridB() != null
						&& castOther.getCustomeridB() != null && this
						.getCustomeridB().equals(castOther.getCustomeridB())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCustomeridA() == null ? 0 : this.getCustomeridA()
						.hashCode());
		result = 37
				* result
				+ (getCustomeridB() == null ? 0 : this.getCustomeridB()
						.hashCode());
		return result;
	}

}