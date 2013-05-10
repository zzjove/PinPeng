package domain;

/**
 * Preference entity. @author MyEclipse Persistence Tools
 */

public class Preference implements java.io.Serializable {

	// Fields

	private PreferenceId id;

	// Constructors

	/** default constructor */
	public Preference() {
	}

	/** full constructor */
	public Preference(PreferenceId id) {
		this.id = id;
	}

	// Property accessors

	public PreferenceId getId() {
		return this.id;
	}

	public void setId(PreferenceId id) {
		this.id = id;
	}

}