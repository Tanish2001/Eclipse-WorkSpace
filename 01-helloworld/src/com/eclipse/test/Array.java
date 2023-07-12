package com.eclipse.test;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = new int[args.length];
		int max = 0;
		int secondmax = 0 ;
		for (int i=0 ; i< args.length; i++) {
			number[i] = Integer.parseInt(args[i]);
			//System.out.println(number[i]);
			
			if (max<number[i]){
				secondmax = max;
				max = number[i];
			}
			if (number[i]>secondmax && number[i]<max) {
				secondmax = number[i];
			}

		}
		System.out.println(secondmax);
		
	}

}
