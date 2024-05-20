package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entits.Course;

@Service
public class CourseServiceImpl implements CourseService{

//	List<Course> list;
	
	@Autowired
	private CourseDao coursedao;
	
	public CourseServiceImpl() {
		
//		list=new ArrayList<>();
//		list.add(new Course(145, "Java Core Course", "This Course for Java Developers"));
//		list.add(new Course(111, ".NET Core Course", "This Course for DOT NET Developers"));
//		list.add(new Course(222, "PHP Core Course", "This Course for PHP Developers"));
	}



	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return coursedao.findAll();
	}



	@Override
	public Course getCourse(long courseId) {

   //    Course c=null;
	//	for (Course course : list) {
	//		if(course.getId()==courseId) {
	//			c=course;
	//			break;
	//		}
	//	}
		
		
	//	return c;
		
		return coursedao.getOne(courseId);
	}



	@Override
	public Course addCourse(Course Course) {
	//	list.add(Course);
		coursedao.save(Course);
		return Course;
	}



	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		
/*		list.forEach(e -> {
			if(e.getId()==course.getId()) {
			e.setTitle(course.getTitle());
			e.setDecription(course.getDecription());
			}
		});
*/		
		
		//return course;
		return coursedao.save(course);
		
		
	}



	@Override
	public void deleteCourse(long parselong) {
	//	list=this.list.stream().filter(e->e.getId()!=parselong).collect(Collectors.toList());
		
		Course entity =coursedao.getOne(parselong);
		coursedao.delete(entity);
		
	}

}
