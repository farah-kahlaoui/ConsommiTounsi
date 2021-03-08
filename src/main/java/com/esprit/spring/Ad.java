package com.esprit.spring;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "T_AD")
public class Ad implements Serializable {
	
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int adId;
		@Column(name="canalOfTransmisiion")
		private String canalOfTransmisiion;
		
		@Column(name="targetView")
		private String targetView; 
		
		//@Temporal(TemporalType.DATE)
		private Date biginingDate; 
		//@Temporal(TemporalType.DATE)
		private Date endDate;
		@Column(name="Views")
		private String Views;
		
		public int getAdId() {
			return adId;
		}
		public void setAdId(int adId) {
			this.adId = adId;
		}
		public String getCanalOfTransmisiion() {
			return canalOfTransmisiion;
		}
		public void setCanalOfTransmisiion(String canalOfTransmisiion) {
			this.canalOfTransmisiion = canalOfTransmisiion;
		}
		public String getTargetView() {
			return targetView;
		}
		public void setTargetView(String targetView) {
			this.targetView = targetView;
		}
		public Date getBiginingDate() {
			return biginingDate;
		}
		public void setBiginingDate(Date biginingDate) {
			this.biginingDate = biginingDate;
		}
		public Date getEndDate() {
			return endDate;
		}
		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}
		public String getViews() {
			return Views;
		}
		public void setViews(String views) {
			Views = views;
		}
		

}
