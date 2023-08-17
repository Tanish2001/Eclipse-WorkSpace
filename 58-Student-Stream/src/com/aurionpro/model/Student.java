package com.aurionpro.model;

import java.util.List;

public class Student {
int id;
String name;
List<String> hobbies;
double percentage;

public Student(int id, String name, List<String> hobbies, double percentage) {
	super();
	this.id = id;
	this.name = name;
	this.hobbies = hobbies;
	this.percentage = percentage;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getHobbies() {
	return hobbies;
}
public void setHobbies(List<String> hobbies) {
	this.hobbies = hobbies;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", hobbies=" + hobbies + ", percentage=" + percentage + "]";
}


}
