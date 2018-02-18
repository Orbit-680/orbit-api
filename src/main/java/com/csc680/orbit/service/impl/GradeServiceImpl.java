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
import com.csc680.orbit.model.pojo.Grade;
import com.csc680.orbit.model.pojo.Teacher;
import com.csc680.orbit.repository.AssignmentRepository;
import com.csc680.orbit.repository.GradeRepository;
import com.csc680.orbit.repository.TeacherRepository;
import com.csc680.orbit.repository.UserRepository;
import com.csc680.orbit.service.AssignmentService;
import com.csc680.orbit.service.GradeService;
import com.csc680.orbit.service.UserService;

import javassist.bytecode.stackmap.TypeData.ClassName;

import com.csc680.orbit.utils.Constants;

@Service ("gradeService")
public class GradeServiceImpl implements GradeService{
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Autowired
	private GradeRepository gradeRepository;
	

	@Override
	public List<Grade> getAllGrades() {
		LOGGER.info("getAllGrades service hit");
		List<Grade> grades = (List<Grade>) gradeRepository.findAll();
		return grades;
	}
	
	@Override
	public List<Grade> getAllGradesForAssignment(int assignmentID) {
		LOGGER.info("getAllGradesForAssignment service hit");
		List<Grade> grades = (List<Grade>) gradeRepository.findAllGradesForAssignment(assignmentID);
		return grades;
	}
	
	/*@Override
	public Assignment createAssignment(CreateAssignmentDTO createAssignmentDTO) {
		LOGGER.info("createAssignment service hit");
		Assignment assignment = new Assignment();
		assignment.setCourse(new Course(createAssignmentDTO.getCourseID()));
		assignment.setName(createAssignmentDTO.getName());
		assignment.setMaxPoints(createAssignmentDTO.getMaxPoints());
		Assignment assignmentSaved = (Assignment) assignmentRepository.save(assignment);
		return assignment;
	}*/
	
	

}
