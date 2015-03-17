package com.langsin.thread.testjuc;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(8);
		ExecutorService threadPool2 = Executors.newCachedThreadPool();
		ExecutorService threadPool3 = Executors.newSingleThreadExecutor();
		final Random r = new Random();
		Runnable target = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName()+"第"+i+"个任务");
					try {
						Thread.sleep(r.nextInt(500));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		for (int j = 0; j < 10; j++) {
//			new Thread(target).start();
			threadPool3.execute(target);
		}
		
		
	}
}
