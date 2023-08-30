package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	static int ID = 0;
	String name;
	List<Order> ordersList = new ArrayList<Order>();

	public Customer(String name) {
		super();
		Customer.ID = ID++;
		this.name = name;
		this.ordersList = ordersList;
	}
	
	public void addOrdersTOCustomer(Order order) {
		this.ordersList.add(order);
	}
	
	public int getId() {
		return ID;
	}

	public void setId(int id) {
		this.ID = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Order> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(List<Order> ordersList) {
		this.ordersList = ordersList;
	}

	@Override
	public String toString() {
		return "Customer [id=" + ID + ", name=" + name + ", ordersList=" + ordersList + "]";
	}
	
	public double TotalCost() {
		double cost=0;
		for (Order order : ordersList) {
			cost+=order.calculateOrderPrice();
		}
		return cost;
	}

}
