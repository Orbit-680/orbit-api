package com.csc680.orbit.service;

import java.util.List;

import com.csc680.orbit.model.Course;

public interface CourseService {
	List<Course> getAllCourses();
	Course getCourseByID(String id);
}
