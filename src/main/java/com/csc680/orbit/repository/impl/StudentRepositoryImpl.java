package com.csc680.orbit.repository.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.csc680.orbit.database.Tables.*;
import static org.jooq.impl.DSL.*;
import java.sql.*;
import org.jooq.*;
import org.jooq.impl.*;


import org.springframework.stereotype.Repository;

import com.csc680.orbit.RecordMapper.StudentRecordMapper;
import com.csc680.orbit.model.Student;
import com.csc680.orbit.service.DBConnection;
import com.csc680.orbit.repository.StudentRepository;

@Repository ("studentRepository")
public class StudentRepositoryImpl implements StudentRepository
{
    @Override
    public long count() 
    {
	// TODO Auto-generated method stub
	return 0;
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
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public Iterable<Student> findAll() 
    {
        DSLContext dslContext = DBConnection.getConnection();
        List<Student> students = new ArrayList<Student>();
        
        //DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);
        students = dslContext.select(STUDENT.FIRST_NAME,
                                        STUDENT.LAST_NAME,
                                        STUDENT.ID)
                                        .from(STUDENT)
                                        .fetch()
                                        .map(new StudentRecordMapper());
        
        /**
	List<Student> students = new ArrayList<Student>();
	Student student = new Student("Jack Daniels");
	student.setId("195");
	students.add(student);
		
	Student student2 = new Student("Jon Jon");
	student2.setId("267");
	students.add(student2);

	return students;
        **/
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
	Student student = new Student();
	return student;
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
