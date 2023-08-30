package com.aurionpro.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("gel", 10, 5);
		Product p2 = new Product("soap", 20, 0);
//		DateFormat date = new SimpleDateFormat("dd/mm/yyyy");
//		Date obj = new Date();
		LineItem l1 = new LineItem(2, p2);
		LineItem l2 = new LineItem(4, p2);
//		Order o1 = new Order(new Date(),Arrays.asList(l1,l2));
		Order o1 = new Order(new Date());
		Customer c1 = new Customer("Ban");
		o1.addItemtoLineItem(new LineItem(20, p2));
		c1.addOrdersTOCustomer(o1);
//		System.out.println(o1.calculateOrderPrice());
		printBill(c1);
	}
	
	public static void printBill(Customer customer) {
		System.out.println(customer.getName()+" has made a purchase of total "+customer.TotalCost());
//		System.out.println(customer.getOrdersList().);
	}
}
