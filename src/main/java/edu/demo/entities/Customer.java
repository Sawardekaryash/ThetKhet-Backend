package edu.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="cust_registrations")
public class Customer {

	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String email;
	
	@Column
	private int IsDeleted;

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getIsDeleted() {
		return IsDeleted;
	}


	public void setIsDeleted(int isDeleted) {
		IsDeleted = isDeleted;
	}


	
	public Customer(String username, String password, String email, int isDeleted) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		IsDeleted = isDeleted;
	}


	public Customer()
	{
		super();
	}
	
}