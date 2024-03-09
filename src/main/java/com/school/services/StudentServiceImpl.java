package com.school.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.entities.Student;
import com.school.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServices{
     
	@Autowired
	StudentRepository stuRepo;
	
	@Override
	public String addStudent(Student s) {
		stuRepo.save(s);
		return "Student created Success";
	}
	@Override
	public boolean existStudent(int regNo) {
		if(stuRepo.findByRegNo(regNo) == null)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	@Override
	public boolean validateStudent(int rollNo, String dob) {
		Student s=stuRepo.findByRegNo(rollNo);
		if( s!= null)
		{
			if(s.getRegNo()==rollNo && s.getDob().equals(dob))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
		return false;
		}
	}
	@Override
	public Student getStudent(int regNo) {
		return stuRepo.findByRegNo(regNo);
	}
	@Override
	public List<Student> getAllStudents() {
	List<Student> studentlist=	stuRepo.findAll();
		return  studentlist;
	}
	 public List<String> getStudentsName(String columnName)
	    {
	    	return stuRepo.findByColumnName(columnName);
	    }

}
