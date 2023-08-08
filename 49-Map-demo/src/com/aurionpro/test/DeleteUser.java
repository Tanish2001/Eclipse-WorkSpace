package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DeleteUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> users = new HashMap<Integer, String>();
		users.put(1, "asis");
		users.put(2, "bedang");
		users.put(3, "ban");
		users.put(4, "tan");
		users.put(5, "van");
		Set<Entry<Integer, String>> entrySet = users.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter a name to remove");
		String userinput = userin.next();
		
		int key =0;
		
		for (Entry<Integer, String> entry : entrySet) {
//			System.out.println(entry.getValue());
			if(userinput.equalsIgnoreCase(entry.getValue())) {
				key = entry.getKey();
//				System.out.println(key);
			}
		}
//		System.out.println(key);
		users.remove(key);

		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
		

	}

}
