package com.csc680.orbit.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.jooq.DSLContext;

import static com.csc680.orbit.database.Tables.ACCOUNT_LINK_STUDENT;
import static com.csc680.orbit.database.Tables.STUDENT;
import static com.csc680.orbit.database.tables.Schedule.SCHEDULE;

import com.csc680.orbit.model.dto.EnrollStudentInClassDTO;
import com.csc680.orbit.model.pojo.Schedule;
import com.csc680.orbit.recordmapper.AccountLinkRecordMapper;
import com.csc680.orbit.recordmapper.ScheduleRecordMapper;
import com.csc680.orbit.recordmapper.StudentRecordMapper;
import com.csc680.orbit.repository.ScheduleRepository;
import com.csc680.orbit.service.DBConnection;

import javassist.bytecode.stackmap.TypeData.ClassName;

public class ScheduleRepositoryImpl implements ScheduleRepository{
	
	DSLContext dslContext = DBConnection.getConnection();
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Override
	public <S extends Schedule> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Schedule> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Schedule findOne(String id) {
		List<Schedule> schedules = new ArrayList<Schedule>();
		int scheduleId = Integer.parseInt(id);
		schedules = this.dslContext.select(
				SCHEDULE.ID,
				SCHEDULE.YEAR, 
				SCHEDULE.STUDENT_ID, 
				SCHEDULE.COURSE_ID)
				.from(SCHEDULE)
				.where(SCHEDULE.ID.eq(scheduleId))
				.fetch()
				.map(new ScheduleRecordMapper());
		return schedules.get(0);
	}

	@Override
	public boolean exists(String id) {
		boolean scheduleExists = false;
		int scheduleID = Integer.parseInt(id);
		int scheduleCount = this.dslContext
				.selectCount()
				.from(SCHEDULE)
				.where(SCHEDULE.ID.eq(scheduleID))
				.fetchOne(0, int.class);
		
		if (scheduleCount != 0) {
			scheduleExists = true;
		}
		
		return scheduleExists;
	}

	@Override
	public Iterable<Schedule> findAll() {
		List<Schedule> schedules = new ArrayList<Schedule>();
		schedules = this.dslContext.select(
				SCHEDULE.ID,
				SCHEDULE.YEAR, 
				SCHEDULE.STUDENT_ID, 
				SCHEDULE.COURSE_ID)
				.from(SCHEDULE)
				.fetch()
				.map(new ScheduleRecordMapper());
		return schedules;
	}

	@Override
	public Iterable<Schedule> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		int scheduleCount = 0;
		scheduleCount = this.dslContext
				.selectCount()
				.from(SCHEDULE)
				.fetchOne(0, int.class);
		return scheduleCount;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Schedule entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Schedule> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String enrollStudentsInCourse(EnrollStudentInClassDTO enrollList) {
		
		for(int i = 0; i < enrollList.getEnrollRecords().size(); i++)
		{
			//try
			//{
				this.dslContext.insertInto(SCHEDULE, 
						SCHEDULE.YEAR,
						SCHEDULE.STUDENT_ID,
						SCHEDULE.COURSE_ID)
		        		.values("1718",
		        				enrollList.getEnrollRecords().get(i).getStudentID(),
		        				enrollList.getEnrollRecords().get(i).getCourseID())
		                .returning(SCHEDULE.ID)
		                .fetchOne();
		                //.map(new ScheduleRecordMapper());
		
				//if(schedule != null)
				//{
					LOGGER.info("Successfully enrolled student: " + enrollList.getEnrollRecords().get(i).getStudentID() + " to course: " + enrollList.getEnrollRecords().get(i).getCourseID());
				//}
			/*}
			catch(Exception e) {
				LOGGER.info("Error mapping student: " + enrollList.getEnrollRecords().get(i).getStudentID() + " to course:" + enrollList.getEnrollRecords().get(i).getCourseID());
				LOGGER.info(e.getMessage() + e.getStackTrace().toString());
			}*/
		}
		
		
		return "SUCCESS";
	}

}
