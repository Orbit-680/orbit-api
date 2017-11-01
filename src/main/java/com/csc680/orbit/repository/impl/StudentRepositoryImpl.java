package com.csc680.orbit.repository.impl;


import java.util.ArrayList;
// import java.util.HashMap;
import java.util.List;
// import java.util.Map;

import static com.csc680.orbit.database.Tables.STUDENT;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import com.csc680.orbit.model.Student;
import com.csc680.orbit.recordmapper.StudentRecordMapper;
import com.csc680.orbit.service.DBConnection;
import com.csc680.orbit.repository.StudentRepository;

@Repository ("studentRepository")
public class StudentRepositoryImpl implements StudentRepository
{
	DSLContext dslContext = DBConnection.getConnection();
	
    @Override
    public long count() 
    {
        
        int studentCount = 0;  
        studentCount = this.dslContext.selectCount()
                             .from(STUDENT)
                             .fetchOne(0, int.class);
        return studentCount;
    }

    @Override
    public void delete(String arg0) 
    {
    	// TODO Auto-generated method stub
    }

    @Override
    public void delete(Student arg0) 
    {
	// TODO Auto-generated method stub
		
    }

    @Override
    public void delete(Iterable<? extends Student> arg0) 
    {
	// TODO Auto-generated method stub
    }

    @Override
    public void deleteAll() 
    {
	// TODO Auto-generated method stub
    }

    @Override
    public boolean exists(String arg0) 
    {
        int studentCount = studentCount = this.dslContext
                                   .selectCount()
                                   .from(STUDENT)
                                   .where(STUDENT.ID.eq(Integer.parseInt(arg0)))
                                   .fetchOne(0, int.class);
        boolean studentExists = false;
        
        if(studentCount != 0){
        	studentExists = true;
        }
        
        return studentExists;
    }

    @Override
    public Iterable<Student> findAll() 
    {
        List<Student> students = new ArrayList<Student>();
        students = this.dslContext.select(STUDENT.FIRST_NAME,
                                     STUDENT.LAST_NAME,
                                     STUDENT.ID,
                                     STUDENT.DATE_OF_BIRTH,
                                     STUDENT.SSN,
                                     STUDENT.ADDRESS_1,
                                     STUDENT.ADDRESS_2,
                                     STUDENT.CITY,
                                     STUDENT.STATE,
                                     STUDENT.ZIP_CODE,
                                     STUDENT.GRADE,
                                     STUDENT.MOTHER_FIRST_NAME,
                                     STUDENT.MOTHER_LAST_NAME,
                                     STUDENT.MOTHER_SSN,
                                     STUDENT.MOTHER_ADDRESS_1,
                                     STUDENT.MOTHER_ADDRESS_2,
                                     STUDENT.MOTHER_CITY, 
                                     STUDENT.MOTHER_STATE,
                                     STUDENT.MOTHER_ZIP_CODE,
                                     STUDENT.MOTHER_HOME_PHONE,
                                     STUDENT.MOTHER_CELL_PHONE,
                                     STUDENT.MOTHER_EMAIL,
                                     STUDENT.FATHER_FIRST_NAME,
                                     STUDENT.FATHER_LAST_NAME,
                                     STUDENT.FATHER_SSN,
                                     STUDENT.FATHER_ADDRESS_1,
                                     STUDENT.FATHER_ADDRESS_2,
                                     STUDENT.FATHER_CITY, 
                                     STUDENT.FATHER_STATE,
                                     STUDENT.FATHER_ZIP_CODE,
                                     STUDENT.FATHER_HOME_PHONE,
                                     STUDENT.FATHER_CELL_PHONE,
                                     STUDENT.FATHER_EMAIL)
                             .from(STUDENT)
                             .fetch()
                             .map(new StudentRecordMapper());
        return students;

    }

    public Iterable<Student> findAll(Iterable<String> arg0) 
    {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Student findOne(String arg0) 
    {
        List<Student> students = new ArrayList<Student>();
        int studentId = Integer.parseInt(arg0);
        students = this.dslContext.select(STUDENT.FIRST_NAME,
                                     STUDENT.LAST_NAME,
                                     STUDENT.ID,
                                     STUDENT.DATE_OF_BIRTH,
                                     STUDENT.SSN,
                                     STUDENT.ADDRESS_1,
                                     STUDENT.ADDRESS_2,
                                     STUDENT.CITY,
                                     STUDENT.STATE,
                                     STUDENT.ZIP_CODE,
                                     STUDENT.GRADE,
                                     STUDENT.MOTHER_FIRST_NAME,
                                     STUDENT.MOTHER_LAST_NAME,
                                     STUDENT.MOTHER_SSN,
                                     STUDENT.MOTHER_ADDRESS_1,
                                     STUDENT.MOTHER_ADDRESS_2,
                                     STUDENT.MOTHER_CITY, 
                                     STUDENT.MOTHER_STATE,
                                     STUDENT.MOTHER_ZIP_CODE,
                                     STUDENT.MOTHER_HOME_PHONE,
                                     STUDENT.MOTHER_CELL_PHONE,
                                     STUDENT.MOTHER_EMAIL,
                                     STUDENT.FATHER_FIRST_NAME,
                                     STUDENT.FATHER_LAST_NAME,
                                     STUDENT.FATHER_SSN,
                                     STUDENT.FATHER_ADDRESS_1,
                                     STUDENT.FATHER_ADDRESS_2,
                                     STUDENT.FATHER_CITY, 
                                     STUDENT.FATHER_STATE,
                                     STUDENT.FATHER_ZIP_CODE,
                                     STUDENT.FATHER_HOME_PHONE,
                                     STUDENT.FATHER_CELL_PHONE,
                                     STUDENT.FATHER_EMAIL)
                             .from(STUDENT)
                             .where(STUDENT.ID.eq(studentId))
                             .fetch()
                             .map(new StudentRecordMapper());
        return students.get(0);
    }

    @Override
    public <S extends Student> S save(S arg0) 
    {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public <S extends Student> Iterable<S> save(Iterable<S> arg0) 
    {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<Student> findById(String id) 
    {
	return null;
    }
}
