package com.csc680.orbit.service;

import java.util.List;

import com.csc680.orbit.model.Student;
import com.csc680.orbit.model.StudentDTO;

public interface StudentService 
{
    List <Student> getAllStudents();   
    Student getStudentById(String Id);
    Student addStudent(Student student);
	Student getStudent(StudentDTO studentDto);
}
