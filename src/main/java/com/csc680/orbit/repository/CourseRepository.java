package com.csc680.orbit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.csc680.orbit.model.pojo.Course;

public interface CourseRepository extends CrudRepository<Course, String> {

	List<Course> findAllAssociatedWithTeacher(String teacherId);
	void assignCoursesToTeacher(List<Course> courseList, String teacherId);

}

