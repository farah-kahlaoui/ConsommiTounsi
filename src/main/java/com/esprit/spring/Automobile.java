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
public class Automobile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAuto;
	@Column(name="typeAuto")
	private String typeAuto;
	
	@Column(name="Power")
	private String Power;

	public int getIdAuto() {
		return idAuto;
	}

	public void setIdAuto(int idAuto) {
		this.idAuto = idAuto;
	}

	public String getTypeAuto() {
		return typeAuto;
	}

	public void setTypeAuto(String typeAuto) {
		this.typeAuto = typeAuto;
	}

	public String getPower() {
		return Power;
	}

	public void setPower(String power) {
		Power = power;
	} 
	 
	
}
