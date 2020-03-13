package com.college;

public class Teacher {
	String name;
	String gender;
	String subject;
	
	public Teacher(String name, String gender, String subject) {
		this.name = name;
		this.gender = gender;
		this.subject = subject;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
