package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddNameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"asdasd","sad","asdczx","ada","gdfd","vcx","h","hj"};
		List<String> nameList = new ArrayList<String>();
		for (String string : names) {
			nameList.add(string);
		}
		System.out.println(nameList);
//		List<String> newNames = new ArrayList<String>();
//		for (String string : names) {
//			if(string.length()==3 || string.length()==4) {
//				newNames.add(string);
//			}
//		}
//		System.out.println(newNames);
		
		List<String> nameCollections = Arrays.stream(names) //for arrays
		.filter((name)->(name.length()==3 || name.length()==4))
		.collect(Collectors.toList());
		System.out.println(nameCollections);
//		nameCollections.forEach((name)->System.out.println(name));
		
		List<String> nameCollections1 = nameList.stream() //for ArrayLists
		.filter((name)->(name.length()==3 || name.length()==4))
		.collect(Collectors.toList());
		System.out.println(nameCollections1);
//		nameCollections1.forEach((name)->System.out.println(name));
	}

}
