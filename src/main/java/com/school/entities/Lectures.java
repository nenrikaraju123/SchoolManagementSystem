package com.school.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Lectures {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column(length = 500)
	String title;
	@Column(length = 500)
	String description;
	String videoName;
	public Lectures(int id, String title, String description, String videoName) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.videoName = videoName;
	}
	public Lectures() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	@Override
	public String toString() {
		return "Lectures [id=" + id + ", title=" + title + ", description=" + description + ", videoName=" + videoName
				+ "]";
	}
	
	
	

}
