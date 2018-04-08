package com.csc680.orbit.service;

import java.util.List;

import com.csc680.orbit.model.dto.CreateCourseDTO;
import com.csc680.orbit.model.dto.SaveConductDTO;
import com.csc680.orbit.model.dto.SaveConductResultsDTO;
import com.csc680.orbit.model.pojo.Conduct;
import com.csc680.orbit.model.pojo.Course;

public interface ConductService {
	List<Conduct> getAllConduct();
	List<Conduct> findAllConductForCourse(int courseID);
	SaveConductResultsDTO saveConduct(SaveConductDTO saveConductDTO);
}
