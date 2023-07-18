package com.aurionpro.model;

import java.time.LocalDate;

public abstract class MainCLass {
	private int id;
	private String address;
	private LocalDate date;
	
	
	public MainCLass(int id, String address, LocalDate date) {
		super();
		this.id = id;
		this.address = address;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "MainCLass id=" + id + ", address=" + address + ", date=" + date + "";
	}
	
	
	
}
