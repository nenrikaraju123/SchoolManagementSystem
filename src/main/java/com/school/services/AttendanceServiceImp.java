package com.school.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.entities.Attendance;
import com.school.entities.Student;
import com.school.repository.AttendanceRepository;
import com.school.repository.StudentRepository;

@Service
public class AttendanceServiceImp implements AttendanceServices{

    @Autowired
    private AttendanceRepository attendanceRepository;
    
   

    public void saveAttendance(String studentName, int regNo,String subject, String date, String attendanceStatus) {
        Attendance attendance = new Attendance();
        attendance.setStudentName(studentName);
        attendance.setSubject(subject);
        attendance.setDate(date);
        attendance.setAttendanceStatus(attendanceStatus);
        attendance.setRegNo(regNo);
        attendanceRepository.save(attendance);
        
    }



	@Override
	public List<Attendance> getAttendance(int regNo) {
		
		return attendanceRepository.findByRegNo(regNo);
	}
   
}

