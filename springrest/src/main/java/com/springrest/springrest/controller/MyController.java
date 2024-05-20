package com.springrest.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entits.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {

    @Autowired
	private CourseService courseservice;
	
	@GetMapping("/home")
	public String home() {
		System.out.println("Helskdsajkdsad");
		return "Hello Amit!!!!!!!!!!!!!";
	}
	
	
	//@RequestMapping(path="/courses", method = RequestMethod.GET)
	@GetMapping("/courses")
	public List<Course> getcourse() {
		
	return this.courseservice.getCourses();	
	}
	
	
	//Single Courses get
	@GetMapping("/courses/{courseId}")
	public Course getcourse(@PathVariable String courseId) {
		
		return this.courseservice.getCourse(Long.parseLong(courseId));	
		
	}
	
	//Single Course Add
	@PostMapping(path="/courses", consumes = "application/json")
	//@PostMapping(path="/courses", consumes = "application/json")
	public Course addcourse(@RequestBody Course course) {

		return this.courseservice.addCourse(course);

	}
	
	//Update Course using PUT request
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseservice.updateCourse(course);
	}
	
	//delete the Course
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
		
		try {
		this.courseservice.deleteCourse(Long.parseLong(courseId));
		     return new ResponseEntity<>(HttpStatus.OK);
		}   catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
