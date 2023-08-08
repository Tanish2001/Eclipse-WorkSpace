package com.aurionpro.model;

import java.util.List;

public class LineItem {
	int id;
	String name;
	int quantity;
	double unitPrice;
	double totalCost;
	public LineItem(int id, String name, int quantity, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
//		this.totalCost = totalCost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public static double calculateTotalPriceofLine(List<LineItem> list)  {
		double totalCostOfLine = 0;
		double totalCostOfUnit = 0;
		for (int i = 0; i < list.size(); i++) {
			totalCostOfUnit = list.get(i).getQuantity()*list.get(i).getUnitPrice();
			System.out.println(totalCostOfUnit+" "+list.get(i).getName());
			totalCostOfLine += totalCostOfUnit;
		}
		return totalCostOfLine;
	}
}
