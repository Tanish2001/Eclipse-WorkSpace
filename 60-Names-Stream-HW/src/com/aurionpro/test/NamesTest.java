package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

import com.aurionpro.model.NamePrinter;

public class NamesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Jayesh","Nimesh","Mahesh","Ramesh"};
		System.out.println("A");
		Arrays.stream(names).forEach(System.out::println);
		System.out.println("------------------------------------------------");
		System.out.println("B");
		Arrays.asList(names).forEach(System.out::println);
		System.out.println("------------------------------------------------");
		System.out.println("C");
		Arrays.stream(names).forEach(NamePrinter::namePrinter);
		
		System.out.println("-------------------------------------");

		String filepath = "D:\\Codes\\Eclipse-Wrokspace\\60-Names-Stream-HW\\name.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(filepath));
			String line = br.readLine();
			
			while(line!=null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("-------------------------------------");
		
		try {
			Files.lines(Paths.get(filepath))
			.map(l-> l.split("\n"))
			.forEach(line -> {
				for (String string : line) {
                    System.out.println(string);
				}
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("-------------------------------------");
		System.out.println(". print names of first 3 students sorted in ascending order");
		 String[] names1= {"Jay","Nimesh","Mark","Mahesh","Ramesh"};
		Arrays.stream(names1)
		.sorted()
		.limit(3)
		.forEach(System.out::println);
		
		System.out.println("-------------------------------------");
		System.out.println("Names containing letter a");
		Arrays.stream(names1)
		.filter(name-> name.contains("a"))
		.sorted()
		.limit(3)
		.forEach(System.out::println);
		
		System.out.println("-------------------------------------");
		System.out.println("print the names of the students that contains less than or equal to 4 characters");
		Arrays.stream(names1)
		.filter(name-> name.length()<5)
		.forEach(System.out::println);
	}
	

}
