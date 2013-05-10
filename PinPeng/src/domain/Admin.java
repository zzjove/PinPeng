package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable {

	// Fields

	private Integer adminid;
	private String name;
	private String password;
	private Boolean sex;
	private Set discounts = new HashSet(0);

	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** minimal constructor */
	public Admin(String name, String password, Boolean sex) {
		this.name = name;
		this.password = password;
		this.sex = sex;
	}

	/** full constructor */
	public Admin(String name, String password, Boolean sex, Set discounts) {
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.discounts = discounts;
	}

	// Property accessors

	public Integer getAdminid() {
		return this.adminid;
	}

	public void setAdminid(Integer adminid) {
		this.adminid = adminid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getSex() {
		return this.sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public Set getDiscounts() {
		return this.discounts;
	}

	public void setDiscounts(Set discounts) {
		this.discounts = discounts;
	}

}