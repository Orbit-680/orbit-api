package com.csc680.orbit.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc680.orbit.model.pojo.School;
import com.csc680.orbit.repository.SchoolRepository;
import com.csc680.orbit.service.SchoolService;

import javassist.bytecode.stackmap.TypeData.ClassName;

@Service("schoolService")
public class SchoolServiceImpl implements SchoolService {

	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Autowired
	private SchoolRepository schoolRepository;

	@Override
	public List<School> getAllSchools() {
		LOGGER.info("GetAllSchools service hit");
		List<School> schools = (List<School>) schoolRepository.findAll();
		return schools;
	}

	@Override
	public School getSchoolByID(String id) {
		School school = schoolRepository.findOne(id);
		return school;
	}

}
