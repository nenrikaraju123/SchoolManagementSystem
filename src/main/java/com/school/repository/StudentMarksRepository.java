package com.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.entities.StudentMarks;

public interface StudentMarksRepository extends JpaRepository<StudentMarks, Integer> {
	
	public List<StudentMarks> findByRegNo(int regNo);

}
