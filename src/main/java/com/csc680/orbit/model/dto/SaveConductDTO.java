package com.csc680.orbit.model.dto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.csc680.orbit.model.pojo.Conduct;
import com.csc680.orbit.model.pojo.Grade;
import com.csc680.orbit.model.pojo.User;

public class SaveConductDTO {
	private List<Conduct> conductList;
    
    public SaveConductDTO(){
    	this.conductList = new ArrayList<Conduct>();
    }
    
    public SaveConductDTO(List<Conduct> conducts)
    {
    	for(Conduct conduct : conducts)
    	{
    		this.conductList.add(conduct);
    	}
    }

	public List<Conduct> getConductList() {
		return conductList;
	}

	public void setConductList(List<Conduct> conductList) {
		this.conductList = conductList;
	}
    
}
