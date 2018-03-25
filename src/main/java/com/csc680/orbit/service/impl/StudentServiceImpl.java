package com.csc680.orbit.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javassist.bytecode.stackmap.TypeData.ClassName;

import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc680.orbit.exceptions.NotFoundException;
import com.csc680.orbit.model.dto.AccountLinkStudentDTO;
import com.csc680.orbit.model.dto.StudentDTO;
import com.csc680.orbit.model.pojo.AccountLinkStudent;
import com.csc680.orbit.model.pojo.Student;
import com.csc680.orbit.model.pojo.User;
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
    
    public Student addStudent(Student student) 
    {
        Student newStudent = studentRepository.save(student);
        return newStudent;
    }
    
    public Student getStudent(StudentDTO studentDto)
    {
        Student student  = studentRepository.findStudent(studentDto);
        if(student == null){
        	throw new NotFoundException("Could not find the student with those search parameters.");
        }
        return student;
    }
    
    public Student getStudent(Student student)
    {	
    	StudentDTO s = new StudentDTO();
    	s.setFirstName(student.getStudentFirstName());
    	s.setLastName(student.getStudentLastName());
    	s.setDateOfBirth(student.getStudentDateOfBirth());
        Student rs  = studentRepository.findStudent(s);
        if(rs  == null){
        	throw new NotFoundException("Could not find the student with those search parameters.");
        }
        return rs ;
    }
    
    public AccountLinkStudent linkStudent(AccountLinkStudentDTO accountLinkDto)
    {
        AccountLinkStudent accountLink  = studentRepository.linkStudent(accountLinkDto);
        if(accountLink == null){
        	throw new NotFoundException("Could create an account link.");
        }
        return accountLink;
    }
    
    public List <Student> findLinkedStudents(User user)
    {
    	List<Student> students = (List<Student>) studentRepository.findLinkedStudents(user.getUserID());
    	return students;
    }
}