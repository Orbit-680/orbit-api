package com.csc680.orbit.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javassist.bytecode.stackmap.TypeData.ClassName;

import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc680.orbit.model.Teacher;
import com.csc680.orbit.repository.TeacherRepository;
import com.csc680.orbit.service.TeacherService;

@Service ("teacherService")
public class TeacherServiceImpl implements TeacherService{
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Autowired
	private TeacherRepository teacherRepository;
	
	public List<Teacher> getAllTeachers() 
	{
		LOGGER.info("getAllTeachers service hit");
		List<Teacher> teachers = (List<Teacher>) teacherRepository.findAll();
		return teachers;
	}
	
	public Teacher getTeacherById(String Id) 
	{
		Teacher teacher = teacherRepository.findOne(Id);
		return teacher;
	}   

    @Override
    public Teacher addTeacher(Teacher teacher) 
    {
        Teacher newTeacher = new Teacher();
        newTeacher.setFirstName(teacher.getFirstName());
        newTeacher.setLastName(teacher.getLastName());
        newTeacher.setDateOfBirth(teacher.getDateOfBirth());
        newTeacher.setSsn(teacher.getSsn());
        newTeacher.setAddress1(teacher.getAddress1());
        newTeacher.setAddress2(teacher.getAddress2());
        newTeacher.setCity(teacher.getCity());
        newTeacher.setState(teacher.getState());
        newTeacher.setZip(teacher.getZip());
        
        newTeacher = teacherRepository.save(newTeacher);
        return newTeacher;
    }

}
