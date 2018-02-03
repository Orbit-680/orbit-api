package com.csc680.orbit.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csc680.orbit.model.dto.AccountLinkStudentDTO;
import com.csc680.orbit.model.dto.EnrollStudentInClassDTO;
import com.csc680.orbit.model.pojo.AccountLinkStudent;
import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.model.pojo.Schedule;
import com.csc680.orbit.repository.CourseRepository;
import com.csc680.orbit.repository.ScheduleRepository;
import com.csc680.orbit.service.CourseService;
import com.csc680.orbit.service.ScheduleService;

import javassist.bytecode.stackmap.TypeData.ClassName;

@RestController
public class ScheduleController {
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Autowired
	private ScheduleService scheduleService;

	public ScheduleController(ScheduleService scheduleService) {
		this.scheduleService = scheduleService;
	}
	
	@RequestMapping(value = "/all-schedules", method = RequestMethod.GET)
	public List<Schedule> allSchedules() {
		LOGGER.info("AllSchedules controller hit");
		List<Schedule> schedules = scheduleService.getAllSchedules();
				
		return schedules;
	}
	
	@RequestMapping(value = "/enroll-students-course", method = RequestMethod.POST)
    public Schedule enrollStudentsInCourse(@RequestBody EnrollStudentInClassDTO enrollList)
    {	
    	LOGGER.info("Hit the link-student end point.");
        
    	String enroll = scheduleService.enrollStudentsInCourse(enrollList);
    	LOGGER.info("RETURNING SUCCESS.");
        return new Schedule();
    }

}
