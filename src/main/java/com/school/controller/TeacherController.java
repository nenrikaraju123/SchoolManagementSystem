package com.school.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.school.entities.Assessment;
import com.school.entities.Student;
import com.school.entities.Teacher;
import com.school.services.AssessmentService;
import com.school.services.TeacherServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TeacherController {
	String temail;
	@Autowired
	TeacherServices tServ;
	@Autowired
	AssessmentService assessmentService;
	@PostMapping("/addteacher")
	public String addTeacher(@ModelAttribute Teacher t)
	{
		boolean b=tServ.existTeacher((t.getEmail()));
	 if(b)
	 {
		 tServ.addTeacher(t);
		
		 return "teacherlogin";
	 }
	 else
	 {
		 return "teacherregfailed";
	 }
	}
	@PostMapping("/teachervalidation")
	public String validateTeacher(@RequestParam String email,@RequestParam String password,Model model) {
		if(tServ.validateTeacher(email, password))
		{
			temail=email;
		  Teacher teacher=	tServ.getTeacher(email);
		  model.addAttribute("teacher", teacher);
			return "teacherhome";
		}
		else
		{
		return "teacherloginfailed";
		}
		
	}

	@GetMapping("/tprofile")
	public String tProfile(Model model)
	{
		Teacher teacher=tServ.getTeacher(temail);
	   model.addAttribute("teacher", teacher);
	   return "teacherprofile";
	}
	@PostMapping("/uploadassessment")
	 public ResponseEntity<String> uploadAssessment(@ModelAttribute Assessment assessment) {
		assessmentService.addAssessment(assessment);
       
		 String responseMessage = "assessment added  successfully!";
	        return ResponseEntity.status(HttpStatus.CREATED).body(responseMessage);
    }
	
	

}
