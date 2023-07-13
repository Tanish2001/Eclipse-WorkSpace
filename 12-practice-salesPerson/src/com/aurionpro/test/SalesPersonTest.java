package com.aurionpro.test;

import com.aurionpro.model.City;
import com.aurionpro.model.SalesPerson;

public class SalesPersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		SalesPerson salesperson = new SalesPerson();
		
		SalesPerson[] salesperson = {
				new SalesPerson(1, "Raj", City.Kalyan, 5, 3000),
				new SalesPerson(2, "Amber", City.Nagpur, 6, 50),
				new SalesPerson(3, "Ban", City.Pune, 1, 60),
				new SalesPerson(4, "Tan", City.Kalyan, 3, 10),
				new SalesPerson(5, "Cyno", City.Pune, 10, 90),
				new SalesPerson(6, "Collie", City.Nagpur, 2, 40)

		};
		
		System.out.println("SalesPerson with highest sales is "+highestSalesPerson(salesperson));
		System.out.println("Total amount gathered "+totalSales(salesperson));
		System.out.println("Kalyan total sales "+totalSalesByCity(salesperson,City.Kalyan));
		System.out.println("Pune total sales "+totalSalesByCity(salesperson,City.Pune));
		System.out.println("Nagpur total sales "+totalSalesByCity(salesperson,City.Nagpur));
		System.out.println("Highest SalesPerson in Kalyan "+highestsalesperson(salesperson,City.Kalyan));
		System.out.println("Highest SalesPerson in Pune "+highestsalesperson(salesperson,City.Pune));
		System.out.println("Highest SalesPerson in Nagpur "+highestsalesperson(salesperson,City.Nagpur));


	}
	
	private static SalesPerson highestSalesPerson(SalesPerson[] salesPerson) {
		SalesPerson high = null;
		double highest =0;
		for (int i = 0; i < salesPerson.length; i++) {
			if(salesPerson[i].getSalesAmount()>highest) {
				high = salesPerson[i];
				highest = salesPerson[i].getSalesAmount();
			}
		}
		return high;
	}
	
	private static double totalSales(SalesPerson[] salesPersons) {
		double total=0;
		for (int i = 0; i < salesPersons.length; i++) {
			total+= salesPersons[i].getSalesAmount();
		}
		return total;
	}
	
	private static double totalSalesByCity(SalesPerson[] salesPersons, City city) {
		double total=0;
		for (int i = 0; i < salesPersons.length; i++) {
			if(salesPersons[i].getCity().equals(city)) {
				total+= salesPersons[i].getSalesAmount();
			}
		}
		return total;
	}
	
	private static SalesPerson highestsalesperson(SalesPerson[] salesPersons, City city) {
		SalesPerson person = salesPersons[0];
		double amount = 0;
		for (int i = 0; i < salesPersons.length; i++) {
			if(salesPersons[i].getSalesAmount()>amount && salesPersons[i].getCity().equals(city)) {
				person = salesPersons[i];
				amount = salesPersons[i].getSalesAmount();
			}
		}
		return person;
	}

}
