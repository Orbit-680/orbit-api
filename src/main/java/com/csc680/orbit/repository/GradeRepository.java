package com.csc680.orbit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.csc680.orbit.model.dto.CreateAssignmentDTO;
import com.csc680.orbit.model.dto.SaveGradesDTO;
import com.csc680.orbit.model.dto.SaveGradesResultsDTO;
import com.csc680.orbit.model.pojo.Assignment;
import com.csc680.orbit.model.pojo.Grade;
import com.csc680.orbit.model.pojo.Student;

public interface GradeRepository extends CrudRepository<Grade, String>{
	List<Grade> findAllGradesForAssignment(int courseID, int assignmentID);
	boolean saveGrade(Grade grade);
}
