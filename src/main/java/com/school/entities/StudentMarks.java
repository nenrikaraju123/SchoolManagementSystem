package com.school.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentMarks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	int regNo;
	String studentName;
	String examType;
	int maths;
	int physics;
	int chemistry;
	int biology;
	int english;
	int telugu;
	int total;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public StudentMarks() {
		super();
	}
	public StudentMarks(int id, int regNo, String studentName, int maths, int physics, int chemistry, int biology,
			int english, int telugu) {
		super();
		this.id = id;
		this.regNo = regNo;
		this.studentName = studentName;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.english = english;
		this.telugu = telugu;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getBiology() {
		return biology;
	}
	public void setBiology(int biology) {
		this.biology = biology;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getTelugu() {
		return telugu;
	}
	public void setTelugu(int telugu) {
		this.telugu = telugu;
	}
	
	public StudentMarks(int id, int regNo, String studentName, String examType, int maths, int physics, int chemistry,
			int biology, int english, int telugu, int total) {
		super();
		this.id = id;
		this.regNo = regNo;
		this.studentName = studentName;
		this.examType = examType;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.english = english;
		this.telugu = telugu;
		this.total = total;
	}
	public String getExamType() {
		return examType;
	}
	public void setExamType(String examType) {
		this.examType = examType;
	}
	@Override
	public String toString() {
		return "StudentMarks [id=" + id + ", regNo=" + regNo + ", studentName=" + studentName + ", maths=" + maths
				+ ", physics=" + physics + ", chemistry=" + chemistry + ", biology=" + biology + ", english=" + english
				+ ", telugu=" + telugu + "]";
	}
	

}
