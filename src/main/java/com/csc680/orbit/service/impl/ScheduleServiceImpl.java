package com.csc680.orbit.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc680.orbit.model.EnrollStudentInClassDTO;
import com.csc680.orbit.model.Schedule;
import com.csc680.orbit.repository.ScheduleRepository;
import com.csc680.orbit.service.ScheduleService;

import javassist.bytecode.stackmap.TypeData.ClassName;

@Service("scheduleService")
public class ScheduleServiceImpl implements ScheduleService {

	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Autowired
	private ScheduleRepository scheduleRepository;

	@Override
	public String enrollStudentsInCourse(EnrollStudentInClassDTO enrollList) {
		LOGGER.info("enrollStudentsInCourse service hit");
		scheduleRepository.enrollStudentsInCourse(enrollList);
		return "";
	}

	@Override
	public List<Schedule> getAllSchedules() {
		LOGGER.info("GetAllSchedules service hit");
		List<Schedule> schedules = (List<Schedule>) scheduleRepository.findAll();
		return schedules;
	}

}
