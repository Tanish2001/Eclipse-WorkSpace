package com.aurionpro.model;


import com.aurionpro.exception.InvalidAgeException;

public class ValidateAge {

	public static void CheckAge(int age) {		
		if(age>=18 && age<75) {
			System.out.println("Eligible for voting");
		}
		else {
			throw new InvalidAgeException("Invalid Age");
		}
	}

}
