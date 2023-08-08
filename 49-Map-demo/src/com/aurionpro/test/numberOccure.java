package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class numberOccure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numberList = Arrays.asList(1,1,1,1,1,1,1,3,2,2,2,2,2,2,2,2,2,2,2);
		
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < numberList.size(); i++) {
			if(count.containsKey(numberList.get(i))) {
				count.put(numberList.get(i),count.get(numberList.get(i))+1);
			}
			else {
				count.put(numberList.get(i), 1);
			}
		}
		
		Set<Entry<Integer, Integer>> entrySet = count.entrySet();
		int max = 0;
		int key = 0;
		for (Entry<Integer, Integer> entry : entrySet) {
			if(entry.getValue()>max) {
				max = entry.getValue();	
				key = entry.getKey();
			}
		}
		System.out.println("Max count is of "+key+" with count "+max);
		
		System.out.println(count);
	}

}
