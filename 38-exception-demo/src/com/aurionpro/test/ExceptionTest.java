package com.aurionpro.test;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int firstNumber = Integer.parseInt(args[0]);
			int secondnumber = Integer.parseInt(args[1]);
			int div = firstNumber/secondnumber;
			System.out.println(div);
		}
		catch (NumberFormatException e){
			System.out.println("Enter a valid number");
		}
		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero.");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
		}
		catch(Exception e) {
			System.out.println("This is exception block");
		}
		finally {
			System.out.println("Inside finally block");
		}
		System.out.println("Noice");


	}

}
