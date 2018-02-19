package com.csc680.orbit.service;

import java.util.List;

import com.csc680.orbit.model.dto.AccountDetailsDTO;
import com.csc680.orbit.model.dto.CreateAssignmentDTO;
import com.csc680.orbit.model.pojo.Assignment;
import com.csc680.orbit.model.pojo.Grade;
import com.csc680.orbit.model.pojo.User;

public interface GradeService {
	List <Grade> getAllGrades();
	List <Grade> getAllGradesForAssignment(int courseID, int assignmentID);
	//Assignment createAssignment(CreateAssignmentDTO createAssignmentDTO);
}
