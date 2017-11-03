package com.csc680.orbit.repository.impl;

import java.util.ArrayList;
import java.util.List;

import static com.csc680.orbit.database.Tables.STUDENT;
import static com.csc680.orbit.database.Tables.TEACHER;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import com.csc680.orbit.model.Student;
import com.csc680.orbit.model.Teacher;
import com.csc680.orbit.recordmapper.StudentRecordMapper;
import com.csc680.orbit.recordmapper.TeacherRecordMapper;
import com.csc680.orbit.service.DBConnection;
import com.csc680.orbit.repository.TeacherRepository;

@Repository ("teacherRepository")
public class TeacherRepositoryImpl implements TeacherRepository{
	DSLContext dslContext = DBConnection.getConnection();

	@Override
	public long count() {
		int teacherCount = 0;  
		teacherCount = this.dslContext.selectCount()
                             .from(TEACHER)
                             .fetchOne(0, int.class);
        return teacherCount;
	}

	@Override
	public void delete(Iterable<? extends Teacher> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Teacher arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(String arg0) {
		boolean teacherExists = false;
    	int teacherId = Integer.parseInt(arg0);
        int teacherCount = this.dslContext
                                   .selectCount()
                                   .from(TEACHER)
                                   .where(TEACHER.ID.eq(teacherId))
                                   .fetchOne(0, int.class);
       
        
        if(teacherCount != 0){
        	teacherExists = true;
        }
        
        return teacherExists;
	}

	@Override
	public Iterable<Teacher> findAll() {
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers = this.dslContext.select(TEACHER.ID,
				     TEACHER.FIRST_NAME,
                                     TEACHER.LAST_NAME,
                                     TEACHER.DATE_OF_BIRTH,
                                     TEACHER.SSN,
                                     TEACHER.ADDRESS_1,
                                     TEACHER.ADDRESS_2,
                                     TEACHER.CITY,
                                     TEACHER.STATE,
                                     TEACHER.ZIP_CODE)
                             .from(TEACHER)
                             .fetch()
                             .map(new TeacherRecordMapper());
        return teachers;
	}

	@Override
	public Iterable<Teacher> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher findOne(String arg0) {
		List<Teacher> teachers = new ArrayList<Teacher>();
		int teacherId = Integer.parseInt(arg0);
		teachers = this.dslContext.select(TEACHER.ID,
				     TEACHER.FIRST_NAME,
                                     TEACHER.LAST_NAME,
                                     TEACHER.DATE_OF_BIRTH,
                                     TEACHER.SSN,
                                     TEACHER.ADDRESS_1,
                                     TEACHER.ADDRESS_2,
                                     TEACHER.CITY,
                                     TEACHER.STATE,
                                     TEACHER.ZIP_CODE)
					.from(TEACHER)
					.where(TEACHER.ID.eq(teacherId))
					.fetch()
					.map(new TeacherRecordMapper());
		return teachers.get(0);
	}

	@Override
	public <S extends Teacher> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub            
		return null;
	}

	@Override
	public <S extends Teacher> S save(S arg0)
        {
		// TODO Auto-generated method stub
            String firstName = arg0.getFirstName();
            String lastName = arg0.getLastName();
            String dateOfBirth = arg0.getDateOfBirth();
            String ssn = arg0.getSsn();
            String address1 = arg0.getAddress1();
            String address2 = arg0.getAddress2();
            String city = arg0.getCity();
            String state = arg0.getState();
            String zip = arg0.getZip();
                        
            this.dslContext.insertInto(TEACHER,
                                     TEACHER.FIRST_NAME,
                                     TEACHER.LAST_NAME,
                                     TEACHER.DATE_OF_BIRTH,
                                     TEACHER.SSN,
                                     TEACHER.ADDRESS_1,
                                     TEACHER.ADDRESS_2,
                                     TEACHER.CITY,
                                     TEACHER.STATE,
                                     TEACHER.ZIP_CODE)
                    .values(firstName, lastName, dateOfBirth, ssn, address1,
                            address2, city, state, zip)
                    .execute();
		return null;
	}

	@Override
	public List<Teacher> findById(String Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
