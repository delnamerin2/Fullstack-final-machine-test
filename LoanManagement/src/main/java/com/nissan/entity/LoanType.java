package com.nissan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanType {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer loanTypeId;
		
		private String type;

		public LoanType() {
			super();
		}

		public Integer getLoanTypeId() {
			return loanTypeId;
		}

		public void setLoanTypeId(Integer loanTypeId) {
			this.loanTypeId = loanTypeId;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		@Override
		public String toString() {
			return "LoanType [loanTypeId=" + loanTypeId + ", type=" + type + "]";
		}

		
		
	}
	
	

