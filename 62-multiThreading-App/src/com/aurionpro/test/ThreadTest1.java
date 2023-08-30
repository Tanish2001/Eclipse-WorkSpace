package com.aurionpro.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task = ()->{
			synchronized (args) {
				for (int i = 0; i < 3; i++) {
					System.out.println(Thread.currentThread().getName());
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
//		for (int i = 0; i < 10; i++) {
//			String name = "Thread " + i;
//			Thread temp = new Thread(task,name);
//			temp.start();
//		}
		
		ExecutorService service = Executors.newFixedThreadPool(20);
		for (int i = 0; i < 20; i++) {
			service.execute(task);
		}
	}

}
