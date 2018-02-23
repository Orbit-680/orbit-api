package com.csc680.orbit.model.dto;

import java.util.ArrayList;
import java.util.List;

import com.csc680.orbit.model.pojo.Grade;
import com.csc680.orbit.model.pojo.User;

public class SaveGradesDTO {
	private List<Grade> gradeList;
    
    public SaveGradesDTO(){
    	this.gradeList = new ArrayList<Grade>();
    }
    
    public SaveGradesDTO(List<Grade> grades)
    {
    	for(Grade grade : grades)
    	{
    		this.gradeList.add(grade);
    	}
    }

	public List<Grade> getGradeList() {
		return gradeList;
	}

	public void setGradeList(List<Grade> gradeList) {
		this.gradeList = gradeList;
	}
    
}
