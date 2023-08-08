package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> name = new HashMap<Integer, String>();
		name.put(1, "Asis");
		name.put(2, "bedang");
		name.put(3, "ban");
		name.put(4, "tan");

		
//		Set<Entry<Integer, String>> entrySet = name.entrySet();
//		for (Entry<Integer, String> entry : entrySet) {
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
		
		name.forEach((key,value)->{
			System.out.println(key +" "+ value);
		}
		);
	}

}
