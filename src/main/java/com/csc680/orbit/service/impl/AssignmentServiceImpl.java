package com.csc680.orbit.service.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc680.orbit.model.dto.AccountDetailsDTO;
import com.csc680.orbit.model.dto.CreateAssignmentDTO;
import com.csc680.orbit.model.pojo.User;
import com.csc680.orbit.model.pojo.Assignment;
import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.model.pojo.Teacher;
import com.csc680.orbit.repository.AssignmentRepository;
import com.csc680.orbit.repository.TeacherRepository;
import com.csc680.orbit.repository.UserRepository;
import com.csc680.orbit.service.AssignmentService;
import com.csc680.orbit.service.UserService;

import javassist.bytecode.stackmap.TypeData.ClassName;

import com.csc680.orbit.utils.Constants;

@Service ("assignmentService")
public class AssignmentServiceImpl implements AssignmentService{
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Autowired
	private AssignmentRepository assignmentRepository;
	

	@Override
	public List<Assignment> getAllAssignments() {
		LOGGER.info("getAllAssignments service hit");
		List<Assignment> assignments = (List<Assignment>) assignmentRepository.findAll();
		return assignments;
	}
	
	@Override
	public List<Assignment> getAllAssignmentsForCourse(int courseID) {
		LOGGER.info("getAllAssignmentsForCourse service hit");
		List<Assignment> assignments = (List<Assignment>) assignmentRepository.findAllAssignmentsForCourse(courseID);
		return assignments;
	}
	
	@Override
	public Assignment createAssignment(CreateAssignmentDTO createAssignmentDTO) {
		LOGGER.info("createAssignment service hit");
		Assignment assignment = new Assignment();
		assignment.setCourse(new Course(createAssignmentDTO.getCourseID()));
		assignment.setName(createAssignmentDTO.getName());
		assignment.setMaxPoints(createAssignmentDTO.getMaxPoints());
		Assignment assignmentSaved = (Assignment) assignmentRepository.save(assignment);
		return assignment;
	}
	
	

}
