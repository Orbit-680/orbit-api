package com.csc680.orbit.model.dto;

import com.csc680.orbit.model.pojo.User;

public class CreateCourseDTO {
	private int teacherID;
    private String name;
    
    public CreateCourseDTO(){
    	
    }
    
    public CreateCourseDTO(int teacherID, String name){
        this.teacherID = teacherID;
        this.name = name;
    }

	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
}
