package com.aurionpro.model;

import java.time.LocalDate;

public class Professor extends MainCLass implements SalariedEmployee{

	private double salary;

	public Professor(int id, String address, LocalDate date, double salary) {
		super(id, address, date);
		this.setSalary(salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public double calculate(double amount) {
		double total = amount*12;
		return total;
	}
	
}
