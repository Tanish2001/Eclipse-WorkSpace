package com.aurionpro.model;

public class PrintCharacter implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (char i = 'A'; i < 'Z'; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+(char)i);
		}
	}

}
