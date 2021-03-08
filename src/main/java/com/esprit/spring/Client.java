package com.esprit.spring;

import java.io.Serializable;

import javax.persistence.Entity;
/////héritage
import javax.persistence.Table;


@Entity
@Table (name = "T_CLIENT")

public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
