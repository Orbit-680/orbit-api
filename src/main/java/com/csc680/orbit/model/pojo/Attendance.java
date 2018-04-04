package com.csc680.orbit.model.pojo;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Attendance
{    
    @Id
    private int attendanceId;
    @OneToOne
	@JoinColumn(name = "Student_ID")
    private Student student;
    @ManyToOne
	@JoinColumn(name = "Course_ID")
    private Course course;
    private String status;
    private String comment;
    private String year;
    private LocalDate date;
    
    public Attendance(){}
    
    public Attendance(int attendanceId, Student student, Course course, String status, String comment, String year, LocalDate date)
    {
        this.attendanceId = attendanceId;
        this.student = student;
        this.course = course;
        this.status = status;
        this.comment = comment;
        this.year = year;
        this.date = date;
    }
    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getAttendanceId() {
        return attendanceId;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getStatus() {
        return status;
    }

    public String getComment() {
        return comment;
    }

    public String getYear() {
        return year;
    }
    
    public LocalDate getDate() {
        return date;
    }
    @Override
    public String toString()
    {
        return "AttendanceID = " +this.attendanceId + "Student = "+ this.student +
                "Course = " + this.course + "Status = " + this.status +
                "Comment = " + this.comment + "Year = " + this.year + 
                "Date = " + this.date;
    }
}
