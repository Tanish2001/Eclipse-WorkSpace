package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DeleteUser2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> users = new HashMap<Integer, String>();
		users.put(1, "asis");
		users.put(2, "bedang");
		users.put(3, "ban");
		users.put(4, "tan");
		users.put(5, "van");
		Set<Entry<Integer, String>> entrySet = users.entrySet();
		
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter a name to remove");
		String userinput = userin.next();
		
		

	}

}
