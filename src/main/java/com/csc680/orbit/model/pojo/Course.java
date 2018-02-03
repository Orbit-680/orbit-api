package com.csc680.orbit.model.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Course {

	@Id
	private int courseId;
	private String name;
	private String year;
	@ManyToOne
	@JoinColumn(name = "Teacher_ID")
	private Teacher teacher;
	
	public Course() {
		
	}

	public Course(int courseId, String name, String year, Teacher teacher) {
		this.courseId = courseId;
		this.name = name;
		this.year = year;
		this.teacher = teacher;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + ", year=" + year + ", teacher=" + teacher + "]";
	}
	
}
