package com.csc680.orbit.service;

import java.util.List;
import com.csc680.orbit.model.Student;

public interface StudentService 
{
    List <Student> getAllStudents();   
    Student getStudentById(String Id);
}