package com.csc680.orbit.service;

import java.util.List;

import com.csc680.orbit.model.dto.CreateCourseDTO;
import com.csc680.orbit.model.pojo.Course;

public interface CourseService {
	List<Course> getAllCourses();
	Course getCourseByID(String id);
	List<Course> getCoursesByTeacherId(String teacherId);
	String assignCoursesToTeacher(List<Course> courseList, String teacherId);
	Course createCourse(CreateCourseDTO createCourseDTO);
}
