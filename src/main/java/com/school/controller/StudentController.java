package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.entities.Assessment;
import com.school.entities.Attendance;
import com.school.entities.Student;
import com.school.entities.StudentMarks;
import com.school.services.AssessmentService;
import com.school.services.AttendanceServices;
import com.school.services.StudentMarksService;
import com.school.services.StudentServices;

@Controller
public class StudentController {
	int sRegNo;

	@Autowired
	StudentServices stdServ;
	
	@Autowired
	StudentMarksService studentMarksService;
	
	@Autowired
	AttendanceServices attendanceService;
	
	@PostMapping("/addstudent")
	public String addStudent(@ModelAttribute Student s)
	{
		boolean b=stdServ.existStudent(s.getRegNo());
	 if(b)
	 {
		 stdServ.addStudent(s);
		 
		 return "studentlogin";
	 }
	 else
	 {
		 return "studentregfailed";
	 }
	}
	 @PostMapping("/validatestudent")
	 public String validateStudent(@RequestParam int regNo,@RequestParam String dob,Model model)
	 {
		 if(stdServ.validateStudent(regNo, dob))
		 {
			Student student= stdServ.getStudent(regNo);
			model.addAttribute("student", student);
			sRegNo=regNo;
			 return "studenthome";
		 }
		 else
		 {
			 return "studentloginfailed";
		 }
	 }
	 @GetMapping("/markattendence")
		public String markattendence(Model model)
		
		{
			List<Student> students=stdServ.getAllStudents();
			model.addAttribute("students", students);
			return "attendance";
			
		}
	 @GetMapping("/uploadmarks")
		public String uploadmarks(Model model)
		
		{
			List<Student> students=stdServ.getAllStudents();
			model.addAttribute("students", students);
			return "uploadmarks";
			
		}
	 @GetMapping("/studentdetails")
	 public String getMethodName(Model model) {
	 	List<Student> students=stdServ.getAllStudents();
	 	model.addAttribute("students", students);
	 	return "studentdetails";
	 }
	 @GetMapping("/studentprofile")
		public String studentProfile(Model model ) {
		 Student student=stdServ.getStudent(sRegNo);
		 model.addAttribute("student", student);
		 
			return "studentprofile";
		}
	 @GetMapping("/getmarks")
	 public String viewMarks(Model model) {
		 List<StudentMarks> studentMarks=studentMarksService.getStudentMarks(sRegNo );
		 model.addAttribute("studentMarks", studentMarks);
	 	return "viewmarks";
	 }
	 @GetMapping("/getattendance")
	    public String getAttendance(Model model) {
	    	List<Attendance> list=attendanceService.getAttendance(sRegNo);
	    	model.addAttribute("list", list);
	    	
	        return "viewattendance";
	    }
	
	 
	

	
	
	
}
