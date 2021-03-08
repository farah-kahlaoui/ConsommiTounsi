package com.esprit.spring;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "T_DRIVER")
public class Automatic implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int automaticId;
	@Column(name="typeAuto")
	private String typeAuto;
	public int getAutomaticId() {
		return automaticId;
	}

	public void setAutomaticId(int automaticId) {
		automaticId = automaticId;
	}

}
