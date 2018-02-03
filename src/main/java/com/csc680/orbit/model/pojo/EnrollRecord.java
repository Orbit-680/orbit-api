package com.csc680.orbit.model.pojo;

public class EnrollRecord
{
    private int studentID;
    private int courseID;
    
    public EnrollRecord()
    {
    	
    }

    public EnrollRecord(int studentID, int courseID)
    {
        this.studentID = studentID;
        this.courseID = courseID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
    
    public String toString() {
		return "EnrollRecord [studentId=" + studentID + ", courseID=" + courseID + "]";
	}
}
