package com.csc680.orbit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.csc680.orbit.model.dto.CreateCourseDTO;
import com.csc680.orbit.model.pojo.Conduct;
import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.model.pojo.Grade;

public interface ConductRepository extends CrudRepository<Conduct, String> {
	List<Conduct> findAllConductForCourse(int courseID);
	boolean saveConduct(Conduct conduct);
}

