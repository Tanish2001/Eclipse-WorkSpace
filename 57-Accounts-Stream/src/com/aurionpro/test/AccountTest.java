package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;
import com.aurionpro.model.Gender;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Account> accountList = new ArrayList<Account>();
		Collections.addAll(accountList, new Account(1, "Ban", 200000,Gender.Male), new Account(2, "Tan", 150000,Gender.Female),
				new Account(3, "Man", 50000,Gender.Male),new Account(4, "Wan", 300000, Gender.Female));
//		System.out.println(accountList);
//		System.out.println(accountList.get(0).getGender()==(Gender.Male));
		List<Account> FemaleList = accountList.stream()
				.filter((account)-> account.getBankBalance()>100000 && account.getGender()==(Gender.Female))
				.collect(Collectors.toList());
		System.out.println(FemaleList);
		
		List<Account> maleList = accountList.stream()
				.filter((account)-> account.getBankBalance()>100000 && account.getGender()==(Gender.Male))
				.collect(Collectors.toList());
		System.out.println(maleList);
	}

}
