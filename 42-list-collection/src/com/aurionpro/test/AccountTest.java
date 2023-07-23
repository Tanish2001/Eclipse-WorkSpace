package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Account> accounts = new ArrayList<Account>();
		
		accounts.add(new Account(1,"ban",100));
		accounts.add(new Account(2,"can",600));
		accounts.add(new Account(3,"man",800));
		accounts.add(new Account(4,"tan",300));
		
		System.out.println(accounts);
		
		for (int i = 0; i < accounts.size(); i++) {
			System.out.println(accounts.get(i));
			System.out.println(accounts.get(i).getName());
		}
		
		Iterator<Account> iterable =  accounts.iterator();
		
		while(iterable.hasNext()) {
			System.out.println(iterable.next());
		}
		
		Collections.sort(accounts);
		System.out.println(accounts);

	}

}
