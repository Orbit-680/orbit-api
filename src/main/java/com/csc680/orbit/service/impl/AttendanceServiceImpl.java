package com.csc680.orbit.service.impl;

import com.csc680.orbit.model.dto.SaveAttendanceDTO;
import com.csc680.orbit.model.pojo.Attendance;
import com.csc680.orbit.service.AttendanceService;
import java.util.List;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.repository.AttendanceRepository;
import java.util.ArrayList;
import java.util.logging.Level;

import javassist.bytecode.stackmap.TypeData.ClassName;

@Service ("attendanceService")
public class AttendanceServiceImpl implements AttendanceService{
    private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());
    
    @Autowired
    private AttendanceRepository attendanceRepository;


    @Override
    public List<Attendance> getAllAttendances() {
        LOGGER.info("getAllAttendances service hit");
	List<Attendance> attendances = (List<Attendance>) attendanceRepository.findAll();
	return attendances;
    }

    @Override
    public List<Attendance> getAllAttendancesForStudent(int studentId) {
        LOGGER.log(Level.INFO, "getAllAttendancesForStudentId service hit");
	List<Attendance> attendances = (List<Attendance>) attendanceRepository.findAllAttendancesForStudent(studentId);
	return attendances;
    }

    @Override
    public List<Attendance> getAllAttendancesForStudentinCourse(int studentId, int courseId) {
        LOGGER.log(Level.INFO, "getAllAttendancesForStudentInCourse service hit");
	List<Attendance> attendances = (List<Attendance>) attendanceRepository.findAllAttendancesForStudentInCourse(studentId, courseId);
	return attendances;
    }

    @Override
    public List<Attendance> saveCourseAttendance(SaveAttendanceDTO saveAttendances) {
        LOGGER.log(Level.INFO, "saveAttendance service hit");
        List<Attendance> attendances = new ArrayList<>();
        for(Attendance attendance : saveAttendances.getAttendanceList())
        {
            attendanceRepository.saveAttendance(attendance);
            attendances.add(attendance);
        }
        
        return attendances;
    }

    @Override
    public List<Attendance> getAllAttendanceForCourse(int courseId) {
         LOGGER.log(Level.INFO, "getAllAttendanceForCourse service hit");
	List<Attendance> attendances = (List<Attendance>) attendanceRepository.findAllAttendanceForCourse(courseId);
	return attendances;
    }
    
}
