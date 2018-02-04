package com.csc680.orbit.service;

import java.util.List;

import com.csc680.orbit.model.pojo.Course;

public interface CourseService {
	List<Course> getAllCourses();
	Course getCourseByID(String id);
	List<Course> getCoursesByTeacherId(String teacherId);
	void assignCoursesToTeacher(List<Course> courseList, String teacherId);
}
