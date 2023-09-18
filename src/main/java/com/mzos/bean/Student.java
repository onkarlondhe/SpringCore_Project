package com.mzos.bean;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private int studId;
	private String studName;
	private int studMark;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studId, String studName, int studMark) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studMark = studMark;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getStudMark() {
		return studMark;
	}

	public void setStudMark(int studMark) {
		this.studMark = studMark;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studMark=" + studMark + "]";
	}
	
	
	
}
