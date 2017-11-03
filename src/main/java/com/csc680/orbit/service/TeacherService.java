package com.csc680.orbit.service;

import java.util.List;

import com.csc680.orbit.model.Teacher;

public interface TeacherService {
	List <Teacher> getAllTeachers();   
	Teacher getTeacherById(String Id);
        void addTeacher(String firstName, String lastName, String dateOfBirth, 
                        String SSN, String address1, String address2, 
                        String city, String state, String zip);

}
