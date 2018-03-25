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
import com.csc680.orbit.model.pojo.User;
import com.csc680.orbit.service.AssignmentService;
import com.csc680.orbit.service.UserService;

import javassist.bytecode.stackmap.TypeData.ClassName;

@RestController
public class AssignmentController {
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Autowired
	private AssignmentService assignmentService;

	public AssignmentController(AssignmentService assignmentService) {
		this.assignmentService = assignmentService;
	}

	
    @RequestMapping(value = "/all-assignments-for-course/{courseID}", method = RequestMethod.GET)
    public List<Assignment> getAllAssignmentsForCourse(@PathVariable("courseID") int courseID)
    {
        LOGGER.info("getAllAssignmentsForCourse endpoint hit find uid " + courseID);
        List<Assignment> assignments = assignmentService.getAllAssignmentsForCourse(courseID);
        return assignments;
    }
    
    @RequestMapping(value = "/all-assignments", method = RequestMethod.GET)
    public List<Assignment> allAssignments()
    {
        LOGGER.info("allAssignments endpoint hit");
        List<Assignment> assignments = assignmentService.getAllAssignments();
        return assignments;
    }
    
    @RequestMapping(value = "/create-assignment", method = RequestMethod.POST)
    public Assignment createAssignment(@RequestBody CreateAssignmentDTO createAssignmentDto)
    {	
    	LOGGER.info("Hit the create-assignment end point.");
        
    	Assignment assignment = assignmentService.createAssignment(createAssignmentDto);
        return assignment;
    }
}
