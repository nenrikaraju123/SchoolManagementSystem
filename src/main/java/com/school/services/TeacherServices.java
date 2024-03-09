package com.school.services;

import com.school.entities.Teacher;

public interface TeacherServices {
	public String addTeacher(Teacher t);
	public boolean existTeacher(String email);
	public boolean validateTeacher(String email,String password);
	public Teacher getTeacher(String email);
}
