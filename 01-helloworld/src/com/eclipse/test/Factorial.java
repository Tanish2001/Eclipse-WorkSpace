package com.eclipse.test;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter a number");
		int userinput = userin.nextInt();
		double factorial=1;
		int i = userinput;
		
		while(i>0) {
			factorial = i*factorial;
			i--;
		}
		
		System.out.println(factorial);
		
	}

}
