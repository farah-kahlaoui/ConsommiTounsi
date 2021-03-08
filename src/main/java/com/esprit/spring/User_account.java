package com.esprit.spring;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name = "T_USER_Account")
public class User_account {

	/**
	 * 
	 */
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Cin;

	@Enumerated (EnumType.STRING)
	Role role ; 
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName; 
	
	//@Temporal(TemporalType.DATE)
	private Date dateNaissance; 
	@Column(name="Email")
	private String Email;
	@Column(name="phoneNumber")
	private String phoneNumber;
	@Column(name="Login")
	private String Login;
	@Column(name="password")
	private String Password;
	private boolean Status ;
	
	public Long getCin() {
		return Cin;
	}
	public void setCin(Long cin) {
		Cin = cin;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}

	
	
	
	
	
}

