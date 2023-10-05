package com.nissan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanOfficer {
	@Id
	private Integer officerId;
	
	private String OfficerName;

	public LoanOfficer(Integer officerId, String officerName) {
		super();
		this.officerId = officerId;
		OfficerName = officerName;
	}

	public LoanOfficer() {
		super();
	}

	public Integer getOfficerId() {
		return officerId;
	}

	public void setOfficerId(Integer officerId) {
		this.officerId = officerId;
	}

	public String getOfficerName() {
		return OfficerName;
	}

	public void setOfficerName(String officerName) {
		OfficerName = officerName;
	}

	@Override
	public String toString() {
		return "LoanOfficer [officerId=" + officerId + ", OfficerName=" + OfficerName + "]";
	}
	
	
	
	

}
