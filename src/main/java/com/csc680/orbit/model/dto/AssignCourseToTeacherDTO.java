package com.csc680.orbit.model.dto;
import java.util.ArrayList;
import java.util.List;

import com.csc680.orbit.model.pojo.Course;

/**
 * Created by brocktubre on 2/4/18.
 */

public class AssignCourseToTeacherDTO {
    private List<Course> courseList;

    public AssignCourseToTeacherDTO()
    {
        courseList = new ArrayList<>();
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void addCourseRecord(Course c)
    {
        this.courseList.add(c);
    }
}
