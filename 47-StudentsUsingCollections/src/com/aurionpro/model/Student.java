package com.aurionpro.model;

public class Student {
String studentName;
int studentID;
double percentage;

public Student(String studentName, int studentID, double percentage) {
	super();
	this.studentName = studentName;
	this.studentID = studentID;
	this.percentage = percentage;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public int getStudentID() {
	return studentID;
}

public void setStudentID(int studentID) {
	this.studentID = studentID;
}

public double getPercentage() {
	return percentage;
}

public void setPercentage(double percentage) {
	this.percentage = percentage;
}

@Override
public String toString() {
	return "Student [studentName=" + studentName + ", studentID=" + studentID + ", percentage=" + percentage + "]";
}

}
