package com.eclipse.test;
public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnumber=0;
		int sum=0;
		for(int i=0 ; i<args.length;i++) {
			firstnumber = Integer.parseInt(args[i]);
			//System.out.println(firstnumber);
			

			
			sum+= firstnumber;

		}
		
		System.out.println(sum);
}
	}
