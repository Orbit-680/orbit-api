package com.csc680.orbit.model;

public class SearchedStudent 
{
    private String firstName, lastName, dateOfBirth, studentSSN;
        
    public SearchedStudent(){}
    public SearchedStudent(String firstName, String lastName, 
                           String dateOfBirth, String studentSSN)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.studentSSN = studentSSN;
    }
    
    public String getFirstName() {  return firstName;    }

    public void setFirstName(String firstName) {  this.firstName = firstName; }

    public String getLastName() {   return lastName;  }

    public void setLastName(String lastName) {  this.lastName = lastName;  }

    public String getDateOfBirth() {    return dateOfBirth; }

    public void setDateOfBirth(String dateOfBirth) 
        {this.dateOfBirth = dateOfBirth;}

    public String getStudentSSN() {return studentSSN; }

    public void setStudentSSN(String studentSSN) 
        {this.studentSSN = studentSSN; }
}
