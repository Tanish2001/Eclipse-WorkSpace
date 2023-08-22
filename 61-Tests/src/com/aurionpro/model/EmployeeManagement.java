package com.aurionpro.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EmployeeManagement {
	List<Employee> empDetails  = new ArrayList<Employee>();
	static final String filepath = "D:\\Codes\\Eclipse-Wrokspace\\61-Tests\\data.txt";
	Set<Employee> empSet = new HashSet<Employee>();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
	
	public EmployeeManagement() {
//		System.out.println("Hello");
		checkFile();
//		empDetails.addAll(empSet);
		loadEmpData();
	}
	
	private void checkFile() {
		BufferedReader reader;
		// TODO Auto-generated method stub
		try {
			
			reader = new BufferedReader(new FileReader(filepath));
			String line = reader.readLine();
			if(line==null) {
				serializeData();
				System.out.println("done");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failed");
		}
	}
	public void loadData() {
		loadEmpData();

	}
	
	public void loadDtatFromFile() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\tanish.batham\\Downloads\\emp.txt"));
			String line = br.readLine();
			Double commission;
			int managerID;
			while (line != null) {
				String[] arr = line.split(",");
				if (arr.length == 8) {
//					for (String string : arr) {
//						System.out.println(string);
//					}
					int empID = Integer.parseInt(arr[0].trim().replaceAll("\"", ""));
					String name = arr[1].trim().replace("\"", "");
					String role = arr[2].trim().replace("\"", "");
					if (arr[3].equalsIgnoreCase("null")) {
						managerID = 0;
					} else {
						managerID = Integer.parseInt(arr[3].trim().replaceAll("\"", ""));
					}
					String date = arr[4].trim().replace("\"", "");
					if (arr[6].equalsIgnoreCase("null")) {
						commission = (double) 0;
					} else {
						commission = Double.parseDouble(arr[6].trim().replace("\"", ""));
					}
					double salary = Double.parseDouble(arr[5].trim().replace("\"", ""));
					int departmentID = Integer.parseInt(arr[7].trim().replace("\"", ""));
					empSet.add(new Employee(empID, name, role, managerID, date, salary, commission, departmentID));
//					System.out.println(empSet);
//					System.out.println("done");
				}
				line = br.readLine();
				if(line==null) {
					empDetails.addAll(empSet);
					serializeData();
				}
			
		} 
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void serializeData() {
		try {
			FileOutputStream file = new FileOutputStream(filepath);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(empDetails);
			out.close();
			file.close();

			loadEmpData();

		}

		catch (IOException ex) {
			ex.printStackTrace();
//			System.out.println("IOException is caught");
		}
	}

	private void loadEmpData() {
		// TODO Auto-generated method stub
		try {

			FileInputStream file = new FileInputStream(filepath);
			ObjectInputStream in = new ObjectInputStream(file);

			empDetails = (List<Employee>) in.readObject();

			in.close();
			file.close();
		}

		catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is caught");
		}
	}
	
	public void getAllEmp() {
		
//		loadEmpData();
		for (Employee employee : empDetails) {
			System.out.println(employee);
		}
	}
	
	public void getAllFromDepartment() {
		loadEmpData();
		System.out.println("Enter department id:");
		Scanner userin = new Scanner(System.in);
		int userinput = userin.nextInt();
		for (Employee employee : empDetails) {
			if(employee.getDepartmentID()==userinput) {
				System.out.println(employee);
			}
		}
	}
	
	public void countOfEmpInEachDepartment() {
		int countOF30=0;
		int countOF20=0;
		int countOF10=0;
		loadEmpData();
		for (Employee employee : empDetails) {
			if(employee.getDepartmentID()==30) {
				countOF30++;
			}
			else if(employee.getDepartmentID()==20) {
				countOF20++;
			}
			else if(employee.getDepartmentID()==10) {
				countOF10++;
			}
		}
		System.out.println("In department 30 there are "+countOF30+" in 20 "+countOF20+" and in 10 "+countOF10);
	}
	
	public void addNewEmp() {
		loadEmpData();
		System.out.println("Enter Emp ID");
		Scanner userin = new Scanner(System.in);
		int empID = userin.nextInt();
		userin.nextLine();
		System.out.println("Enter name");
		String name = userin.nextLine();
		System.out.println("Enter role");
		String role = userin.nextLine();
		System.out.println("Enter manager ID");
		int managerID = userin.nextInt();
		userin.nextLine();
		System.out.println("Enter doj");
		String date = userin.nextLine();
		System.out.println("Enter salary");
		double salary = userin.nextDouble();
//		userin.nextLine();
		System.out.println("Enter Commission");
		double commission = userin.nextDouble();
		System.out.println("Enter department id");
		int department = userin.nextInt();
		boolean sameEmpIDFound = false;
		for (Employee employee : empDetails) {
			if (employee.getEmployeeID()==empID) {
				System.out.println("Emp with same id already exsist");
				sameEmpIDFound = true;
				
			}
		}
		if(!sameEmpIDFound) {
			empDetails.add(new Employee(empID, name, role, managerID, date, salary, commission, department));
			serializeData();
		}
		
	}
	
	public void deleteEmp() {
		loadEmpData();
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter emp ID to delete");
		int userinput = userin.nextInt();
		for (int i = 0; i < empDetails.size(); i++) {
			if(empDetails.get(i).getEmployeeID()==userinput) {
				empDetails.remove(i);
				System.out.println("Removed");
			}
			
		}
		serializeData();
	}
	
	public void getManagerOfEmp() {
		loadEmpData();
		Employee temp = null;
		System.out.println("Enter Employee ID to get manager info");
		Scanner userin = new Scanner(System.in);
		int userinput = userin.nextInt();
		for (Employee employee : empDetails) {
			if(employee.getEmployeeID()==userinput) {
				temp = employee;
			}
		}
		if(temp.getManagerID()==0) {
			System.out.println("No manager exsists for President");
		}
		for (Employee employee : empDetails) {
			if(employee.getEmployeeID()==temp.getManagerID()) {
				System.out.println(employee);
			}
		}
	}
	
	public void highestPiad() {
		loadEmpData();
		Employee employee = empDetails.stream()
		.max(Comparator.comparingDouble(Employee::getSalary))
		.get();
		
		System.out.println(employee);
	}
	
	public void highestPaidForEachRole() {
		loadEmpData();
		
		Employee employee = empDetails.stream()
		.filter(emp -> emp.getRole().equalsIgnoreCase("'manager'"))
		.max(Comparator.comparingDouble(Employee::getSalary))
		.get();	
		System.out.println("Rich peep in manager "+employee);
		
		Employee employee1=empDetails.stream()
		.filter(emp -> emp.getRole().equalsIgnoreCase("'clerk'"))
		.max(Comparator.comparingDouble(Employee::getSalary))
		.get();	
		System.out.println("Rich peep in clerk "+employee1);
		
		Employee employee2=empDetails.stream()
		.filter(emp -> emp.getRole().equalsIgnoreCase("'analyst'"))
		.max(Comparator.comparingDouble(Employee::getSalary))
		.get();	
		System.out.println("Rich peep in analyst "+employee2);
		
		Employee employee3=empDetails.stream()
		.filter(emp -> emp.getRole().equalsIgnoreCase("'salesman'"))
		.max(Comparator.comparingDouble(Employee::getSalary))
		.get();	
		System.out.println("Rich peep in salesman "+employee3);

	}
	
	public void highestPaidForEachDepartment() {
		loadEmpData();
		Employee employee = empDetails.stream()
				.filter(emp -> emp.getDepartmentID()==30)
				.max(Comparator.comparingDouble(Employee::getSalary))
				.get();	
		System.out.println("Rich peep in department 30 "+employee);
		
		Employee employee2 = empDetails.stream()
		.filter(emp -> emp.getDepartmentID()==20)
		.max(Comparator.comparingDouble(Employee::getSalary))
		.get();
		System.out.println("Rich peep in department 20 "+employee2);
		
		Employee employee3 = empDetails.stream()
		.filter(emp -> emp.getDepartmentID()==10)
		.max(Comparator.comparingDouble(Employee::getSalary))
		.get();	
		System.out.println("Rich peep in department 10 "+employee3);		
	}
	
	public void salesmanWithHighComm() {
		loadEmpData();
		Employee employee = empDetails.stream()
		.filter(emp -> emp.getRole().equalsIgnoreCase("'salesman'"))
		.max(Comparator.comparingDouble(Employee::getCommission))
		.get();	
		System.out.println("Highest Commission "+employee);	
	}
	
	public void sumOfAllSalaries() {
		loadEmpData();
		double sal = empDetails.stream()
		.mapToDouble(Employee::getSalary).sum();
		System.out.println("Total salary of company is "+sal);
	}
	

	public void newJoineesInDate() throws ParseException {
		Date parsedStartDate = null;
		Date parsedEndDate = null;
		System.out.println("Enter start date in DD/MM/YY format");
		Scanner userin = new Scanner(System.in);
		String startDate = userin.nextLine();
		System.out.println("Enter end date in DD/MM/YY format");
		String endDate = userin.nextLine();
		try {
			parsedStartDate = dateFormat.parse(startDate);
			parsedEndDate = dateFormat.parse(endDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, Integer> months= new HashMap<String, Integer>();
		months.put("JAN",1);
		months.put("FEB",2);
		months.put("MAR",3);
		months.put("APR",4);
		months.put("MAY",5);
		months.put("JUN",6);
		months.put("JUL",7);
		months.put("AUG",8);
		months.put("SEP",9);
		months.put("OCT",10);
		months.put("NOV",11);
		months.put("DEC",12);
		int day = 0;
		int month=0;
		int year=0;
		for (Employee employee : empDetails) {
			String date = employee.getDateOfJoining();
			String[] parts = date.split("-");
//			System.out.println(parts.length);
			day = Integer.parseInt(parts[0].substring(1));
			month = months.get(parts[1]);
			year = Integer.parseInt(parts[2].substring(0,2));
			String temp = day+"/"+month+"/"+year;
			Date parsedTemp = dateFormat.parse(temp);
//			try {
//				System.out.println(dateFormat.parse(temp));
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			if(parsedTemp.after(parsedStartDate) && parsedTemp.before(parsedEndDate)){
				System.out.println(employee);
			}
		}

    }
	

}
