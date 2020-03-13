package com.college;

import java.util.List;

public class Student {
	int rollNum;
	String name;
	String genderL;
	List<String> subject;
	String grade;
	int marks;
	
	public Student(String name, String genderL, List<String> subject, String grade, int rollNum, int marks) {
		this.name = name;
		this.genderL = genderL;
		this.subject = subject;
		this.grade = grade;
		this.rollNum = rollNum;
		this.marks = marks;
	}
	
	public List<String> getSubjects() {
		return subject;
	}

	public void setSubjects(List<String> subject) {
		this.subject = subject;
	}

	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenderL() {
		return genderL;
	}
	public void setGenderL(String genderL) {
		this.genderL = genderL;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
