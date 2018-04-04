package com.csc680.orbit.model.dto;


import java.util.ArrayList;
import java.util.List;

import com.csc680.orbit.model.pojo.Attendance;
    
public class SaveAttendanceDTO 
{
    private List<Attendance> attendanceList;
    
    public SaveAttendanceDTO(){
            this.attendanceList = new ArrayList<Attendance>();
            }
    public SaveAttendanceDTO(List<Attendance> attendances)
    {
        for(Attendance attendance : attendances)
            attendanceList.add(attendance);
    }

    public List<Attendance> getAttendanceList() {
        return attendanceList;
    }

    public void setAttendanceList(List<Attendance> attendanceList) {
        this.attendanceList = attendanceList;
    }
    
}