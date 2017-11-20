package com.csc680.orbit.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csc680.orbit.model.SearchedStudent;
import com.csc680.orbit.service.SearchedStudentService;
import com.csc680.orbit.service.DBConnection;
import static com.csc680.orbit.database.tables.Student.STUDENT;

import javassist.bytecode.stackmap.TypeData.ClassName;
import org.jooq.DSLContext;
import org.jooq.Record;

public class SearchedStudentController 
{
    private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());
    DSLContext dslContext = DBConnection.getConnection();

    @Autowired
    private SearchedStudentService searchedStudentService;

    public SearchedStudentController(SearchedStudentService searchedStudentService) 
    {
            this.searchedStudentService = searchedStudentService;
    }

    @RequestMapping(value = "/search-for-student/{firstName}-{lastName}-{DOB}-{SSN}",
                            method = RequestMethod.GET)
    public SearchedStudent getSearchedStudent(
                            @PathVariable("firstName") String firstName,
                            @PathVariable("lastName") String lastName,
                            @PathVariable("DOB") String dateOfBirth,
                            @PathVariable("SSN") String studentSSN)
    {
        
        int studentID = (int) this.dslContext.select(STUDENT.ID)
                                          .from(STUDENT)
                                          .where(STUDENT.LAST_NAME.eq(lastName)
                                          .and(STUDENT.FIRST_NAME.eq(firstName))
                                          .and(STUDENT.DATE_OF_BIRTH.eq(dateOfBirth))
                                          .and(STUDENT.SSN.eq(studentSSN)));
                                          
       
        LOGGER.info("GetSearchedStudent controller hit, Name passed: " + firstName + lastName);
        SearchedStudent searchedStudent = searchedStudentService.getSearchedStudentById(studentID);
        return searchedStudent;
    }
}
