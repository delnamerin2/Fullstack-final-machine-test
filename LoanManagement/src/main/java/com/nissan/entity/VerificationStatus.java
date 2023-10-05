package com.nissan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VerificationStatus {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer verificationId;
	
	private String status;

	public VerificationStatus(Integer verificationId, String status) {
		super();
		this.verificationId = verificationId;
		this.status = status;
	}

	public VerificationStatus() {
		super();
	}

	public Integer getVerificationId() {
		return verificationId;
	}

	public void setVerificationId(Integer verificationId) {
		this.verificationId = verificationId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "VerificationStatus [verificationId=" + verificationId + ", status=" + status + "]";
	}
	
	
	
}
