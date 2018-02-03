package com.csc680.orbit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

import com.csc680.orbit.model.pojo.Teacher;
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
    
    @RequestMapping(value = "/all-teachers", method = RequestMethod.GET)
    public List<Teacher> allTeachers()
    {
        LOGGER.info("allTeachers endpoint hit TeacherController");
        List<Teacher> teachers = teacherService.getAllTeachers();
        return teachers;
    }

    @RequestMapping(value = "/get-teacher/{id}", method = RequestMethod.GET)
    public Teacher getTeacher(@PathVariable("id") String id)
    {
        LOGGER.info("getTeacher endpoint hit find id " + id);
        Teacher teacher = teacherService.getTeacherById(id);
        return teacher;
    }
    
    @RequestMapping(value = "/add-teacher", method = RequestMethod.POST)
    public Teacher addTeacher(@RequestBody Teacher teacher)
    {
    	LOGGER.info("Hit the add-teacher end point.");
        Teacher newTeacher = teacherService.addTeacher(teacher);
        return newTeacher;
    }
    
    @RequestMapping(value = "/get-teacher-by-uid/{uid}", method = RequestMethod.GET)
    public Teacher getTeacherByUid(@PathVariable("uid") String uid)
    {
        LOGGER.info("Getting teacher by UID and returning Teacher. ");
        Teacher teacher = teacherService.getTeacherByUid(uid);
        LOGGER.info("Found a Teacher. " + teacher.toString());
        return teacher;
    }
}
