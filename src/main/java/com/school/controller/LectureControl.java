package com.school.controller;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.school.entities.FileModel;
import com.school.entities.Lectures;
import com.school.repository.LectureRepository;
import com.school.services.FileService;
import com.school.services.LectureService;

import jakarta.servlet.http.HttpServletResponse;


@Controller
public class LectureControl {
	
	@Value("${project.video")
	String path;
	
	@Autowired
	LectureService lectureServices;
	@Autowired
	FileService fileService;
	@Autowired
	LectureRepository lectureRepository;
	Integer leId;
	@PostMapping("/save")
	public String saveLecture(@ModelAttribute Lectures lectures,Model model) {
		
		lectureServices.createPost(lectures);
		leId=lectures.getId();
		
		
		model.addAttribute("lectures",lectures);
		return "uploadvideo";
	}
	@GetMapping("/ge/{id}")
	public String getLectureById(@PathVariable Integer id)
	{
		return "index";
	}
	@GetMapping("/j")
	public ResponseEntity<?> getAllVideo()
	{
		return new ResponseEntity<List<Lectures>>(lectureServices.getallPost(),HttpStatus.OK);
	}
	@PostMapping("/upload")
	public ResponseEntity<String> uploading(@RequestParam("video") MultipartFile video) throws IOException {
	    System.out.println(leId);
	    Lectures l = lectureServices.getById(leId); 
	    
	    FileModel fileModel = fileService.uploadVideo(path, video);
	    l.setVideoName(fileModel.getVideoFileName());
	    Lectures finallyUpload = lectureServices.updatePost(l, leId);
	    
	    return ResponseEntity.ok("Video successfully uploaded!");
	}

	@GetMapping( value ="/playvideo",produces=MediaType.ALL_VALUE)
	public void playVideo(@RequestParam("title") String title, HttpServletResponse response) throws IOException
	{
		Lectures lec=lectureRepository.findByTitle(title);
		int id=lec.getId();
		Optional<Lectures> lecture=lectureRepository.findById(id);
		InputStream resource =fileService.getVideoFile(path, lecture.get().getVideoName(),id);
		response.setContentType(MediaType.ALL_VALUE);
		StreamUtils.copy(resource,response.getOutputStream());
	}
	@GetMapping("/lectureTitles")
	public String showVideoPlayer(Model model) {
	    List<String> lectureTitles = lectureRepository.findAllTitles();
	    model.addAttribute("lectureTitles", lectureTitles);
	    return "lecturetitles"; // Render the first HTML page
	}

	@PostMapping("/play")
	public String playVideoByTitle(@RequestParam("lectureTitle") String lectureTitle, Model model) {
	    model.addAttribute("lectureTitle", lectureTitle);
	    return "getlectures"; 
	}
	
	
	

}
