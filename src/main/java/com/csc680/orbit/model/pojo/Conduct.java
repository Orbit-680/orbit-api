package com.csc680.orbit.model.pojo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Conduct {

	@Id
	private int conductId;
	private String year;
	private Date date;
	private int score;
	private String comment;
	@OneToOne
	@JoinColumn(name = "Course_ID")
	private Course course;
	@OneToOne
	@JoinColumn(name = "Student_ID")
	private Student student;
	private String updateType;
	
	public Conduct() {
		
	}

	public Conduct(int conductId, String year, Date date, int score, String comment, Course course, Student student, String updateType) {
		this.conductId = conductId;
		this.year = year;
		this.date = date;
		this.score = score;
		this.comment = comment;
		this.course = course;
		this.student = student;
		this.updateType = updateType;
	}
	
	/*public Conduct(int conductId) {
		this.conductId = conductId;
	}*/
	
	public Conduct(int conductId) {
		this.conductId = conductId;
		this.course = new Course();
		this.student = new Student();
	}
	
	public int getConductId() {
		return conductId;
	}

	public void setConductId(int conductId) {
		this.conductId = conductId;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public String getUpdateType() {
		return updateType;
	}

	public void setUpdateType(String updateType) {
		this.updateType = updateType;
	}

	@Override
	public String toString() {
		return "Conduct [conductId=" + conductId + ", year=" + year + ", date=" + date + ", score=" + score + ", comment=" + comment + ", course=" + course + ", student=" + student + ", updateType=" + updateType + "]";
	}
	
}
