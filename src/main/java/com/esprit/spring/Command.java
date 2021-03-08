package com.esprit.spring;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "T_COMMAND")
public class Command implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int commandId;
	@Column(name="totalPrice")
	private float totalPrice ; 
	@Column(name=" statusBasket")
	private boolean statusBasket ; 
	//mode de payment : paymet cardianalite 

	//@Temporal(TemporalType.DATE)
		private Date dateCommande;

	public int getCommandId() {
		return commandId;
	}

	public void setCommandId(int commandId) {
		this.commandId = commandId;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public boolean isStatusBasket() {
		return statusBasket;
	}

	public void setStatusBasket(boolean statusBasket) {
		this.statusBasket = statusBasket;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
}
