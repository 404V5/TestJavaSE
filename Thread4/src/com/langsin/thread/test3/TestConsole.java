package com.langsin.thread.test3;

public class TestConsole {

	public static void main(String[] args) {
		int i = 0;
		while(true){
			System.out.println(++i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Thread.yield();
			
			
		}
	}
}
