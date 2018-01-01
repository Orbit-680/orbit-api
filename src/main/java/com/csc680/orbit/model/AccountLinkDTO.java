package com.csc680.orbit.model;

public class AccountLinkDTO 
{
	private String userID;
    private int studentID;
        
    public AccountLinkDTO(){}
    public AccountLinkDTO(String userID, int studentID)
    {
        this.userID = userID;
        this.studentID = studentID;
    }
    
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
    
    
    
}
