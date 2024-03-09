package com.school.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.entities.StudentMarks;
import com.school.repository.StudentMarksRepository;

@Service
public class StudentMarksServiceImp implements StudentMarksService {
	
	@Autowired
	StudentMarksRepository studentMarksRepository;

	@Override
	public String uploadMarks(int regNo, String studentName, int maths, int physics, int chemistry, int  biology,int english,
			int telugu,String examType,int total) {
		StudentMarks studentMarks=new StudentMarks();
		studentMarks.setRegNo(regNo);
		studentMarks.setStudentName(studentName);
		studentMarks.setMaths(maths);
		studentMarks.setBiology(biology);
		studentMarks.setChemistry(chemistry);
		studentMarks.setPhysics(physics);
		studentMarks.setEnglish(english);
		studentMarks.setTelugu(telugu);
		studentMarks.setExamType(examType);
		studentMarks.setTotal(total);
		studentMarksRepository.save(studentMarks);
		return "marks added";
	}

	@Override
	public List<StudentMarks> getStudentMarks(int regNo) {
		List<StudentMarks> studentMarks=studentMarksRepository.findByRegNo(regNo);
		return studentMarks ;
		
	}

}
