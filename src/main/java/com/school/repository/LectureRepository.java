package com.school.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.school.entities.Lectures;

public interface LectureRepository extends JpaRepository<Lectures, Integer>{
	  @Query("SELECT l.title FROM Lectures l")
	    List<String> findAllTitles();
	   Lectures findByTitle(String title);

}
