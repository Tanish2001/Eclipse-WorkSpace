package com.aurionpro.model;

public class Dog {
	private int age;
	private String name;
	private final String PLACE_NAME="Kalyan";
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPLACE_NAME() {
		return PLACE_NAME;
	}
	
	
	public Dog(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
}
