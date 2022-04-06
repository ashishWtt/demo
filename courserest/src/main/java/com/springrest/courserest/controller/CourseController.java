package com.springrest.courserest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.courserest.entity.Course;
import com.springrest.courserest.service.CourseService;

@RestController
public class CourseController {
	@Autowired
private CourseService cservice;

	@GetMapping("/courses")
public List<Course> getCourses() 
	{
		return this.cservice.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		return this.cservice.getCourse(Long.parseLong(courseId));
	}
		
}
