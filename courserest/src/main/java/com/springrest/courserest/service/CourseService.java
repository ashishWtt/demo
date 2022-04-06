package com.springrest.courserest.service;

import java.util.List;

import com.springrest.courserest.entity.Course;

public interface CourseService 
{

	public List<Course> getCourses();
	
	public Course getCourse(long courseId);

}
