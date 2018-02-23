package com.csc680.orbit.model.pojo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountLinkStudent {
	@Id
	private int accountLinkID;
	private String active;
	private Integer user_id;
	private Integer student_id;
	private String message;
	
	public AccountLinkStudent() {}
	
	public AccountLinkStudent(String active, Integer user_id, Integer student_id)
	{
		this.active = active;
		this.user_id = user_id;
		this.student_id = student_id;
	}
	
	public AccountLinkStudent(int accountLinkID) {
		this.accountLinkID = accountLinkID;
	}

	public int getAccountLinkID() {
		return accountLinkID;
	}

	public void setAccountLinkID(int accountLinkID) {
		this.accountLinkID = accountLinkID;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "AccountLinkStudent [accountLinkID=" + accountLinkID + ", active=" + active
				+ ", userID=" + user_id + ", studentID=" + student_id + ", message=" + message + "]";
	}	

}
