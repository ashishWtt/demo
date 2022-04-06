package com.springrest.courserest.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.courserest.entity.Course;
@Service

public class CourseServiceImpl  implements CourseService

{

List<Course>list;
public CourseServiceImpl()
{
list=new ArrayList<>();
list.add(new Course(101,"java","Basic content in core java"));
list.add(new Course(102,"C","C is the basic leng "));
list.add(new Course(103,"C++","C++ is the basic leng "));
list.add(new Course(104,"C#","C# is the basic leng "));
}

public List<Course> getCourses() {
	
		return list;
	}

@Override
public Course getCourse(long courseId) {
	
	Course c=null;
	{
		for(Course course:list)
		{
			if (course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
	}
	return c;
}

}
