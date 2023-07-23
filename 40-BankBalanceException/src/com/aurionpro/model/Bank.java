package com.aurionpro.model;

import com.aurionpro.util.InsufficientBalanceException;

public class Bank {
	private int accountNumber;
	private String name;
	private double balance;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
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
	
	public Bank(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	public static void withdraw(Bank bank,double amount) throws InsufficientBalanceException {
		if(bank.getBalance()-amount>1000) {
			bank.setBalance(bank.getBalance()-amount);
			
		}
		else {
			throw new InsufficientBalanceException("Insufficient balance current balance is "+bank.getBalance()+" withdraw amount is "+amount);
		}
	}
	
	

}
