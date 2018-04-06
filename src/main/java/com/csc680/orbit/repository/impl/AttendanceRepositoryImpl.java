package com.csc680.orbit.repository.impl;

import static com.csc680.orbit.database.Tables.ATTENDANCE;
import static com.csc680.orbit.database.Tables.COURSE;
import static com.csc680.orbit.database.Tables.STUDENT;
import static com.csc680.orbit.database.tables.Schedule.SCHEDULE;
import com.csc680.orbit.model.pojo.Attendance;
import com.csc680.orbit.recordmapper.AttendanceRecordMapper;
import com.csc680.orbit.repository.AttendanceRepository;
import com.csc680.orbit.service.DBConnection;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javassist.bytecode.stackmap.TypeData;

import org.jooq.DSLContext;

public class AttendanceRepositoryImpl implements AttendanceRepository {

    DSLContext dslContext = DBConnection.getConnection();
    private static final Logger LOGGER = Logger.getLogger(TypeData.ClassName.class.getName());
    
    @Override
    public List<Attendance> findAllAttendancesForStudent(int studentId) {
        List<Attendance> attendances = new ArrayList<>();
	attendances = this.dslContext.select(
                            ATTENDANCE.ID,
                            ATTENDANCE.STUDENT_ID,
                            ATTENDANCE.COURSE_ID, 
                            ATTENDANCE.STATUS,
                            ATTENDANCE.COMMENT,
                            ATTENDANCE.YEAR,
                            ATTENDANCE.DATE)
			.from(ATTENDANCE)
                        .where(ATTENDANCE.STUDENT_ID.eq(studentId))
			.fetch()
			.map(new AttendanceRecordMapper());
        return attendances;
    }

    @Override
    public List<Attendance> findAllAttendancesForStudentInCourse(int studentId, int courseId) {
        List<Attendance> attendances = new ArrayList<>();
	attendances = this.dslContext.select(
                            ATTENDANCE.ID,
                            ATTENDANCE.STUDENT_ID,
                            ATTENDANCE.COURSE_ID, 
                            ATTENDANCE.STATUS,
                            ATTENDANCE.COMMENT,
                            ATTENDANCE.YEAR,
                            ATTENDANCE.DATE)
			.from(SCHEDULE)
			.join(STUDENT).on(STUDENT.ID.eq(SCHEDULE.STUDENT_ID))
                        .where(SCHEDULE.STUDENT_ID.eq(studentId).and(SCHEDULE.COURSE_ID.eq(courseId)))
			.fetch()
			.map(new AttendanceRecordMapper());
        return attendances;
    }

    public void updateAttendance(Attendance entity) {
		// TODO Auto-generated method stub
		String status = entity.getStatus();
		int attendanceID = entity.getAttendanceId();
		
		int result = this.dslContext.update(ATTENDANCE)
						.set(ATTENDANCE.STATUS, status)
						.where(ATTENDANCE.ID.eq(attendanceID))
						.execute();
		
		if(result != 0){
			LOGGER.info("Successfully updated Attendance to DB: " + attendanceID);
		}
		
	}
    
    @Override
    public boolean saveAttendance(Attendance attendance) {
        boolean result = true;
		
		if(attendance.getStatus() == null || attendance.getStatus().equals(""))
			return true;
		
		if(attendance.getUpdateType() == 'U')
			this.updateAttendance(attendance);
		else
			this.save(attendance);
		
		return result;
    }

    @Override
    public <S extends Attendance> S save(S s) {
        String status = s.getStatus();
	String year = "1718";
        String comment = s.getComment();
        Date date = s.getDate();
	int studentID = s.getStudent().getStudentId();
	int courseID = s.getCourse().getCourseId();
	
	this.dslContext.insertInto(ATTENDANCE, 
                                    ATTENDANCE.STATUS,
                                    ATTENDANCE.YEAR,
                                    ATTENDANCE.STUDENT_ID,
                                    ATTENDANCE.COURSE_ID,
                                    ATTENDANCE.COMMENT,
                                    ATTENDANCE.DATE)
			        .values(status, 
                                    year,
                                    studentID,
                                    courseID,
                                    comment,
                                    date)
			        .returning(ATTENDANCE.ID)
			        .execute();

		Attendance newAttendance = (Attendance)s;
		//newAssignment.setAssignmentId(iAssignment.getAssignmentId());
		//newAssignment.setCourse(new Course(courseID));
		
		if(newAttendance != null){
		LOGGER.info("Successfully added Attendance to DB: " + newAttendance.toString());
		}
                return (S)newAttendance;
    }

    @Override
    public <S extends Attendance> Iterable<S> save(Iterable<S> itrbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Attendance findOne(String id) {
        List<Attendance> attendances = new ArrayList<>();
	int attendanceID = Integer.parseInt(id);
	attendances = this.dslContext.select(
                            ATTENDANCE.ID,
                            ATTENDANCE.STUDENT_ID,
                            ATTENDANCE.COURSE_ID, 
                            ATTENDANCE.STATUS,
                            ATTENDANCE.COMMENT,
                            ATTENDANCE.YEAR,
                            ATTENDANCE.DATE)
			.from(ATTENDANCE)
			.where(ATTENDANCE.ID.eq(attendanceID))
			.fetch()
			.map(new AttendanceRecordMapper());
		
		return attendances.get(0);
    }

    @Override
    public boolean exists(String id) {
        boolean attendanceExists = false;
		int attendanceID = Integer.parseInt(id);
		int attendanceCount = this.dslContext
				.selectCount()
				.from(ATTENDANCE)
				.where(ATTENDANCE.ID.eq(attendanceID))
				.fetchOne(0, int.class);
		
		if (attendanceCount != 0) {
			attendanceExists = true;
		}
		
		return attendanceExists;
    }

    @Override
    public Iterable<Attendance> findAll() {
        List<Attendance> attendances = new ArrayList<>();
	attendances = this.dslContext.select(
                            ATTENDANCE.ID,
                            ATTENDANCE.STUDENT_ID,
                            ATTENDANCE.COURSE_ID, 
                            ATTENDANCE.STATUS,
                            ATTENDANCE.COMMENT,
                            ATTENDANCE.YEAR,
                            ATTENDANCE.DATE)
			.from(ATTENDANCE)
			.fetch()
			.map(new AttendanceRecordMapper());
		return attendances;
    }

    @Override
    public Iterable<Attendance> findAll(Iterable<String> itrbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long count() {
        int attendanceCount = 0;
		attendanceCount = this.dslContext
				.selectCount()
				.from(ATTENDANCE)
				.fetchOne(0, int.class);
		return attendanceCount;
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Attendance t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Iterable<? extends Attendance> itrbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Attendance> findAllAttendanceForCourse(int courseId) {
        List<Attendance> attendances = new ArrayList<>();
	attendances = this.dslContext.select(
                            ATTENDANCE.ID,
                            ATTENDANCE.STUDENT_ID,
                            ATTENDANCE.COURSE_ID, 
                            ATTENDANCE.STATUS,
                            ATTENDANCE.COMMENT,
                            ATTENDANCE.YEAR,
                            ATTENDANCE.DATE)
			.from(ATTENDANCE)
                        .where(ATTENDANCE.COURSE_ID.eq(courseId))
			.fetch()
			.map(new AttendanceRecordMapper());
        return attendances;
    }
    
}
