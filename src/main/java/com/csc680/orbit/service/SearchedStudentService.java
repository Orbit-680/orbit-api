package com.csc680.orbit.service;

import java.util.List;
import com.csc680.orbit.model.SearchedStudent;

public interface SearchedStudentService
{
    List<SearchedStudent> getSearchedStudents();
	SearchedStudent getSearchedStudentById(String id);
}