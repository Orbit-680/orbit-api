package com.csc680.orbit.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc680.orbit.model.SearchedStudent;
import com.csc680.orbit.repository.SearchedStudentRepository;
import com.csc680.orbit.service.SearchedStudentService;

import javassist.bytecode.stackmap.TypeData.ClassName;

public class SearchedStudentServiceImpl implements SearchedStudentService
{
    private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

    @Autowired
    private SearchedStudentRepository SearchedStudentRepository;
        
    @Override
    public List<SearchedStudent> getSearchedStudents() 
    {
        return null;
    }

    @Override
    public SearchedStudent getSearchedStudentById(String id) 
    {
        SearchedStudent student = SearchedStudentRepository.findOne(id);
        return student;
    }
    
}
