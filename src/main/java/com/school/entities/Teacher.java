package com.school.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   int tId;
	String name;
	String domain;
	String gender;
	String email;
	String password;
	public Teacher() {
		super();
	}
	public Teacher(int tId, String name, String domain, String gender, String email, String password) {
		super();
		this.tId = tId;
		this.name = name;
		this.domain = domain;
		this.gender = gender;
		this.email = email;
		this.password = password;
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", name=" + name + ", domain=" + domain + ", gender=" + gender + ", email="
				+ email + ", password=" + password + "]";
	}
	
}
