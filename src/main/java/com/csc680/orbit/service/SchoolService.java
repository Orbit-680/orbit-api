package com.csc680.orbit.service;

import java.util.List;

import com.csc680.orbit.model.pojo.School;

public interface SchoolService {
	List<School> getAllSchools();
	School getSchoolByID(String id);
}
