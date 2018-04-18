
package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.Attendance.ATTENDANCE;
import static com.csc680.orbit.database.tables.Course.COURSE;
import static com.csc680.orbit.database.tables.Student.STUDENT;
import static com.csc680.orbit.database.tables.Schedule.SCHEDULE;

import java.util.logging.Logger;

import org.jooq.Record;
import org.jooq.RecordMapper;

import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.model.pojo.Attendance;
import javassist.bytecode.stackmap.TypeData.ClassName;

import com.csc680.orbit.model.pojo.Student;
import java.sql.Date;

public class AttendanceRecordMapper implements RecordMapper<Record, Attendance>{

    @Override
    public Attendance map(Record r) {
	final Logger LOGGER = Logger.getLogger(ClassName.class.getName());
	Student student = new Student();
	Course course = new Course();
	char updateType = 'I';
	int attendanceID = 0;
	String year = "";
        String status = "";
        String comment = "";
        Date date = null;
		
	try
        {
            student = new Student(r.getValue(STUDENT.ID));
            student.setStudentFirstName(r.getValue(STUDENT.FIRST_NAME));
            student.setStudentLastName(r.getValue(STUDENT.LAST_NAME));
            course = new Course(r.getValue(SCHEDULE.COURSE_ID));
            if(COURSE.NAME != null)
                course.setName(r.getValue(COURSE.NAME));
			
            attendanceID = r.getValue(ATTENDANCE.ID);
            status = r.getValue(ATTENDANCE.STATUS);
            year = r.getValue(ATTENDANCE.YEAR);
            comment = r.getValue(ATTENDANCE.COMMENT);
            date = (r.getValue(ATTENDANCE.DATE));
                
            if(ATTENDANCE.STATUS == null && ATTENDANCE.DATE == null)
                updateType = 'I';
            else
                updateType = 'U';
            
	}
        catch (NullPointerException e){}
		
		return new Attendance(
				attendanceID,
                                student,
                                course,
                                status,
                                comment,
                                year,
                                date,
                                updateType);
	}
}