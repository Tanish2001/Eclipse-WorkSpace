package com.aurionpro.model;

import java.util.LinkedList;

import org.w3c.dom.Node;

public class LinkedListModel {
Node head;

class Node{
	int data;
	Node next;
	
	Node(int d ){
		data = d;
		next=null;
	}
}

public LinkedList<Integer> insert(LinkedList<Integer> list, int data) {
	Node new_node = new Node(data);
	if(list.head)
	return list;
	
}

}
