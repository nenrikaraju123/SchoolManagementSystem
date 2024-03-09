package com.school.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Assessment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int aId;
	
	String title;
	String assessmentLink;
	String description;
	String date;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Assessment() {
		super();
	}
	public int getaId() {
		return aId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAssessmentLink() {
		return assessmentLink;
	}
	public void setAssessmentLink(String assessmentLink) {
		this.assessmentLink = assessmentLink;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public Assessment(int aId, String title, String assessmentLink, String description) {
		super();
		this.aId = aId;
		this.title = title;
		this.assessmentLink = assessmentLink;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Assessment [aId=" + aId + ", title=" + title + ", assessmentLink=" + assessmentLink + ", description="
				+ description + "]";
	}
	
}
