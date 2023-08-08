package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class classifyStudent extends Student{

	public classifyStudent(String studentName, int studentID, double percentage) {
		super(studentName, studentID, percentage);
		// TODO Auto-generated constructor stub
	}
	
	public static classifyStudent topper(List<classifyStudent> studentList){
		double highScore = 0;
		classifyStudent topStudent = null;
		for (int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).percentage>highScore) {
				highScore = studentList.get(i).percentage;
				topStudent = studentList.get(i);
			}
		}
		return topStudent;
		
	}
	
	public static classifyStudent lowestScore(List<classifyStudent> studentList){
		double highScore = studentList.get(0).getPercentage();
		classifyStudent topStudent = studentList.get(0);
		for (int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).percentage<highScore) {
				highScore = studentList.get(i).percentage;
				topStudent = studentList.get(i);
			}
		}
		return topStudent;
		
	}
}
