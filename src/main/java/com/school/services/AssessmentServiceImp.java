package com.school.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.entities.Assessment;
import com.school.repository.AssessmnetReposity;
@Service
public class AssessmentServiceImp implements AssessmentService {
	
	@Autowired
	AssessmnetReposity assessmentRepository;

	@Override
	public void addAssessment(Assessment assessment) {
		assessmentRepository.save(assessment);
		
	}

	@Override
	public List<String> getAll() {
		
		return assessmentRepository.findAllTitles();
	}

	@Override
	public Assessment getAssessment(String title) {
		
		return  assessmentRepository.findByTitle(title);
	}

}
