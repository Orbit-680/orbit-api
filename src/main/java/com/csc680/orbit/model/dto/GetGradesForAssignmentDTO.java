package com.csc680.orbit.model.dto;

import com.csc680.orbit.model.pojo.User;

public class GetGradesForAssignmentDTO {
	private int courseID;
    private int assignmentID;
    
    public GetGradesForAssignmentDTO(){
    	
    }
    
    public GetGradesForAssignmentDTO(int courseID, int assignmentID){
        this.courseID = courseID;
        this.assignmentID = assignmentID;
    }
    
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public int getAssignmentID() {
		return assignmentID;
	}

	public void setAssignmentID(int assignmentID) {
		this.assignmentID = assignmentID;
	}    
    
}
