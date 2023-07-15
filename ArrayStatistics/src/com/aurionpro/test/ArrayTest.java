package com.aurionpro.test;

import java.util.Iterator;

public class ArrayTest {

	public static void main(String[] args) {
		int count = 0;
		int temp = 0;
		int numberArray[] = new int[args.length];
		int firstNumber = 0;
		double sum = 0;
		for (int i = 0; i < args.length; i++) {
			firstNumber = Integer.parseInt(args[i]);
			numberArray[i] = firstNumber;
			// System.out.println(firstNumber);
			sum += firstNumber;
		}
		System.out.println("Sum is " + sum);
		System.out.println("Average is " + sum / args.length);

		for (int i = 0; i < args.length; i++) {
			for (int j = i + 1; j < args.length; j++) {
				if (numberArray[i] > numberArray[j]) {
					temp = numberArray[i];
					numberArray[i] = numberArray[j];
					numberArray[j] = temp;
				}
			}
		}
//		for (int i = 0; i < numberArray.length; i++) {
//			System.out.print(" "+numberArray[i]);
//		}
//		
		System.out.println("Minimum number is " + numberArray[0]);
		System.out.println("Maximum number is " + numberArray[args.length - 1]);

		if (args.length % 2 == 1) {
			int median = (args.length + 1) / 2;
			System.out.println("Median is " + numberArray[median]);
		} else {
			int median = ((args.length / 2) + ((args.length / 2) + 1)) / 2;
			System.out.println("Median is " + numberArray[median]);
		}

		boolean[] counted = new boolean[numberArray.length];

		for (int i = 0; i < numberArray.length; i++) {
			if (!counted[i]) {
				count = 1;
				for (int j = 0; j < numberArray.length; j++) {
					if (numberArray[i] == numberArray[j]) {
						count++;
						counted[j] = true;
					}
				}
				System.out.println("Frequency of " + numberArray[i] + " is " + count);
			}
		}
	}

}
