package com.esprit.spring;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "T_PRODUCT")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	@Column(name="Name")
	private String Name;
	
	@Column(name="Description")
	private String Description;
	
	@Column(name="Category")
	private String Category;
	
	@Column(name="Weight")
	private float Weight;
	
	@Column(name="Quantity")
	private float Quantity;
	
	
	//private int idRay v=cardinalite 
	@Column(name="Price")
	
	private float Price;
	
	
	
	

	
	

}
