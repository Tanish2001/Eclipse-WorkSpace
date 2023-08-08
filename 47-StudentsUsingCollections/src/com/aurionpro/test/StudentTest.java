package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.aurionpro.model.Student;
import com.aurionpro.model.classifyStudent;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<classifyStudent> studentList = new ArrayList<classifyStudent>();
		studentList.add(new classifyStudent("asis", 1, 99.9));
		studentList.add(new classifyStudent("bantan", 2, 60.9));
		studentList.add(new classifyStudent("vedang", 3, 89.9));
		studentList.add(new classifyStudent("nitesh", 4, 91.9));
		
		System.out.println(classifyStudent.topper(studentList));
		System.out.println(classifyStudent.lowestScore(studentList));
//		Iterator<classifyStudent> iterable =  studentList.iterator();
//		Collections.sort(studentList);
//		System.out.println(accounts);
		studentList.sort(Comparator.comparingDouble(Student::getPercentage).reversed());
		for (classifyStudent classifyStudent : studentList) {
			System.out.println(classifyStudent);
		}
		System.out.println("=============================================");
		studentList.sort(Comparator.comparing(Student::getStudentName));
		for (classifyStudent classifyStudent : studentList) {
			System.out.println(classifyStudent);
		}

	}

	}
	
	

	
	


