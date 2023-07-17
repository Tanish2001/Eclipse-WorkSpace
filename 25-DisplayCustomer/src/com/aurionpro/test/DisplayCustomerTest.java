package com.aurionpro.test;
import java.util.Scanner;

import com.aurionpro.model.DisplayCustomerModel;

public class DisplayCustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DisplayCustomerModel[] customer = {
				new DisplayCustomerModel(1, "ban", "ban@gmailcom", 123),
				new DisplayCustomerModel(2, "tan", "tan@gmail.com", 123),
				new DisplayCustomerModel(3, "man", "man@gmail.com", 123),
				new DisplayCustomerModel(4, "can", "can@gmail.com", 123),
				new DisplayCustomerModel(5, "fan", "fan@gmail.com", 123),
				new DisplayCustomerModel(6, "san", "san@gmail.com", 123),
				new DisplayCustomerModel(7, "han", "han@gmail.com", 123),
				new DisplayCustomerModel(8, "kan", "kan@gmail.com", 123),
				new DisplayCustomerModel(9, "lan", "lan@gmail.com", 123),
				new DisplayCustomerModel(10,"wan", "wan@gmail.com", 123)

		};

		Scanner userin = new Scanner(System.in);
		System.out.println("Enter id, name, email and password: ");
		DisplayCustomerModel customer1 = new DisplayCustomerModel();
		customer1.setCustomerID(userin.nextInt());
		customer1.setName(userin.next());
		userin.nextLine();
		customer1.setEmail(userin.nextLine());
		customer1.setPassword(userin.nextInt());
		validateEmailUserInput(customer1);
		System.out.println("--------------------------------------");
		validateEmail(customer);
		for (int i = 0; i < customer.length; i++) {
		System.out.println(customer[i]);
	}
		
		sortArray(customer);
		
	}

	private static void sortArray(DisplayCustomerModel[] customer) {
		DisplayCustomerModel temp = null;
		 for (int i = 0; i < customer.length; i++) {
			for (int j = 0; j < customer.length; j++) {
				
			
				if(customer[i].getName().compareToIgnoreCase(customer[j].getName())<0) {
					temp = customer[i];
					customer[i]=customer[j];
					customer[j]=temp;
				
			}
			}
		}
		 for (int i = 0; i < customer.length; i++) {
			 System.out.println(customer[i]);
		}
		 //return obj;
		
	}

	private static DisplayCustomerModel validateEmail(DisplayCustomerModel[] customer) {
		DisplayCustomerModel obj = null;
		for (int i = 0; i < customer.length; i++) {
			obj = customer[i];
			int atTheRate = obj.getEmail().indexOf("@");
			int com = obj.getEmail().indexOf(".com");
			System.out.println(customer[i]);
			
			if(atTheRate !=-1 && com!=-1) {
				System.out.println("Valid Email ID");
			}
			else {
				System.out.println("Invalid Email ID!");
			}
				
		}
		return obj;
		
	}
	
	private static DisplayCustomerModel validateEmailUserInput(DisplayCustomerModel customer) {

			int atTheRate = customer.getEmail().indexOf("@");
			int com = customer.getEmail().indexOf(".com");
			System.out.println(customer);
			
			if(atTheRate !=-1 && com!=-1) {
				System.out.println("Valid Email ID");
			}
			else {
				System.out.println("Invalid Email ID!");
			}
				
		
		return customer;
		
	}

}
