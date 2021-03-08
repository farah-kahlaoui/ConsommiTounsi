package com.esprit.spring;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "T_DRIVER")
public class Invoice implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int invoiceId;
	//idCommend  associaltion cardinalite 
	//@Temporal(TemporalType.DATE)
	private Date dateInvoice;
	
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public Date getDateInvoice() {
		return dateInvoice;
	}
	public void setDateInvoice(Date dateInvoice) {
		this.dateInvoice = dateInvoice;
	}
	

}
