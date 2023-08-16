package com.aurionpro.test;

import com.aurionpro.model.Bank;
import com.aurionpro.util.InsufficientBalanceException;

public class BankTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank(123, "abc", 2000);
		try {
			Bank.withdraw(bank, 2000);
		}
		catch(InsufficientBalanceException e){
			System.out.println(e.getMessage());
		}
	}

}
