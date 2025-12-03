package com.authentication.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
public class Users {

	@Id
	int id;
	String username;
	String email;
	String gender;
	String address;
	String password;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int id, String username, String email, String gender, String address, String password) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", email=" + email + ", gender=" + gender + ", address="
				+ address + ", password=" + password + "]";
	}
	
}

	