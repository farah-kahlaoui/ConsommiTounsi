package com.esprit.spring;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "T_RAY")
public class Ray implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idRay;
	@Column(name="Type")
	private String Type;
	@Column(name="Category")
	private String Category;
	@Column(name="Quantity")
	private String Quantity;
	
	public Long getIdRay() {
		return idRay;
	}
	public void setIdRay(Long idRay) {
		this.idRay = idRay;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	/**
	 * 
	 */
	

}
