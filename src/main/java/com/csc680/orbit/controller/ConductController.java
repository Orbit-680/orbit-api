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
import com.csc680.orbit.model.dto.SaveConductDTO;
import com.csc680.orbit.model.dto.SaveConductResultsDTO;
import com.csc680.orbit.model.dto.SaveGradesDTO;
import com.csc680.orbit.model.dto.SaveGradesResultsDTO;
import com.csc680.orbit.model.pojo.AccountLinkStudent;
import com.csc680.orbit.model.pojo.Assignment;
import com.csc680.orbit.model.pojo.Conduct;
import com.csc680.orbit.model.pojo.CourseGrade;
import com.csc680.orbit.model.pojo.Grade;
import com.csc680.orbit.model.pojo.User;
import com.csc680.orbit.service.AssignmentService;
import com.csc680.orbit.service.ConductService;
import com.csc680.orbit.service.GradeService;
import com.csc680.orbit.service.UserService;

import javassist.bytecode.stackmap.TypeData.ClassName;

@RestController
public class ConductController {
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Autowired
	private ConductService conductService;

	public ConductController(ConductService conductService) {
		this.conductService = conductService;
	}
    
    @RequestMapping(value = "/all-conduct", method = RequestMethod.GET)
    public List<Conduct> allConduct()
    {
        LOGGER.info("allConduct endpoint hit");
        List<Conduct> conduct = conductService.getAllConduct();
        return conduct;
    }
    
    @RequestMapping(value = "/course-conduct/{courseID}", method = RequestMethod.GET)
    public List<Conduct> getCourseConduct(@PathVariable("courseID") int courseID)
    {
        LOGGER.info("getCourseConduct endpoint hit");
        List<Conduct> conducts = conductService.findAllConductForCourse(courseID);
        return conducts;
    }
    
    @RequestMapping(value = "/save-conduct", method = RequestMethod.POST)
    public SaveConductResultsDTO saveConduct(@RequestBody SaveConductDTO saveConductDto)
    {	
    	LOGGER.info("Hit the save-conduct end point.");
        
    	SaveConductResultsDTO conductSaveResult = conductService.saveConduct(saveConductDto);
        return conductSaveResult;
    }
    
    /*@RequestMapping(value = "/course-grades/{studentID}", method = RequestMethod.GET)
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
    }*/
}
