package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = Arrays.asList(
				new Student(1, "Asis", Arrays.asList("Dance","Singing","Piano"), 90.0),
				new Student(2, "Bedang", Arrays.asList("Eating","Singing","Valorant"), 86.0),
				new Student(3, "Tanis", Arrays.asList("Sleeping","Genshin","Dance"),60.0));
		
//		studentList.forEach(System.out::println);
		
		List<Student> top3Students = studentList.stream()
		.sorted(Comparator.comparingDouble(Student::getPercentage).reversed())
		.limit(3)
		.collect(Collectors.toList());
		
		top3Students.forEach(System.out::println);
		
		List<String> collect = studentList.stream()
		.map((student)->student.getHobbies())
		.flatMap((list)->list.stream())
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println(collect);
		
	}

}
