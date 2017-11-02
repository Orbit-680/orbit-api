package com.csc680.orbit.service;

import java.util.List;

import com.csc680.orbit.model.Teacher;

public interface TeacherService {
	List <Teacher> getAllTeachers();   
	Teacher getTeacherById(String Id);

}
