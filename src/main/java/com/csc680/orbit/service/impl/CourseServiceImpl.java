package com.csc680.orbit.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc680.orbit.model.dto.CreateCourseDTO;
import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.repository.CourseRepository;
import com.csc680.orbit.service.CourseService;

import javassist.bytecode.stackmap.TypeData.ClassName;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public List<Course> getAllCourses() {
		LOGGER.info("GetAllCourses service hit");
		List<Course> courses = (List<Course>) courseRepository.findAll();
		return courses;
	}

	@Override
	public Course getCourseByID(String id) {
		Course course = courseRepository.findOne(id);
		return course;
	}
	
	@Override
	public List<Course> getCoursesByTeacherId(String teacherId) {
		List<Course> courses = courseRepository.findAllAssociatedWithTeacher(teacherId);
		return courses;
	}
	
	public String assignCoursesToTeacher(List<Course> courseList, String teacherId){
		return courseRepository.assignCoursesToTeacher(courseList, teacherId);
	}
	
	public Course createCourse(CreateCourseDTO createCourseDTO){
		return courseRepository.createCourse(createCourseDTO);
	}

}
