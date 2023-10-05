package com.nissan.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	@Entity
	public class Status {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer statusId;
		
		private String status;
		
		
		//constructor
		public Status(Integer statusId, String status) {
			super();
			this.statusId = statusId;
			this.status = status;
		}


		public Status() {
			super();
		}


		public Integer getStatusId() {
			return statusId;
		}


		public void setStatusId(Integer statusId) {
			this.statusId = statusId;
		}


		public String getStatus() {
			return status;
		}


		public void setStatus(String status) {
			this.status = status;
		}


		@Override
		public String toString() {
			return "Status [statusId=" + statusId + ", status=" + status + "]";
		}
		
		
		
	}
	

