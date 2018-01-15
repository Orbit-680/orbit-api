package com.csc680.orbit.service;

import java.util.List;

import com.csc680.orbit.model.AccountLinkStudent;
import com.csc680.orbit.model.Student;
import com.csc680.orbit.model.StudentDTO;
import com.csc680.orbit.model.User;
import com.csc680.orbit.model.AccountLinkStudentDTO;

public interface StudentService 
{
    List <Student> getAllStudents();   
    Student getStudentById(String Id);
    Student addStudent(Student student);
	Student getStudent(StudentDTO studentDto);
	AccountLinkStudent linkStudent(AccountLinkStudentDTO accountLinkDto);
	List <Student> findLinkedStudents(User user);
}
