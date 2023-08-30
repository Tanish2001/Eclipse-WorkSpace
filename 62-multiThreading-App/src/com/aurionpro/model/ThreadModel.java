package com.aurionpro.model;

public class ThreadModel extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(this.getPriority()+" "+this.getName()+" "+i);
//			System.out.println("Priority is"+this.getName()+" "+this.getPriority());
		}
	}
	
}
