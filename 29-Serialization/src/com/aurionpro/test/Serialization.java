package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1,"Tanish",20000);

		try {
			FileOutputStream file = new FileOutputStream("D:\\Codes\\test.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(account);
			out.close();
			file.close();
			System.out.println("Done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
