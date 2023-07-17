package com.aurionpro.model;

import java.io.Serializable;

public class Account implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double balance;
	private boolean withdraw;
	private boolean deposite;
	private static final double minimumBalance =1000;
	
	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isWithdraw() {
		return withdraw;
	}

	public void setWithdraw(boolean withdraw) {
		this.withdraw = withdraw;
	}

	public boolean isDeposite() {
		return deposite;
	}

	public void setDeposite(boolean deposite) {
		this.deposite = deposite;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", withdraw=" + withdraw
				+ ", deposite=" + deposite + "]";
	}
	
	public boolean deposite(double amount, Account account) {
		if (amount>0) {
			amount = account.getBalance()+ amount;
			account.setBalance(amount);
			return true;
			
		}
		return false;
	}
	public boolean withdraw(double amount, SavingAccount account) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean withdraw(double amount, CurrentAccount account) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
