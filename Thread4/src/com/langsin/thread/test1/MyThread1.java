package com.langsin.thread.test1;

public class MyThread1 extends Thread{

	@Override
	public void run() {
		while(true){
			System.out.println("这是第一个线程");
		}
	}
}
