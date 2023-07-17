/**
 * 
 */
package com.aurionpro.model;

/**
 * 
 */
public class CurrentAccount extends Account {
	@Override
	public boolean withdraw(double amount,CurrentAccount account) {
		if (account.getBalance()>-25000&& account.getBalance()-amount>-25000) {
			double updateBalance = account.getBalance()-amount;
			account.setBalance(updateBalance);
			return true;
		}
		
		return false;
	}
}
