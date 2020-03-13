package com.college;

import java.util.Arrays;
import java.util.List;

public class Data {
	public List<Student> getStudentData(){
		List<Student> list = Arrays.asList(
				new Student("Euella", "Female", Arrays.asList("English", "Math", "Programming"), null, 99_302, -1),
				new Student("Morie", "Male", Arrays.asList("English", "Programming"), null, 95_632, -1),
				new Student("Christopher", "Male", Arrays.asList("Math", "Programming"), null, 47_628, -1),
				new Student("Michael", "Male", Arrays.asList("English"), null, 29_723, -1),
				new Student("Delmar", "Male", Arrays.asList("Math"), null, 74_305, -1),
				new Student("Ben", "Male", Arrays.asList("MedicalScience"), null, 53_526, -1),
				new Student("Marda", "Female", Arrays.asList("English", "MedicalScience", "Programming"), null, 90_403, -1),
				new Student("Marry", "Female", Arrays.asList("English", "Programming"), null, 61_449, -1),
				new Student("Raddy", "Male", Arrays.asList("English", "Math"), null, 60_203, -1),
				new Student("Guile", "Male", Arrays.asList("Programming"), null, 65_395, -1)
				);
		return list;
	}
	
	public List<Teacher> getTeacherData(){
		List<Teacher> list = Arrays.asList(
				new Teacher("Miley", "Female", "Math"),
				new Teacher("Tom", "Male", "Programming"),
				new Teacher("Murli", "Male", "English")
				);
		return list;
	}
}
