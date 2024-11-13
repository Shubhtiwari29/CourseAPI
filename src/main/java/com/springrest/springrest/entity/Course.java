package com.springrest.springrest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	private long courseId;
	private String title;
	private String description;
	
	public Course(long courseId, String title, String description) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.description = description;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
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

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", description=" + description + "]";
	}
	
	
	
	
}
