package com.esprit.spring;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "T_ADS_CATEGORY")
public class Ads_Category implements Serializable {
	
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int adsCategoryId;
		@Column(name="Name")
		private String Name;
		public int getAdsCategoryId() {
			return adsCategoryId;
		}
		public void setAdsCategoryId(int adsCategoryId) {
			this.adsCategoryId = adsCategoryId;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
	

}
