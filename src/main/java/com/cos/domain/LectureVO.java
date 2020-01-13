package com.cos.domain;

public class LectureVO {
	private int lcNum; //PK
	private String lcTitle;
	private String lcContent;
	private String lcWriteDate;
	private int lcReadCount;
	private String userID; //FK -> user table
	private int ctNum; //FK -> category table
	public int getLcNum() {
		return lcNum;
	}
	public void setLcNum(int lcNum) {
		this.lcNum = lcNum;
	}
	public String getLcTitle() {
		return lcTitle;
	}
	public void setLcTitle(String lcTitle) {
		this.lcTitle = lcTitle;
	}
	public String getLcContent() {
		return lcContent;
	}
	public void setLcContent(String lcContent) {
		this.lcContent = lcContent;
	}
	public String getLcWriteDate() {
		return lcWriteDate;
	}
	public void setLcWriteDate(String lcWriteDate) {
		this.lcWriteDate = lcWriteDate;
	}
	public int getLcReadCount() {
		return lcReadCount;
	}
	public void setLcReadCount(int lcReadCount) {
		this.lcReadCount = lcReadCount;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getCtNum() {
		return ctNum;
	}
	public void setCtNum(int ctNum) {
		this.ctNum = ctNum;
	}
	
	
	
}
