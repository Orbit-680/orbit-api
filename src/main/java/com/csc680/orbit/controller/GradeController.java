package com.csc680.orbit.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csc680.orbit.model.dto.AccountDetailsDTO;
import com.csc680.orbit.model.dto.AccountLinkStudentDTO;
import com.csc680.orbit.model.dto.CreateAssignmentDTO;
import com.csc680.orbit.model.pojo.AccountLinkStudent;
import com.csc680.orbit.model.pojo.Assignment;
import com.csc680.orbit.model.pojo.Grade;
import com.csc680.orbit.model.pojo.User;
import com.csc680.orbit.service.AssignmentService;
import com.csc680.orbit.service.GradeService;
import com.csc680.orbit.service.UserService;

import javassist.bytecode.stackmap.TypeData.ClassName;

@RestController
public class GradeController {
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Autowired
	private GradeService gradeService;

	public GradeController(GradeService gradeService) {
		this.gradeService = gradeService;
	}

	
    @RequestMapping(value = "/all-grades-for-assignment/{assignmentID}", method = RequestMethod.GET)
    public List<Grade> getAllGradesForAssignment(@PathVariable("assignmentID") int assignmentID)
    {
        LOGGER.info("getAllGradesForAssignment endpoint hit find uid " + assignmentID);
        List<Grade> grades = gradeService.getAllGradesForAssignment(assignmentID);
        return grades;
    }
    
    @RequestMapping(value = "/all-grades", method = RequestMethod.GET)
    public List<Grade> allGrades()
    {
        LOGGER.info("allGrades endpoint hit");
        List<Grade> grades = gradeService.getAllGrades();
        return grades;
    }
    
    /*@RequestMapping(value = "/create-assignment", method = RequestMethod.POST)
    public Assignment createAssignment(@RequestBody CreateAssignmentDTO createAssignmentDto)
    {	
    	LOGGER.info("Hit the create-assignment end point.");
        
    	Assignment assignment = assignmentService.createAssignment(createAssignmentDto);
        return assignment;
    }*/
}
