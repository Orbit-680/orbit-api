package com.csc680.orbit.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.csc680.orbit.model.pojo.Attendance;

public interface AttendanceRepository {
    List<Attendance> findAllAttendancesForStudent(int studentId);   
    List<Attendance> findAllAttendancesForCourse(int courseId);
}