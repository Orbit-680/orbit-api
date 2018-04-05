package com.csc680.orbit.controller;

import com.csc680.orbit.model.dto.SaveAttendanceDTO;
import com.csc680.orbit.model.pojo.Attendance;
import com.csc680.orbit.service.AttendanceService;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javassist.bytecode.stackmap.TypeData.ClassName;

@RestController
public class AttendanceController {
    private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Autowired
	private AttendanceService attendanceService;

	public AttendanceController(AttendanceService attendanceService) {
		this.attendanceService = attendanceService;
	}
    @RequestMapping(value = "/all-attendance", method = RequestMethod.GET)
    public List<Attendance> getAllAttendances()
    {
        LOGGER.info("getAllAttendances endpoint hit");
        List<Attendance> attendances = attendanceService.getAllAttendances();
        return attendances;
    }
    
    @RequestMapping(value = "/save-attendance", method = RequestMethod.POST)
    public List<Attendance> saveGrades(@RequestBody SaveAttendanceDTO saveAttendanceDto)
    {	
    	LOGGER.info("Hit the save-attendance end point.");
        
    	List<Attendance> saveAttendance = attendanceService.saveCourseAttendance(saveAttendanceDto);
        return saveAttendance;
    }
    
    @RequestMapping(value = "/student-attendance/{studentID}", method = RequestMethod.GET)
    public List<Attendance> studentAttendance(@PathVariable("studentID") int studentID)
    {
        LOGGER.info("course attendance endpoint hit");
        List<Attendance> studentAttendance = attendanceService.getAllAttendancesForStudent(studentID);
        return studentAttendance;
    }
    
    @RequestMapping(value = "/student-attendace/{studentID}/{courseID}", method = RequestMethod.GET)
    public List<Attendance> studentAttendance(@PathVariable("studentID") int studentID, @PathVariable("courseID") int courseID)
    {
        LOGGER.info("course endpoint hit");
        List<Attendance> studentAttendanceForCourse = attendanceService.getAllAttendancesForStudentinCourse(studentID, courseID);
        return studentAttendanceForCourse;
    }
}
