package com.langsin.thread.test1;

public class MyTHread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("这是第二个线程");
		}
	}

}
