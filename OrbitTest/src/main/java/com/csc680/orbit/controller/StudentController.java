package com.csc680.orbit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javassist.bytecode.stackmap.TypeData.ClassName;

import java.util.List;
import java.util.logging.Logger;

import com.csc680.orbit.model.Student;
import com.csc680.orbit.service.StudentService;

import javassist.bytecode.stackmap.TypeData.ClassName;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StudentController 
{
    @Autowired
    private StudentService studentService;
    
    public StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }
    
    private static final Logger LOGGER = 
                                    Logger.getLogger(ClassName.class.getName());
    
    @GetMapping("/all-students")
    public List<Student> allStudents()
    {
        LOGGER.info("allStudents endpoint hit");
        List<Student> students = studentService.getAllStudents();
        return students;
    }
    
    @GetMapping(value = "/get-student/{id}")
    public Student getStudent(@PathVariable("id") String id)
    {
        LOGGER.info("getStudent endpoint hit find id" + id);
        Student student = studentService.getStudentById(id);
        return student;
    }
}