package com.csc680.orbit.service;

import com.csc680.orbit.model.dto.SaveAttendanceDTO;
import com.csc680.orbit.model.pojo.Attendance;
import java.util.List;

public interface AttendanceService {
    List<Attendance> getAllAttendances();
    List<Attendance> getAllAttendancesForStudent(int studentId);
    List<Attendance> getAllAttendancesForCourse(int courseId);
    List<Attendance> getAllAttendancesForStudentinCourse(int studentId, int courseId);
    List<Attendance> saveCourseAttendance(SaveAttendanceDTO saveAttendances);

    
    
}
