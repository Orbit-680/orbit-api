package com.csc680.orbit.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javassist.bytecode.stackmap.TypeData.ClassName;

import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc680.orbit.model.Student;
import com.csc680.orbit.repository.StudentRepository;
import com.csc680.orbit.service.StudentService;

@Service ("studentService")
public class StudentServiceImpl implements StudentService
{
    private static final Logger LOGGER =
                                    Logger.getLogger(ClassName.class.getName());
    
    @Autowired
    private StudentRepository studentRepository;
    
    public List<Student> getAllStudents() 
    {
        LOGGER.info("getAllStudents service hit");
        List<Student> students = (List<Student>) studentRepository.findAll();
        return students;
    }

    public Student getStudentById(String Id) 
    {
        Student student = studentRepository.findOne(Id);
        return student;
    }   
}