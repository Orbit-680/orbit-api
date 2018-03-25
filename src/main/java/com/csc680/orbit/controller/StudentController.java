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

import com.csc680.orbit.model.dto.AccountLinkStudentDTO;
import com.csc680.orbit.model.dto.StudentDTO;
import com.csc680.orbit.model.pojo.AccountLinkStudent;
import com.csc680.orbit.model.pojo.Student;
import com.csc680.orbit.model.pojo.User;
import com.csc680.orbit.service.StudentService;

import javassist.bytecode.stackmap.TypeData.ClassName;
import org.springframework.web.bind.annotation.RequestBody;

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
    
    @RequestMapping(value = "/all-students", method = RequestMethod.GET)
    public List<Student> allStudents()
    {
        LOGGER.info("allStudents endpoint hit");
        List<Student> students = studentService.getAllStudents();
        return students;
    }
    
    @RequestMapping(value = "/get-student/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") String id)
    {
        LOGGER.info("getStudentById endpoint hit find id" + id);
        Student student = studentService.getStudentById(id);
        return student;
    }
    @RequestMapping(value = "/create-student", method = RequestMethod.POST)
    public Student addStudent(@RequestBody Student student)
    {
    	LOGGER.info("Hit the add-student end point.");
        Student newStudent = studentService.addStudent(student);
        return newStudent;
    }
    
    @RequestMapping(value = "/get-student", method = RequestMethod.POST)
    public Student getStudent(@RequestBody StudentDTO studentDto)
    {	
    	LOGGER.info("Hit the get-student end point.");
        Student foundStudent = studentService.getStudent(studentDto);
        LOGGER.info("Here is the student we found: " + foundStudent);
        return foundStudent;
    }
    
    @RequestMapping(value = "/link-student", method = RequestMethod.POST)
    public AccountLinkStudent linkStudent(@RequestBody AccountLinkStudentDTO accountLinkDto)
    {	
    	LOGGER.info("Hit the link-student end point.");
        
    	AccountLinkStudent accountLink = studentService.linkStudent(accountLinkDto);
        return accountLink;
    }
    
    @RequestMapping(value = "/find-linked/{uid}", method = RequestMethod.GET)
    public List<Student> findLinked(@PathVariable("uid") int userID)
    {	
    	LOGGER.info("Hit the get-student end point.");
    	LOGGER.info("user - " + userID);
    	User user = new User();
    	user.setUserID(userID);
    	List<Student> students = studentService.findLinkedStudents(user);
        //LOGGER.info("Here is the student we found: " + students);
        return students;
    }
    
}