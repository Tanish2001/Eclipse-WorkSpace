package com.aurionpro.test;

import com.aurionpro.model.PrintCharacter;
import com.aurionpro.model.ThreadModel;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread Started");
		ThreadModel t1  = new ThreadModel();
		ThreadModel t2 = new ThreadModel();
//		t1.start();
//		t1.setPriority(10);
//		t2.start();
//		t2.setPriority(8);
		
		PrintCharacter t3 = new PrintCharacter();
//		t3.run();
		Thread printChar = new Thread(t3);
//		printChar.start();
//		System.out.println(printChar.getName());
		
		//anonymous
		Runnable t4 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 70; i++) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+" "+i+" anonymous");
				}
			}
		};
		Thread FourthThread = new Thread(t4);
		FourthThread.start();
		
		
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Main "+i);
		}
		System.out.println("Main Thread Ended");
	}

}
