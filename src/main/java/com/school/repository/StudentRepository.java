package com.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.entities.Student;

public interface StudentRepository  extends JpaRepository<Student, Integer>
{
  public Student findByRegNo(int regNo);
  public List<String> findByColumnName(String  columnName);
}
