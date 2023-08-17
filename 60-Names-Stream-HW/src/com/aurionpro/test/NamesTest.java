package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Accounts;
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
		System.out.println("a. print names of first 3 students sorted in ascending order");
		 String[] names1= {"Jay","Nimesh","Mark","Mahesh","Ramesh"};
		Arrays.stream(names1)
		.sorted()
		.limit(3)
		.forEachOrdered(System.out::println);
		
		System.out.println("-------------------------------------");
		System.out.println("c. print names of students sorted in descending order");
		Arrays.stream(names1)
		.sorted(Comparator.reverseOrder())
		.limit(3)
		.forEachOrdered(System.out::println);
		
		
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
		
		List<Accounts> accountList = Arrays.asList(new Accounts(1, "Asis", 100),
				new Accounts(2, "Bedang", 500),new Accounts(3, "Tanis", 50));
		
		System.out.println("-------------------------------------");
		System.out.println("a. Show Account details of account with minimum Balance");
		accountList.stream()
		.sorted(Comparator.comparingDouble(Accounts::getSalary))
		.limit(1)
		.forEach(System.out::println);
		
		System.out.println("-------------------------------------");
		System.out.println("b. Show Account details of account with maximum Balance");
		accountList.stream()
		.sorted(Comparator.comparingDouble(Accounts::getSalary).reversed())
		.limit(1)
		.forEach(System.out::println);
		
		System.out.println("-------------------------------------");
		System.out.println("Show names greater than 6 characters");
		
		List<Accounts> collectNamesGreaterThan6 = accountList.stream()
		.filter(acc -> acc.getName().length()>6)
		.collect(Collectors.toList());
		
		if(collectNamesGreaterThan6.isEmpty()) {
			System.out.println("Not found");
		}
		else {
			System.out.println(collectNamesGreaterThan6);
		}
		
		System.out.println("-------------------------------------");
		System.out.println("find total of balance of all accounts");
		double sumOfAllSalary = accountList.stream()
		.mapToDouble(acc -> acc.getSalary()).sum();
		System.out.println(sumOfAllSalary);
		
		List<Integer> numbers=Arrays.asList(10,20,30,40,50,25,35,45);
		System.out.println("-------------------------------------");
		Integer minimumNumber = numbers.stream()
		.min(Integer::compareTo).get();
		
		Integer maximumNumber = numbers.stream()
		.max(Integer::compareTo).get();
		
		System.out.println("Minimum number is "+minimumNumber+" max num is "+maximumNumber);
	}
	

}
