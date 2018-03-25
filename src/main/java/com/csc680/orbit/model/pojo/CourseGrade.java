package com.csc680.orbit.model.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CourseGrade {
	@Id
    private String grade;
	private int gradeCount;
    @ManyToOne
	@JoinColumn(name = "Course_ID")
    private Course course;
    
    public CourseGrade() {}
	
	public CourseGrade(String grade, int gradeCount, Course course)
	{
        this.grade = grade;
        this.gradeCount = gradeCount;
        this.course = course;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getGradeCount() {
		return gradeCount;
	}

	public void setGradeCount(int gradeCount) {
		this.gradeCount = gradeCount;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "CourseGrade [grade=" + grade + ", gradeCount=" + gradeCount + ", course=" + course + "]";
	}
    

}
