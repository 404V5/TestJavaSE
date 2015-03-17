package com.langsin.thread.test1;

public class Go {

	public static void main(String[] args) {
		MyThread1 t1  = new MyThread1();
		MyTHread2 t2 = new MyTHread2();
		
		/**
		 * windows 1-10
		 * unix like  1-7
		 */
		t1.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		Thread t22 = new Thread(t2);
		t22.setPriority(Thread.NORM_PRIORITY);
		t22.start();
		
		while(true){
			System.out.println("这是main线程");
		}
		
	}
}
