package com.csc680.orbit.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.csc680.orbit.model.School;
import com.csc680.orbit.service.SchoolService;

import javassist.bytecode.stackmap.TypeData.ClassName;

@RestController
public class SchoolController {
	
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Autowired
	private SchoolService schoolService;

	public SchoolController(SchoolService schoolService) {
		this.schoolService = schoolService;
	}

	@GetMapping("/all-schools")
	public List<School> allSchools(){
		LOGGER.info("AllSchools controller hit");
		List<School> schools = schoolService.getAllSchools();
		return schools;
	}
	
	@GetMapping("/get-school/{id}")
	public School getSchool(@PathVariable("id") String id) {
		LOGGER.info("GetSchool controller hit, ID passed: " + id);
		School school = schoolService.getSchoolByID(id);
		return school;
	}
	
}
