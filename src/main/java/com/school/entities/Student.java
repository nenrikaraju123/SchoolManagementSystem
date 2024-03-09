 package com.school.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int sId;
	String name;
	int regNo;
	int std;
	String gender;
	String dob;
	String columnName;
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public Student() {
		super();
	}
	public Student(int sId, String name, int regNo, int std, String gender, String dob) {
		super();
		this.sId = sId;
		this.name = name;
		this.regNo = regNo;
		this.std = std;
		this.gender = gender;
		this.dob = dob;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", name=" + name + ", regNo=" + regNo + ", std=" + std + ", gender=" + gender
				+ ", dob=" + dob + "]";
	}
	
	
	

}
