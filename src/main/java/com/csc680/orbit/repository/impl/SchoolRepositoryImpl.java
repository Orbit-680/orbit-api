package com.csc680.orbit.repository.impl;

import java.util.ArrayList;
import java.util.List;

import static com.csc680.orbit.database.Tables.SCHOOL;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import com.csc680.orbit.model.School;
import com.csc680.orbit.recordmapper.SchoolRecordMapper;
import com.csc680.orbit.repository.SchoolRepository;
import com.csc680.orbit.service.DBConnection;

@Repository ("schoolRepository")
public class SchoolRepositoryImpl implements SchoolRepository {
	
	DSLContext dslContext = DBConnection.getConnection();

	@Override
	public <S extends School> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends School> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public School findOne(String id) {
		List<School> schools = new ArrayList<School>();
		int schoolID = Integer.parseInt(id);
		schools = this.dslContext.select(
				SCHOOL.ID,
				SCHOOL.NAME,
				SCHOOL.ADDRESS_1,
				SCHOOL.ADDRESS_2,
				SCHOOL.CITY,
				SCHOOL.STATE,
				SCHOOL.ZIP_CODE)
				.from(SCHOOL)
				.where(SCHOOL.ID.eq(schoolID))
				.fetch()
				.map(new SchoolRecordMapper());
		
		return schools.get(0);
	}

	@Override
	public boolean exists(String id) {
		boolean schoolExists = false;
		int schoolID = Integer.parseInt(id);
		int schoolCount = this.dslContext
				.selectCount()
				.from(SCHOOL)
				.where(SCHOOL.ID.eq(schoolID))
				.fetchOne(0, int.class);
		
		if (schoolCount != 0) {
			schoolExists = true;
		}
		
		return schoolExists;
	}

	@Override
	public Iterable<School> findAll() {
		List<School> schools = new ArrayList<School>();
		schools = this.dslContext.select(
				SCHOOL.ID,
				SCHOOL.NAME,
				SCHOOL.ADDRESS_1,
				SCHOOL.ADDRESS_2,
				SCHOOL.CITY,
				SCHOOL.STATE,
				SCHOOL.ZIP_CODE)
				.from(SCHOOL)
				.fetch()
				.map(new SchoolRecordMapper());
		return schools;
	}

	@Override
	public Iterable<School> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		int schoolCount = 0;
		schoolCount = this.dslContext
				.selectCount()
				.from(SCHOOL)
				.fetchOne(0, int.class);
		
		return schoolCount;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(School entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends School> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
