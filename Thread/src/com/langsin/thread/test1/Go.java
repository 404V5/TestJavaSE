package com.langsin.thread.test1;

public class Go {

	public static void main(String[] args) {
		MyThread1 t1  = new MyThread1();
		MyTHread2 t2 = new MyTHread2();
		
		t1.start();
		new Thread(t2).start();
		
		while(true){
			System.out.println("这是main线程");
		}
		
	}
}
