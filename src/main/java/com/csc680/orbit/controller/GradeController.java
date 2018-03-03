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
import com.csc680.orbit.model.dto.GetGradesForAssignmentDTO;
import com.csc680.orbit.model.dto.SaveGradesDTO;
import com.csc680.orbit.model.dto.SaveGradesResultsDTO;
import com.csc680.orbit.model.pojo.AccountLinkStudent;
import com.csc680.orbit.model.pojo.Assignment;
import com.csc680.orbit.model.pojo.CourseGrade;
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

	
    @RequestMapping(value = "/all-grades-for-assignment/{courseID}/{assignmentID}", method = RequestMethod.GET)
    public List<Grade> getAllGradesForAssignment(@PathVariable("courseID") int courseID, @PathVariable("assignmentID") int assignmentID)
    {
        LOGGER.info("getAllGradesForAssignment endpoint hit find course " + courseID + " and assignment " + assignmentID);
        List<Grade> grades = gradeService.getAllGradesForAssignment(courseID, assignmentID);
        return grades;
    }
    
    @RequestMapping(value = "/all-grades", method = RequestMethod.GET)
    public List<Grade> allGrades()
    {
        LOGGER.info("allGrades endpoint hit");
        List<Grade> grades = gradeService.getAllGrades();
        return grades;
    }
    
    @RequestMapping(value = "/save-grades", method = RequestMethod.POST)
    public SaveGradesResultsDTO saveGrades(@RequestBody SaveGradesDTO saveGradesDto)
    {	
    	LOGGER.info("Hit the save-grades end point.");
        
    	SaveGradesResultsDTO gradeSaveResult = gradeService.saveGrades(saveGradesDto);
        return gradeSaveResult;
    }
    
    @RequestMapping(value = "/course-grades/{studentID}", method = RequestMethod.GET)
    public List<CourseGrade> courseGrades(@PathVariable("studentID") int studentID)
    {
        LOGGER.info("course endpoint hit");
        List<CourseGrade> grades = gradeService.getCourseGrades(studentID);
        return grades;
    }
    
    @RequestMapping(value = "/student-grades/{studentID}/{courseID}", method = RequestMethod.GET)
    public List<Grade> studentGrades(@PathVariable("studentID") int studentID, @PathVariable("courseID") int courseID)
    {
        LOGGER.info("course endpoint hit");
        List<Grade> grades = gradeService.getStudentGrades(studentID, courseID);
        return grades;
    }
}
