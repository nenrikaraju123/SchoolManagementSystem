package com.school.services;

import java.util.List;

import com.school.entities.Attendance;

public interface AttendanceServices {
	 public void saveAttendance(String studentName, int regNo,String subject, String date, String attendanceStatus);
	 public List<Attendance> getAttendance(int regNo);
	

}
