package com.college;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	public void takeExam(Teacher teacher, List<Student> students) {
		System.out.println(teacher.getName()+" will be taking the exam\n");
		
		for(Student student : students) {
			if(student.getSubjects().contains(teacher.getSubject())) {
				student.setMarks(99); //CHANGE THIS VALUE TODO: ADD FILE HANDLING HERE
			}
		}
	}
	
	public void updateRecord(List<Student> data) {
		int marks = 0;
		for(Student student : data) {
			marks = student.getMarks();
			if(marks>=80) {
				student.setGrade("A");
			}else if(marks>=60) {
				student.setGrade("B");
			}else if(marks>=50) {
				student.setGrade("C");
			}else if(marks>=40) {
				student.setGrade("D");
			}else if(marks<40) {
				student.setGrade("E");
			}
		}
	}
	
	public void showResult(List<Student> students) {
		for(Student student : students) {
			System.out.println(student.getName()+" "+student.getRollNum()+" "+student.getGenderL()+" "+student.getMarks()+" "+student.getGrade());
		}
	}
	
	public static void main(String[] args) {
		Data data = new Data();
		Main obj = new Main();
		Scanner scan = new Scanner(System.in);
		
		List<Student> students = data.getStudentData();
		List<Teacher> teachers = data.getTeacherData();
		
		System.out.println("Enter the day (1-7)");
		switch(scan.nextInt()) {
		case 1:
		case 5: obj.takeExam(teachers.get(2), students);
				break;
		case 3:
		case 4: obj.takeExam(teachers.get(0), students);
				break;
		case 2:
		case 6: obj.takeExam(teachers.get(1), students);
				break;
		default: System.out.println("Invalid input!");
		}
		
		obj.updateRecord(students);
		
		obj.showResult(students);
		
		scan.close();
	}

}
