package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.ValidateAge;

public class ValidateAgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter age to validate: ");
		Scanner userin = new Scanner(System.in);
		int age = userin.nextInt();
		try {
			ValidateAge.CheckAge(age);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
