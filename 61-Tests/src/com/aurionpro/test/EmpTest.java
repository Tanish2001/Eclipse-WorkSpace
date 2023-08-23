package com.aurionpro.test;

import java.text.ParseException;
import java.util.Scanner;

import com.aurionpro.model.EmployeeManagement;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeManagement man = new EmployeeManagement();
//		man.loadDtatFromFile();
//		man.loadData();
//		man.deleteEmp();
		man.getAllEmp();
//		man.getAllFromDepartment();
//		man.countOfEmpInEachDepartment();
//		man.addNewEmp();
//		man.getAllEmp();
//		man.getManagerOfEmp();
//		man.highestPiad();
//		man.highestPaidForEachRole();
//		man.highestPaidForEachDepartment();
//		man.salesmanWithHighComm();
		man.sumOfAllSalaries();
//		try {
//			man.newJoineesInDate();
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		System.out.println("Enter the number: \n"
//				+ "1. To get all emps\n"
//				+ "2. Get all from departments\n"
//				+ "3. To load data from file\n"
//				+ "4. To get countOfEmpInEachDepartment\n"
//				+ "5. To add new emp\n"
//				+ "6. To get manager info of emp\n"
//				+ "7. Rich peep info\n"
//				+ "8. Rich peep in each role\n"
//				+ "9. Rich peep from each department\n"
//				+ "10. Get salesmanWithHighComm"
//				+ "11. Sum of all salaries\n"
//				+ "12. New Joinees in 2 dates.");
		
		Scanner userin = new Scanner(System.in);
		int userinput ;
		boolean checkFlag = false;
		while(!checkFlag) {
			System.out.println("Enter the number: \n"
					+ "1. To get all emps\n"
					+ "2. Get all from departments\n"
					+ "3. To load data from file\n"
					+ "4. To get countOfEmpInEachDepartment\n"
					+ "5. To add new emp\n"
					+ "6. To get manager info of emp\n"
					+ "7. Rich peep info\n"
					+ "8. Rich peep in each role\n"
					+ "9. Rich peep from each department\n"
					+ "10. Get salesmanWithHighComm\n"
					+ "11. Sum of all salaries\n"
					+ "12. New Joinees in 2 dates.");
//			System.out.println("1");
//			userinput = userin.nextInt();
			try {
//				System.out.println("2");
				userinput = userin.nextInt();
				if(userinput>12) {
					throw new NumberFormatException();
				}
				else if(userinput==0){
					System.out.println("Ended");
					checkFlag = true;
				}
				else {
					startFunction(userinput);
				}
			} catch (Exception e) {
				System.out.println("Enter a valid number in range 1 to 12.");
				userin.nextLine();
			}
		}
	}

	private static void startFunction(int optionNumber) {
		// TODO Auto-generated method stub
		Scanner userin = new Scanner(System.in);
		EmployeeManagement man = new EmployeeManagement();
//		int userinput = userin.nextInt();
		boolean isContinue = true;
		while(isContinue) {
//			System.out.println("called");
			switch (optionNumber) {
			case 1:
				man.getAllEmp();
				break;
			
			case 2:
				System.out.println("entered 2");
				man.getAllFromDepartment();
				break;
				
			case 3:
				man.loadDtatFromFile();
				System.out.println("Loaded");
				break;
			
			case 4:
				man.countOfEmpInEachDepartment();
				break;
				
			case 5:
				man.addNewEmp();
				break;
			
			case 6:
				man.getManagerOfEmp();
				break;
			
			case 7:
				man.highestPiad();
				break;
			
			case 8:
				man.highestPaidForEachRole();
				break;
				
			case 9:
				man.highestPaidForEachDepartment();
				break;
				
			case 10:
				man.salesmanWithHighComm();
				break;
				
			case 11:
				man.sumOfAllSalaries();
//				userin.nextLine();
				break;

				
			case 12:
				try {
				man.newJoineesInDate();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				break;

			default:
				break;
			}
			isContinue = false;
		}
	}

}
