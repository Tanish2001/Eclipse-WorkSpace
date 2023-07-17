package com.aurionpro.model;

public abstract class Account {
	private int id;
	private String name;
	private double balance;
	private boolean withdraw;
	private boolean deposite;	
	
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
	public abstract boolean withdraw(double amount, Account account);
	
	
}
