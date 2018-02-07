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

	
    /*@RequestMapping(value = "/get-user/{uid}", method = RequestMethod.GET)
    public User getUser(@PathVariable("uid") String uid)
    {
        LOGGER.info("getUser endpoint hit find uid " + uid);
        User user = userService.getUserByUID(uid);
        return user;
    }*/
    
    @RequestMapping(value = "/all-assignments", method = RequestMethod.GET)
    public List<Assignment> allAssignments()
    {
        LOGGER.info("allAssignments endpoint hit");
        List<Assignment> assignments = assignmentService.getAllAssignments();
        return assignments;
    }
}
