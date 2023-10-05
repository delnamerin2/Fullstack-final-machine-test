package com.nissan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Loan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer loanId;
	
	private Integer customerId;
	
	private String name;
	
	private String phone;
	
	private Integer amount;
	
	//mapping
	private Integer loanTypeId;
	
	@ManyToOne
	@JoinColumn(name="loanTypeId", insertable = false, updatable = false)
	private LoanType loantype;
	
	//mapping
	private Integer statusId;
	
	@ManyToOne
	@JoinColumn(name ="statusId", insertable = false, updatable = false)
	private Status status;
	
	//mapping 
	private Integer officerId;
	
	@ManyToOne
	@JoinColumn(name="officerId", insertable = false, updatable = false)
	private LoanOfficer loanofficer;
	
	//mapping
	private Integer verificationId;
	
	@ManyToOne
	@JoinColumn(name="verificationId", insertable = false, updatable = false)
	private VerificationStatus verificationstatus;
	
	private boolean isActive = true;

	public Loan() {
	}

	public Integer getLoanId() {
		return loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(Integer loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public LoanType getLoantype() {
		return loantype;
	}

	public void setLoantype(LoanType loantype) {
		this.loantype = loantype;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Integer getOfficerId() {
		return officerId;
	}

	public void setOfficerId(Integer officerId) {
		this.officerId = officerId;
	}

	public LoanOfficer getLoanofficer() {
		return loanofficer;
	}

	public void setLoanofficer(LoanOfficer loanofficer) {
		this.loanofficer = loanofficer;
	}

	public Integer getVerificationId() {
		return verificationId;
	}

	public void setVerificationId(Integer verificationId) {
		this.verificationId = verificationId;
	}

	public VerificationStatus getVerificationstatus() {
		return verificationstatus;
	}

	public void setVerificationstatus(VerificationStatus verificationstatus) {
		this.verificationstatus = verificationstatus;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
}