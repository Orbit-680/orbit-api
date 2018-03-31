package com.csc680.orbit.repository.impl;

import static com.csc680.orbit.database.Tables.ASSIGNMENT;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.jooq.DSLContext;

import com.csc680.orbit.model.pojo.Assignment;
import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.recordmapper.AssignmentRecordMapper;
import com.csc680.orbit.repository.AssignmentRepository;
import com.csc680.orbit.service.DBConnection;
import javassist.bytecode.stackmap.TypeData.ClassName;

public class AssignmentRepositoryImpl implements AssignmentRepository {

	DSLContext dslContext = DBConnection.getConnection();
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Override
	public <S extends Assignment> S save(S entity) {
		// TODO Auto-generated method stub
		String assignmentName = entity.getName();
		String maxPoints = entity.getMaxPoints();
		String year = "1718";
		String type = "Homework";
		String description = entity.getDescription();
		int courseID = entity.getCourse().getCourseId();
		
		Assignment iAssignment = this.dslContext.insertInto(ASSIGNMENT, 
							ASSIGNMENT.YEAR,
							ASSIGNMENT.NAME,
							ASSIGNMENT.TYPE,
							ASSIGNMENT.MAX_POINTS,
							ASSIGNMENT.COURSE_ID,
							ASSIGNMENT.DESCRIPTION)
			        .values(year, 
			        		assignmentName,
			        		type, 
			        		maxPoints,
			        		courseID,
							description)
			        .returning(ASSIGNMENT.ID, ASSIGNMENT.COURSE_ID)
			        .fetchOne()
			        .map(new AssignmentRecordMapper());

		Assignment newAssignment = (Assignment)entity;
		newAssignment.setAssignmentId(iAssignment.getAssignmentId());
		newAssignment.setCourse(new Course(courseID));
		
		if(newAssignment != null){
		LOGGER.info("Successfully added Assignment to DB: " + newAssignment.toString());
		}
		return (S)newAssignment;
	}

	@Override
	public <S extends Assignment> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Assignment findOne(String id) {
		List<Assignment> assignments= new ArrayList<Assignment>();
		int assignmentID = Integer.parseInt(id);
		assignments = this.dslContext.select(
				ASSIGNMENT.ID,
				ASSIGNMENT.YEAR, 
				ASSIGNMENT.NAME, 
				ASSIGNMENT.TYPE,
				ASSIGNMENT.MAX_POINTS,
				ASSIGNMENT.COURSE_ID,
				ASSIGNMENT.DESCRIPTION)
				.from(ASSIGNMENT)
				.where(ASSIGNMENT.ID.eq(assignmentID))
				.fetch()
				.map(new AssignmentRecordMapper());
		
		return assignments.get(0);
	}

	@Override
	public boolean exists(String id) {
		boolean assignmentExists = false;
		int assignmentID = Integer.parseInt(id);
		int assignmentCount = this.dslContext
				.selectCount()
				.from(ASSIGNMENT)
				.where(ASSIGNMENT.ID.eq(assignmentID))
				.fetchOne(0, int.class);
		
		if (assignmentCount != 0) {
			assignmentExists = true;
		}
		
		return assignmentExists;
	}

	@Override
	public Iterable<Assignment> findAll() {
		List<Assignment> assignments = new ArrayList<Assignment>();
		assignments = this.dslContext.select(
				ASSIGNMENT.ID,
				ASSIGNMENT.YEAR, 
				ASSIGNMENT.NAME, 
				ASSIGNMENT.TYPE,
				ASSIGNMENT.MAX_POINTS,
				ASSIGNMENT.COURSE_ID,
				ASSIGNMENT.DESCRIPTION)
				.from(ASSIGNMENT)
				.fetch()
				.map(new AssignmentRecordMapper());
		return assignments;
	}
	
	@Override
	public List<Assignment> findAllAssignmentsForCourse(int courseID) {
		List<Assignment> assignments = new ArrayList<Assignment>();
		assignments = this.dslContext.select(
				ASSIGNMENT.ID,
				ASSIGNMENT.YEAR, 
				ASSIGNMENT.NAME, 
				ASSIGNMENT.TYPE,
				ASSIGNMENT.MAX_POINTS,
				ASSIGNMENT.COURSE_ID,
				ASSIGNMENT.DESCRIPTION)
				.from(ASSIGNMENT)
				.where(ASSIGNMENT.COURSE_ID.eq(courseID))
				.fetch()
				.map(new AssignmentRecordMapper());
		return assignments;
	}

	@Override
	public Iterable<Assignment> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		int assignmentCount = 0;
		assignmentCount = this.dslContext
				.selectCount()
				.from(ASSIGNMENT)
				.fetchOne(0, int.class);
		return assignmentCount;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Assignment entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Assignment> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
