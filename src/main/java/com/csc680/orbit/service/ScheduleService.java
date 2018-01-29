package com.csc680.orbit.service;

import java.util.List;

import com.csc680.orbit.model.EnrollStudentInClassDTO;
import com.csc680.orbit.model.Schedule;

public interface ScheduleService {
	List<Schedule> getAllSchedules();
	String enrollStudentsInCourse(EnrollStudentInClassDTO enrollList);
}
