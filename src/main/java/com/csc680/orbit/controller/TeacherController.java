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

import com.csc680.orbit.model.Teacher;
import com.csc680.orbit.service.TeacherService;

import javassist.bytecode.stackmap.TypeData.ClassName;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TeacherController {
	@Autowired
    private TeacherService teacherService;
    
    public TeacherController(TeacherService teacherService)
    {
        this.teacherService = teacherService;
    }
    
    private static final Logger LOGGER = 
                                    Logger.getLogger(ClassName.class.getName());
    
    @GetMapping("/all-teachers")
    public List<Teacher> allTeachers()
    {
        LOGGER.info("allTeachers endpoint hit");
        List<Teacher> teachers = teacherService.getAllTeachers();
        return teachers;
    }
    
    @GetMapping(value = "/get-teacher/{id}")
    public Teacher getTeacher(@PathVariable("id") String id)
    {
        LOGGER.info("getTeacher endpoint hit find id" + id);
        Teacher teacher = teacherService.getTeacherById(id);
        return teacher;
    }

}
