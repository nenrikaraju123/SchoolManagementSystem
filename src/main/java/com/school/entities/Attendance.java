package com.school.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "student_name")
    String studentName;
    
    @Column(name = "reg_no")
    int regNo;
     String subject;
    String date;
     String attendanceStatus;
	public Attendance(Long id, String studentName, int regNo, String subject, String date, String attendanceStatus) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.regNo = regNo;
		this.subject = subject;
		this.date = date;
		this.attendanceStatus = attendanceStatus;
	}
	public Attendance() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo2) {
		this.regNo = regNo2;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAttendanceStatus() {
		return attendanceStatus;
	}
	public void setAttendanceStatus(String attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}
	@Override
	public String toString() {
		return "Attendance [id=" + id + ", studentName=" + studentName + ", regNo=" + regNo + ", subject=" + subject
				+ ", date=" + date + ", attendanceStatus=" + attendanceStatus + "]";
	}
	
   
}
