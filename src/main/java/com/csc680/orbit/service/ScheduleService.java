package com.csc680.orbit.service;

import java.util.List;

import com.csc680.orbit.model.dto.EnrollStudentInClassDTO;
import com.csc680.orbit.model.pojo.Schedule;

public interface ScheduleService {
	List<Schedule> getAllSchedules();
	String enrollStudentsInCourse(EnrollStudentInClassDTO enrollList);
}
