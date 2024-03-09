 package com.school.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.entities.Student;
import com.school.services.AttendanceServices;
import com.school.services.StudentServices;

import java.util.List;
import java.util.Map;


@Controller
public class AttendanceController {

    @Autowired
    AttendanceServices attendanceService;
 @Autowired
 StudentServices stuserv;
   
    @PostMapping("/addattendance")
    public ResponseEntity<String> addAttendance(@RequestParam Map<String, String> attendanceData) {
    	 List<Student> studentList= stuserv.getAllStudents();
       
       int i=0;
            String subject = attendanceData.get("subject");
            String date = attendanceData.get("date");

            for (Map.Entry<String, String> entry : attendanceData.entrySet()) {
                if (entry.getKey().startsWith("attendance_")) {
                    String attendanceStatus = entry.getValue();

                   
                        attendanceService.saveAttendance(studentList.get(i).getName(), studentList.get(i).getRegNo(), subject, date, attendanceStatus);
                    i++;
                }
            }
            // Return a response with a success message
            String responseMessage = "Attendance added successfully!";
            return ResponseEntity.status(HttpStatus.CREATED).body(responseMessage);
        
    }
    
    


}   
