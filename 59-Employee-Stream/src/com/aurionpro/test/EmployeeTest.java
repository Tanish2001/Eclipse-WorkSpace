package com.aurionpro.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = Arrays.asList(
				new Employee(1, "Asis", "Cash management", 10),
				new Employee(2, "Bedang", "HR", 20),
				new Employee(3, "Tanis", "Payments", 20),
				new Employee(3, "Sid", "Cash management", 10)
				);
		
//		List<Employee> cashManagement = employeeList.stream()
//		.filter((emp)->emp.getDepartment().equalsIgnoreCase("Cash Management"))
//		.collect(Collectors.toList());
//		
//		System.out.println(cashManagement);
//		
//		List<Employee> hr = employeeList.stream()
//		.filter((emp)->emp.getDepartment().equalsIgnoreCase("hr"))
//		.collect(Collectors.toList());
//		
//		System.out.println(hr);
//		
//		List<Employee> payments = employeeList.stream()
//		.filter((emp)->emp.getDepartment().equalsIgnoreCase("payments"))
//		.collect(Collectors.toList());
//		
//		System.out.println(payments);
		
		Map<String, List<Employee>> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
//		.collect(Collectors.groupingBy((emp)->emp.getDepartment()));
		
		collect.forEach((key,value)->{
			System.out.println(key+" "+value);
		});

//		System.out.println(collect);
		//emp with max and min, sum of all salary,count of emp above 50k
		
		List<Double> maxSalary = employeeList.stream()
		.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
		.map(emp-> emp.getSalary())
		.limit(1)
		.collect(Collectors.toList());
		
		List<Double> lowSalary = employeeList.stream()
		.sorted(Comparator.comparingDouble(Employee::getSalary))
		.map(emp-> emp.getSalary())
		.limit(1)
		.collect(Collectors.toList());
		
		System.out.println("Max sal "+maxSalary.get(0)+" and lowest "+lowSalary.get(0));
		
		double sum = employeeList.stream()
		.mapToDouble(i->i.getSalary()).sum();
		
		System.out.println("Total salary is "+sum);
		int temp =0;
		List<Employee> collect2 = employeeList.stream()
		.filter(emp->emp.getSalary()>10)
		.collect(Collectors.toList());
		
		System.out.println("Count of emp with sal above 10 is "+ collect2.size());
	}

}
