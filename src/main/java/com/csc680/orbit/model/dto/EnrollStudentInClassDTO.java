package com.csc680.orbit.model.dto;

import java.util.ArrayList;
import java.util.List;

import com.csc680.orbit.model.pojo.EnrollRecord;

public class EnrollStudentInClassDTO {
    private List<EnrollRecord> enrollRecords;

    public EnrollStudentInClassDTO()
    {
        enrollRecords = new ArrayList<>();
    }

    public List<EnrollRecord> getEnrollRecords() {
        return enrollRecords;
    }

    public void setEnrollRecords(List<EnrollRecord> enrollRecords) {
        this.enrollRecords = enrollRecords;
    }

    public void addEnrollRecord(int studentID, int courseID)
    {
        this.enrollRecords.add(new EnrollRecord(studentID, courseID));
    }
}
