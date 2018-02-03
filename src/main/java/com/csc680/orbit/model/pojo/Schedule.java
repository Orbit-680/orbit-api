package com.csc680.orbit.model.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Schedule {
	@Id
	private int id;
	private String year;
	private int student_id;
	private int course_id;
	
	public Schedule() {}
	
	public Schedule(int id, String year, int student_id, int course_id)
	{
		this.id = id;
		this.year = year;
		this.student_id = student_id;
		this.course_id = course_id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	
	@Override
	public String toString() {
		return "Schedule [id=" + id + ", year=" + year + ", student_id=" + student_id
				+ ", course_id=" + course_id + "]";
	}	
	
	

}
