package com.csc680.orbit.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountLink {
	@Id
	private int accountLinkID;
	private Date date_linked;
	private String active;
	private Integer user_id;
	private Integer student_id;
	private String message;
	
	public AccountLink() {}
	
	public AccountLink(Date date_linked, String active, Integer user_id, Integer student_id)
	{
		this.date_linked = date_linked;
		this.active = active;
		this.user_id = user_id;
		this.student_id = student_id;
	}
	
	public AccountLink(int accountLinkID) {
		this.accountLinkID = accountLinkID;
	}

	public int getAccountLinkID() {
		return accountLinkID;
	}

	public void setAccountLinkID(int accountLinkID) {
		this.accountLinkID = accountLinkID;
	}

	public Date getDate_linked() {
		return date_linked;
	}

	public void setDate_linked(Date date_linked) {
		this.date_linked = date_linked;
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
		return "AccountLink [accountLinkID=" + accountLinkID + ", dateLinked=" + date_linked + ", active=" + active
				+ ", userID=" + user_id + ", studentID=" + student_id + ", message=" + message + "]";
	}	

}
