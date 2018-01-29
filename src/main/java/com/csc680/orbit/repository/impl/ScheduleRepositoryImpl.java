package com.csc680.orbit.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;

import static com.csc680.orbit.database.Tables.ACCOUNT_LINK_STUDENT;
import static com.csc680.orbit.database.tables.Schedule.SCHEDULE;

import com.csc680.orbit.model.EnrollStudentInClassDTO;
import com.csc680.orbit.model.Schedule;
import com.csc680.orbit.recordmapper.AccountLinkRecordMapper;
import com.csc680.orbit.recordmapper.ScheduleRecordMapper;
import com.csc680.orbit.repository.ScheduleRepository;
import com.csc680.orbit.service.DBConnection;

public class ScheduleRepositoryImpl implements ScheduleRepository{
	
	DSLContext dslContext = DBConnection.getConnection();

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
		/*Schedule account = this.dslContext.insertInto(ACCOUNT_LINK_STUDENT, 
    			ACCOUNT_LINK_STUDENT.DATE_LINKED,
    			ACCOUNT_LINK_STUDENT.ACTIVE,
    			ACCOUNT_LINK_STUDENT.USER_ID,
    			ACCOUNT_LINK_STUDENT.STUDENT_ID)
        		.values(now,
        				"Y",
        				userID,
        				accountLinkDto.getStudentID())
                .returning(ACCOUNT_LINK_STUDENT.ID)
                .fetchOne()
                .map(new AccountLinkRecordMapper());

		if(account != null){
		account.setMessage("Successfully linked student to user account!");
		LOGGER.info("Successfully linked student to user account: " + account.toString());
		}*/
		
		
		return "";
	}

}
