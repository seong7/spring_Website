package com.cos.domain;

public class CategoryVO {
	private int ctNum;
	private int ctGubun1;
	private String ctGubun2;
	private String ctWriteDate;
	private String userID; //FK -> user table
	public int getCtNum() {
		return ctNum;
	}
	public void setCtNum(int ctNum) {
		this.ctNum = ctNum;
	}
	public int getCtGubun1() {
		return ctGubun1;
	}
	public void setCtGubun1(int ctGubun1) {
		this.ctGubun1 = ctGubun1;
	}
	public String getCtGubun2() {
		return ctGubun2;
	}
	public void setCtGubun2(String ctGubun2) {
		this.ctGubun2 = ctGubun2;
	}
	public String getCtWriteDate() {
		return ctWriteDate;
	}
	public void setCtWriteDate(String ctWriteDate) {
		this.ctWriteDate = ctWriteDate;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	
}
