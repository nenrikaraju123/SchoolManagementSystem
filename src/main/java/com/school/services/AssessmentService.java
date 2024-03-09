package com.school.services;

import java.util.List;

import com.school.entities.Assessment;

public interface AssessmentService {
	public void addAssessment(Assessment assessment);
	public List<String> getAll();
	public Assessment getAssessment(String title);

}
