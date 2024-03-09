package com.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.school.entities.Assessment;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MapController {
	@GetMapping("/studentlogin")
	public String studentLogin()
	{
		return "studentlogin";
	}
	@GetMapping("/teacherlogin")
	public String teacherlogin()
	{
		return "teacherlogin";
	}
	@GetMapping("/teacherregister")
	public String teacherregistration()
	{
		return "teacherregistration";
	}
	@GetMapping("/studentregister")
	public String studentregistration()
	{
		return "studentregistration";
	}
	@GetMapping("/logout")
	public String logout()
	{
		return "index";
	}
	@GetMapping("/uploadlecture")
	public String  uploadLectures()
	{
		return "uploadlectures";
	}
	@GetMapping("/addassessment")
	public String addAssessment() {
		return "uploadassessment";
	}
	
	
	
	

}
