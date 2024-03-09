package com.school.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.school.entities.Assessment;
import com.school.services.AssessmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AssessmentController {
	@Autowired
	AssessmentService assessmentService;
	
	 @GetMapping("/getassessments")
	 public  String getAssessments(Model model ) {
		 List<String> list=assessmentService.getAll();
		 model.addAttribute("list", list);
	 	return "assessmentlist";
	 }
@PostMapping("/viewassessment")
public String getAssessment(@RequestParam String title,Model model) {
    Assessment assessment=assessmentService.getAssessment(title);
    model.addAttribute("assessment", assessment);
    
    return "viewassessment";
}

}
