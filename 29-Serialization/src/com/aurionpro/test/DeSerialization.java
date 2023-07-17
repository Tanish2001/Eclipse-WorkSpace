package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account account = new Account(1,"Tanish",20000);
		
		try {
			FileInputStream file = new FileInputStream("D:\\Codes\\test.txt");
			ObjectInputStream in= new ObjectInputStream(file);
			Account account = (Account)in.readObject();
			in.close();
			file.close();
			System.out.println("ok");
			System.out.println(account);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
