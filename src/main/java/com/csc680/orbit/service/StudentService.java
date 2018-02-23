package com.csc680.orbit.service;

import java.util.List;

import com.csc680.orbit.model.dto.AccountLinkStudentDTO;
import com.csc680.orbit.model.dto.StudentDTO;
import com.csc680.orbit.model.pojo.AccountLinkStudent;
import com.csc680.orbit.model.pojo.Student;
import com.csc680.orbit.model.pojo.User;

public interface StudentService 
{
    List <Student> getAllStudents();   
    Student getStudentById(String Id);
    Student addStudent(Student student);
	Student getStudent(Student student);
	Student getStudent(StudentDTO studentDto);
	AccountLinkStudent linkStudent(AccountLinkStudentDTO accountLinkDto);
	List <Student> findLinkedStudents(User user);
}
