package com.csc680.orbit.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.csc680.orbit.model.pojo.Attendance;

public interface AttendanceRepository extends CrudRepository<Attendance, String>
{
    List<Attendance> findAllAttendancesForStudent(int studentId);   
    List<Attendance> findAllAttendancesForStudentInCourse(int studentId, int courseId);
    boolean saveAttendance(Attendance attendance);
}