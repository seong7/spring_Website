package com.cos.domain;

public class UserVO {
	private String userID;
	private String userPW;
	private String userName;
	private String userEmail;
	private boolean userEmailCheck;
	private String userSalt;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPW() {
		return userPW;
	}
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public boolean isUserEmailCheck() {
		return userEmailCheck;
	}
	public void setUserEmailCheck(boolean userEmailCheck) {
		this.userEmailCheck = userEmailCheck;
	}
	public String getUserSalt() {
		return userSalt;
	}
	public void setUserSalt(String userSalt) {
		this.userSalt = userSalt;
	}
	
	
}
