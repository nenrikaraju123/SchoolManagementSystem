package com.school.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.entities.Teacher;
import com.school.repository.TeacherRepository;
@Service
public class TeacherServicesImp implements TeacherServices {
	@Autowired
	TeacherRepository tRepo;
	@Override
	public String addTeacher(Teacher t) {
		tRepo.save(t);
		return null;
	}
	@Override
	public boolean existTeacher(String email) {
		if(tRepo.findByEmail(email) == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public boolean validateTeacher(String email, String password) {
		Teacher t= tRepo.findByEmail(email);
		if(t != null)
		{
			if(t.getEmail().equals(email) && t.getPassword().equals(password))
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
	public Teacher getTeacher(String email) {
		Teacher t=tRepo.findByEmail(email);
		return t;
	}

}
