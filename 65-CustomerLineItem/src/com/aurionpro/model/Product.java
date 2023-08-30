package com.aurionpro.model;

public class Product {
	static int ID=0;
	String name;
	double price;
	double discountPrice;

	public Product(String name, double price, double discountPrice) {
		super();
		Product.ID = ID++;
		this.name = name;
		this.price = price;
		this.discountPrice = discountPrice;
	}

	public int getId() {
		return ID;
	}

	public void setId(int id) {
		Product.ID = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}

	@Override
	public String toString() {
		return "Product [id=" + ID + ", name=" + name + ", price=" + price + ", discountPrice=" + discountPrice + "]";
	}

	public double calculateDisscountedPrice() {
		if(this.discountPrice==0) {
			return this.price;
		}
		else {
			return this.price * this.discountPrice / 100;
		}

	}

}
