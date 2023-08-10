package com.aurionpro.test;

import java.util.HashSet;
import java.util.Set;

import com.aurionpro.model.Accounts;

public class AccountsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accounts acc1 = new Accounts(1, "Asis", "Verma", 12);
		Accounts acc2 = new Accounts(1, "Asis", "Verma", 12);
		
		Set<Accounts> accountsSet = new HashSet<Accounts>();
		accountsSet.add(acc1);
		accountsSet.add(acc2);
		
		System.out.println(accountsSet);
		
	}

}
