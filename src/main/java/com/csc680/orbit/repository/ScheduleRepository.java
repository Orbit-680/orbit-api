package com.csc680.orbit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.csc680.orbit.model.EnrollStudentInClassDTO;
import com.csc680.orbit.model.Schedule;

public interface ScheduleRepository extends CrudRepository<Schedule, String>
{
	String enrollStudentsInCourse(EnrollStudentInClassDTO enrollList);
}
