package com.eclipse.test;
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		int max=0;
		int secondmax=0;
		for(int i=0 ; i<args.length;i++) {
			number = Integer.parseInt(args[i]);
			
			if (number>max) {
				secondmax = max;
				max=number;
			}
			if(number>secondmax && number<max ) {
				secondmax = number;
			}
			

			

		}
		
		System.out.println(secondmax);
}
	}
