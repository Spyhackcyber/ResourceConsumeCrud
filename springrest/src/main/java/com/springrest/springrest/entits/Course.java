package com.springrest.springrest.entits;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	private long id;
	private String title;
	private String Decription;
	
	
	

	public Course(long id, String title, String decription) {
		super();
		this.id = id;
		this.title = title;
		Decription = decription;
		
		
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
	public String getDecription() {
		return Decription;
	}
	
	public void setDecription(String decription) {
		Decription = decription;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", Decription=" + Decription + "]";
	}
	
	
	
}
