package com.aurionpro.model;

public class AppModel<E > {
	private E value;
	
	public AppModel(E value) {
		super();
		this.value = value;
	}

	public void printValue() {
		System.out.println(value);
	}
	
	
}
