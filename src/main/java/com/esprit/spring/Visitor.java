package com.esprit.spring;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table (name = "T_VISITOR")

//@Inheritance(strategy=InheritanceType.JOINED)
public class Visitor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
