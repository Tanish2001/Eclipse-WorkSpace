package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	static int ID=0;
	Date date;
	List<LineItem> itemsList= new ArrayList<LineItem>();

	public Order(Date date) {
		super();
		Order.ID = ID++;
		this.date = date;
	}
	
	public void addItemtoLineItem(LineItem item) {
		this.itemsList.add(item);
	}

	public int getId() {
		return ID;
	}

	public void setId(int id) {
		Order.ID = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<LineItem> getItemsList() {
		return itemsList;
	}

	public void setItemsList(List<LineItem> itemsList) {
		this.itemsList = itemsList;
	}

	@Override
	public String toString() {
		return "Order [id=" + ID + ", date=" + date + ", itemsList=" + itemsList + "]\n";
	}
	
	public double calculateOrderPrice() {
		double OrderCost=0;
		for (LineItem lineItem : itemsList) {
			OrderCost +=lineItem.calculateLineItemCost();
		}
		return OrderCost;
	}

}
