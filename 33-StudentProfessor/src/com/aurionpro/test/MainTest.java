package com.aurionpro.test;

import java.time.LocalDate;

import com.aurionpro.model.MainCLass;
import com.aurionpro.model.Professor;
import com.aurionpro.model.Student;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor pro = new Professor(1, "ascnkascn", LocalDate.of(2001, 9, 21), 90);
		System.out.println(pro);
		System.out.println(pro.calculate(90));
		
		Student student = new Student(70, "aaszczxbvcsdffgfdsaG", LocalDate.of(2000, 9, 19), "Bcom");
		System.out.println(student);

}
}
