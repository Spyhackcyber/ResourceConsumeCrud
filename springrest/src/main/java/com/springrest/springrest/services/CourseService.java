package com.springrest.springrest.services;

import java.util.List;


import com.springrest.springrest.entits.Course;

public interface CourseService {

	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course Course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(long parselog);
}
