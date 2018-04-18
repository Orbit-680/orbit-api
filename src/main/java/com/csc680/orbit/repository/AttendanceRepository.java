package com.csc680.orbit.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.csc680.orbit.model.pojo.Attendance;
import java.sql.Date;

public interface AttendanceRepository extends CrudRepository<Attendance, String>
{
    List<Attendance> findAllAttendancesForStudent(int studentId);   
    List<Attendance> findAllAttendancesForStudentInCourse(int studentId, int courseId);
    List<Attendance> findAllAttendanceForCourse(int courseId, Date date);
    List<Attendance> findAllAttendanceForCourse(int courseId);
    boolean saveAttendance(Attendance attendance);
}