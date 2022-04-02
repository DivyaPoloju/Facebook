package com.facebook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GenericGenerator(name = "users-sequence-generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "users_sequence"),
			@Parameter(name = "initial_value", value = "101"), @Parameter(name = "increment_size", value = "1") })
	@GeneratedValue(generator = "users-sequence-generator")
	@Column(nullable = false, updatable = false)
	@JsonProperty("userId")
	private int userId;
	
	private String firstname;
	
	private String lastname;
	
	private String address;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String password;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public User(int userId, String firstname, String lastname, String address, String password) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.password = password;
	}



}