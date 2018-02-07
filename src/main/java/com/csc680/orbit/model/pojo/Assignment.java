package com.csc680.orbit.model.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Assignment {
	@Id
	private int assignmentId;
    private String year;
    private String name;
    private String type;
    private String maxPoints;
    @ManyToOne
	@JoinColumn(name = "Course_ID")
    private Course course;
    
    public Assignment() {}
	
	public Assignment(int assignmentId, String year, String name, String type, String maxPoints, Course course)
	{
		this.assignmentId = assignmentId;
        this.year = year;
        this.name = name;
        this.type = type;
        this.maxPoints = maxPoints;
        this.course = course;
	}
	
	public int getAssignmentId() {
		return assignmentId;
	}
	public void setAssignmentId(int assignmentId) {
		this.assignmentId = assignmentId;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMaxPoints() {
		return maxPoints;
	}
	public void setMaxPoints(String maxPoints) {
		this.maxPoints = maxPoints;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
    
	@Override
	public String toString() {
		return "Assignment [assignmentId=" + assignmentId + ", year=" + year + ", name=" + name + ", type=" + type + ", maxPoints=" + maxPoints + ", course=" + course + "]";
	}
    

}
