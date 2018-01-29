package com.csc680.orbit.repository.impl;

import static com.csc680.orbit.database.Tables.COURSE;

import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import com.csc680.orbit.model.Course;
import com.csc680.orbit.recordmapper.CourseRecordMapper;
import com.csc680.orbit.repository.CourseRepository;
import com.csc680.orbit.service.DBConnection;

@Repository ("courseRepository")
public class CourseRepositoryImpl implements CourseRepository {
	
	DSLContext dslContext = DBConnection.getConnection();

	@Override
	public <S extends Course> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Course> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course findOne(String id) {
		List<Course> courses= new ArrayList<Course>();
		int courseID = Integer.parseInt(id);
		courses = this.dslContext.select(
				COURSE.ID,
				COURSE.NAME,
				COURSE.YEAR,
				COURSE.TEACHER_ID)
				.from(COURSE)
				.where(COURSE.ID.eq(courseID))
				.fetch()
				.map(new CourseRecordMapper());
		
		return courses.get(0);
	}

	@Override
	public boolean exists(String id) {
		boolean courseExists = false;
		int courseID = Integer.parseInt(id);
		int courseCount = this.dslContext
				.selectCount()
				.from(COURSE)
				.where(COURSE.ID.eq(courseID))
				.fetchOne(0, int.class);
		
		if (courseCount != 0) {
			courseExists = true;
		}
		
		return courseExists;
	}

	@Override
	public Iterable<Course> findAll() {
		List<Course> courses = new ArrayList<Course>();
		courses = this.dslContext.select(
				COURSE.ID,
				COURSE.NAME,
				COURSE.YEAR,
				COURSE.TEACHER_ID)
				.from(COURSE)
				.fetch()
				.map(new CourseRecordMapper());
		return courses;
	}

	@Override
	public Iterable<Course> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		int courseCount = 0;
		courseCount = this.dslContext
				.selectCount()
				.from(COURSE)
				.fetchOne(0, int.class);
		
		return courseCount;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Course entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Course> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
