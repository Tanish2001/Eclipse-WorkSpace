package com.aurionpro.model;

import java.time.LocalDate;

public class Student extends MainCLass {
	private String branch;
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public Student(int id, String address, LocalDate date, String branch) {
		super(id, address, date);
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "\n"+super.toString()+" Student branch=" + branch + "";
	}
	
	

}
