package com.aurionpro.model;

public class Table extends Thread{
int number;
	public Table(int number){
		this.number = number;
	}
	@Override
	public void run() {

			for (int i = 1; i <=10; i++) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(this.getName()+" "+number+"*"+i+"= "+number*i);
			}
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
