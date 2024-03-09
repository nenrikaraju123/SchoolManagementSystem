package com.school.services;

import java.util.List;

import com.school.entities.Lectures;

public interface LectureService {
	public Lectures createPost(Lectures lectures);
	public Lectures getById(Integer id);
	public Lectures updatePost(Lectures lecture,Integer id);
	public void deleteVideo(Integer id);
	public List<Lectures> getallPost();


}
