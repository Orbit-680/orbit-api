/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csc680.orbit.repository.impl;

import java.util.ArrayList;
import java.util.List;

import static com.csc680.orbit.database.Tables.STUDENT;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import com.csc680.orbit.model.SearchedStudent;
import com.csc680.orbit.recordmapper.SearchedStudentRecordMapper;
import com.csc680.orbit.repository.SearchedStudentRepository;
import com.csc680.orbit.service.DBConnection;

public class SearchedStudentRepositoryImpl  implements SearchedStudentRepository
{
    DSLContext dslContext = DBConnection.getConnection();

	@Override
	public <S extends SearchedStudent> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends SearchedStudent> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SearchedStudent findOne(String id) {
		List<SearchedStudent> students = new ArrayList<SearchedStudent>();
		int studentsID = Integer.parseInt(id);
		students = this.dslContext.select(
				STUDENT.ID,
				STUDENT.FIRST_NAME,
                                STUDENT.LAST_NAME,
				STUDENT.DATE_OF_BIRTH,
                                STUDENT.SSN)
				.from(STUDENT)
				.where(STUDENT.ID.eq(studentsID))
				.fetch()
				.map(new SearchedStudentRecordMapper());
                
		return students.get(0);
	}

	@Override
	public boolean exists(String id) {
		return false;
	}

	@Override
	public Iterable<SearchedStudent> findAll() {
		return null;
	}

	@Override
	public Iterable<SearchedStudent> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(SearchedStudent entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends SearchedStudent> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}
