package com.csc680.orbit.model.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Grade {
	@Id
	private int gradeId;
    private String grade;
    private String year;
    @OneToOne
	@JoinColumn(name = "Student_ID")
    private Student student;
    @ManyToOne
	@JoinColumn(name = "Course_ID")
    private Course course;
    @OneToOne
	@JoinColumn(name = "Assignment_ID")
    private Assignment assignment;
    private char updateType;
    
    public Grade() {}
	
	public Grade(int gradeId, String grade, String year, Student student, Course course, Assignment assignment, char updateType)
	{
		this.gradeId = gradeId;
        this.grade = grade;
        this.year = year;
        this.student = student;
        this.course = course;
        this.assignment = assignment;
        this.updateType = updateType;
	}
    
	public int getGradeId() {
		return gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Assignment getAssignment() {
		return assignment;
	}

	public void setAssignment(Assignment assignment) {
		this.assignment = assignment;
	}

	public char getUpdateType() {
		return updateType;
	}

	public void setUpdateType(char updateType) {
		this.updateType = updateType;
	}

	@Override
	public String toString() {
		return "Grade [gradeId=" + gradeId + ", grade=" + grade + ", year=" + year + ", student=" + student + ", course=" + course + ", assignment=" + assignment + ", updateType=" + updateType + "]";
	}
    

}
