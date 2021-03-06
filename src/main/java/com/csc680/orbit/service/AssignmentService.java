package com.csc680.orbit.service;

import java.util.List;

import com.csc680.orbit.model.dto.AccountDetailsDTO;
import com.csc680.orbit.model.dto.CreateAssignmentDTO;
import com.csc680.orbit.model.pojo.Assignment;
import com.csc680.orbit.model.pojo.User;

public interface AssignmentService {
	List <Assignment> getAllAssignments();
	List <Assignment> getAllAssignmentsForCourse(int course);
	Assignment createAssignment(CreateAssignmentDTO createAssignmentDTO);
}
