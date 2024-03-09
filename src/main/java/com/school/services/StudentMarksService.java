package com.school.services;

import java.util.List;

import com.school.entities.StudentMarks;

public interface StudentMarksService
{
public String uploadMarks(int regNo,String studentName,int maths,int physics,int chemistry,int biology,int english,int telugu,String examType,int total);
  public List<StudentMarks> getStudentMarks(int regNo);
}
