package com.aurionpro.model;

public class SavingAccount extends Account {
	@Override
	public boolean withdraw(double amount,SavingAccount account) {
		if (account.getBalance()>1000 && account.getBalance()-amount>0) {
			double updateBalance = account.getBalance()-amount;
			account.setBalance(updateBalance);
			return true;
		}
		
		return false;
	}
}
