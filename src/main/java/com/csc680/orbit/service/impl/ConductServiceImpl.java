package com.csc680.orbit.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc680.orbit.model.dto.CreateCourseDTO;
import com.csc680.orbit.model.dto.SaveConductDTO;
import com.csc680.orbit.model.dto.SaveConductResultsDTO;
import com.csc680.orbit.model.dto.SaveGradesDTO;
import com.csc680.orbit.model.dto.SaveGradesResultsDTO;
import com.csc680.orbit.model.pojo.Conduct;
import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.model.pojo.Grade;
import com.csc680.orbit.repository.ConductRepository;
import com.csc680.orbit.repository.CourseRepository;
import com.csc680.orbit.service.ConductService;
import com.csc680.orbit.service.CourseService;

import javassist.bytecode.stackmap.TypeData.ClassName;

@Service("conductService")
public class ConductServiceImpl implements ConductService {

	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Autowired
	private ConductRepository conductRepository;

	@Override
	public List<Conduct> getAllConduct() {
		LOGGER.info("GetAllConduct service hit");
		List<Conduct> conducts = (List<Conduct>) conductRepository.findAll();
		return conducts;
	}
	
	@Override
	public List<Conduct> findAllConductForCourse(int courseID) {
		LOGGER.info("FindAllConductForCourse service hit");
		List<Conduct> conducts = (List<Conduct>) conductRepository.findAllConductForCourse(courseID);
		return conducts;
	}
	
	@Override
	public SaveConductResultsDTO saveConduct(SaveConductDTO saveConductDTO) {
		LOGGER.info("saveConduct service hit");
		SaveConductResultsDTO conductSaveResults = new SaveConductResultsDTO();
		for(Conduct conduct : saveConductDTO.getConductList())
		{
			conductRepository.saveConduct(conduct);
			conductSaveResults.addResult(conduct.getConductId(), true);
		}
		
		return conductSaveResults;
	}
	
	

	/*@Override
	public Course getCourseByID(String id) {
		Course course = courseRepository.findOne(id);
		return course;
	}
	
	@Override
	public List<Course> getCoursesByTeacherId(String teacherId) {
		List<Course> courses = courseRepository.findAllAssociatedWithTeacher(teacherId);
		return courses;
	}
	
	public String assignCoursesToTeacher(List<Course> courseList, String teacherId){
		return courseRepository.assignCoursesToTeacher(courseList, teacherId);
	}
	
	public Course createCourse(CreateCourseDTO createCourseDTO){
		return courseRepository.createCourse(createCourseDTO);
	}*/

}
