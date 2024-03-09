package com.school.services;

import java.util.List;

import com.school.entities.Student;
import com.school.entities.Teacher;

public interface StudentServices {

	public String addStudent(Student s);
	public boolean existStudent(int regNo);
	public boolean validateStudent(int rollNo,String dob);
	public Student getStudent(int regNo);
	public List<Student> getAllStudents();
	 public List<String> getStudentsName(String columnName);
	
	
}
