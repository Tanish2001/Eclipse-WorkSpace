package com.aurionpro.model;

public class LineItem {
	static int ID=0;
	int quantity;
	Product product;
	double cost;

	public LineItem(int quantity, Product product) {
		super();
		LineItem.ID = ID++;
		this.quantity = quantity;
		this.product = product;
//		this.cost = this.calculateLineItemCost();
		
	}

	public int getId() {
		return ID;
	}

	public void setId(int id) {
		LineItem.ID = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "LineItem [id=" + ID + ", quantity=" + quantity + ", product=" + product + "]\n";
	}

	public double calculateLineItemCost() {
		double LineItemCost = this.product.calculateDisscountedPrice() * this.quantity;
		return LineItemCost;
	}
}
