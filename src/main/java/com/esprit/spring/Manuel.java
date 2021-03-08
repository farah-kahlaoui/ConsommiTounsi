package com.esprit.spring;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "T_MANUEL")
public class Manuel implements Serializable {
	

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int manualId;
		public int getManualId() {
			return manualId;
		}
		public void setManualId(int manualId) {
			this.manualId = manualId;
		}
}
