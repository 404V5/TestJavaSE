package com.langsin.thread.testjuc.collections;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class TestArrayBlockingQueue {

	public static void main(String[] args) {
		final ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(5);
		final Random r = new Random();
		for (int i = 0; i < 3; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					while(true){
						try {
							queue.put(r.nextInt(10000));
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}).start();
		}

		for (int i = 0; i < 5; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub  ajax  
					while(true){
						Integer result = null;
						try {
							result = queue.take();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						System.out.println(result);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}).start();
		}
	}
}
