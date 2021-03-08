package com.esprit.spring;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "T_SHALVES")
public class Shalves implements Serializable {
	
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int shalvesId;
		@Column(name="typeShalves")
		private String typeShalves;
		public int getShalvesId() {
			return shalvesId;
		}
		public void setShalvesId(int shalvesId) {
			this.shalvesId = shalvesId;
		}
		public String getTypeShalves() {
			return typeShalves;
		}
		public void setTypeShalves(String typeShalves) {
			this.typeShalves = typeShalves;
		}
		
		
}
