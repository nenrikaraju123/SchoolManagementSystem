package com.school.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.entities.Student;
import com.school.entities.StudentMarks;
import com.school.services.StudentMarksService;
import com.school.services.StudentServices;

import java.util.List;
import java.util.Map;

@Controller
public class StudentMarksController {

    @Autowired
    private StudentMarksService studentMarksService;
    @Autowired
    StudentServices studentService;

    @PostMapping("/addmarks")
    public ResponseEntity<String> uploadMarks(@RequestParam Map<String, String> marksData) {
        List<Student> studentList = studentService.getAllStudents();
       
        for (Student student : studentList) {
          int regNo = student.getRegNo();
            String studentName = student.getName();
            int maths = Integer.parseInt(marksData.get("maths_"+regNo));
            int physics = Integer.parseInt(marksData.get("physics_"+regNo));
            int chemistry = Integer.parseInt(marksData.get("chemistry_" + regNo));
            int biology = Integer.parseInt(marksData.get("biology_" + regNo));
            int english = Integer.parseInt(marksData.get("english_" + regNo));
            int telugu = Integer.parseInt(marksData.get("telugu_" + regNo));
            int total = Integer.parseInt(marksData.get("total_" + regNo));
            String examType=marksData.get("examType");
          
           // System.out.println(maths+" "+physics+" "+" "+chemistry+" "+biology+" "+english+" "+telugu+" "+studentName+" "+regNo);
            studentMarksService.uploadMarks(regNo, studentName, maths, physics, chemistry, biology, english, telugu,examType,total);
        }
        String responseMessage = "marks added successfully!";
        return ResponseEntity.status(HttpStatus.CREATED).body(responseMessage);
    }
    
	 
}

