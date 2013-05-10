package domain;

import java.sql.Timestamp;

/**
 * Evaluation entity. @author MyEclipse Persistence Tools
 */

public class Evaluation implements java.io.Serializable {

	// Fields

	private Integer evaluationid;
	private Customer customerByBeRecordedId;
	private Customer customerByRecordId;
	private Integer assess;
	private Timestamp recordTime;

	// Constructors

	/** default constructor */
	public Evaluation() {
	}

	/** full constructor */
	public Evaluation(Customer customerByBeRecordedId,
			Customer customerByRecordId, Integer assess, Timestamp recordTime) {
		this.customerByBeRecordedId = customerByBeRecordedId;
		this.customerByRecordId = customerByRecordId;
		this.assess = assess;
		this.recordTime = recordTime;
	}

	// Property accessors

	public Integer getEvaluationid() {
		return this.evaluationid;
	}

	public void setEvaluationid(Integer evaluationid) {
		this.evaluationid = evaluationid;
	}

	public Customer getCustomerByBeRecordedId() {
		return this.customerByBeRecordedId;
	}

	public void setCustomerByBeRecordedId(Customer customerByBeRecordedId) {
		this.customerByBeRecordedId = customerByBeRecordedId;
	}

	public Customer getCustomerByRecordId() {
		return this.customerByRecordId;
	}

	public void setCustomerByRecordId(Customer customerByRecordId) {
		this.customerByRecordId = customerByRecordId;
	}

	public Integer getAssess() {
		return this.assess;
	}

	public void setAssess(Integer assess) {
		this.assess = assess;
	}

	public Timestamp getRecordTime() {
		return this.recordTime;
	}

	public void setRecordTime(Timestamp recordTime) {
		this.recordTime = recordTime;
	}

}