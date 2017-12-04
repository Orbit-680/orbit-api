package com.csc680.orbit.model;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User {

	@Id
	private int userID;
	private String username;
	private String uid;
	private Date lastLogin;
	private int invalidAttempts;
	private String active;
	@ManyToOne
	@JoinColumn(name = "Role_ID")
	private Role role;

	public User() {

	}

	public User(int userID, String username, String uid, Date lastLogin, int invalidAttempts, String active, Role role) {
		this.userID = userID;
		this.username = username;
		this.uid = uid;
		this.lastLogin = lastLogin;
		this.invalidAttempts = invalidAttempts;
		this.active = active;
		this.role = role;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public int getInvalidAttempts() {
		return invalidAttempts;
	}

	public void setInvalidAttempts(int invalidAttempts) {
		this.invalidAttempts = invalidAttempts;
	}

	public String isActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", username=" + username + ", uid=" + uid + ", lastLogin=" + lastLogin
				+ ", invalidAttempts=" + invalidAttempts + ", active=" + active + ", role=" + role + "]";
	}

}
