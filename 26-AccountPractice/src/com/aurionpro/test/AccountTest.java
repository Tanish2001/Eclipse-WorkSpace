package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.SavingAccount;
import com.aurionpro.model.CurrentAccount;


public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount account = new SavingAccount();
		account.setBalance(10000);
		account.setId(1);
		account.setName("Ban");
		
		CurrentAccount account1 = new CurrentAccount();
		account1.setBalance(0);
		account1.setId(1);
		account1.setName("Tan");
		System.out.println(account.getBalance());
		if(account.withdraw(500, account)) {
			System.out.println("Withdraw Success");
		}
		else {
			System.out.println("Withdraw Failed");
		}
		//System.out.println(account.withdraw(500, account));
		System.out.println("Current Balance "+account.getBalance());
		if(account.withdraw(10000, account1)) {
			System.out.println("Withdraw Success");
		}
		else {
			System.out.println("Withdraw Failed");
		}
		//System.out.println(account.withdraw(10000, account1));
		System.out.println("Updated Balance "+account.getBalance());
		
		System.out.println("-------------------------------------");
		
		
		System.out.println("Current Balance "+account1.getBalance());
		if(account1.deposite(10000, account1)) {
			System.out.println("Withdraw Success");
		}
		else {
			System.out.println("Withdraw Failed");
		}
		//System.out.println(account1.deposite(10000, account1));
		System.out.println("Current Balance "+account1.getBalance());
		if(account1.withdraw(20000, account1)) {
			System.out.println("Withdraw Success");
		}
		else {
			System.out.println("Withdraw Failed");
		}
//		System.out.println(account1.withdraw(20000, account1));
		System.out.println("Current Balance "+account1.getBalance());
		
	}

}
