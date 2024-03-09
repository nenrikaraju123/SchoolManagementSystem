package com.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.school.entities.Assessment;

public interface AssessmnetReposity extends JpaRepository<Assessment, Integer>{
	@Query("SELECT l.title FROM Assessment l")
    List<String> findAllTitles();
	public Assessment findByTitle(String title);

}
