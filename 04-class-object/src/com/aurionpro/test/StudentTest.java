package com.aurionpro.test;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.id = 1;
		student.email = "bantan@gmail.com";
		student.name = "Ban Tan";
		student.percentage= 100.1;
		
		System.out.println("Student name is "+student.name+ " having percentage "+student.percentage+" his email ID is "+student.email+"." );
	}

}
