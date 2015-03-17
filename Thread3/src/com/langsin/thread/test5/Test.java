package com.langsin.thread.test5;

public class Test {

	
	class V{
		public int total = 5;
		public void add(int i){
			while(total+i >10){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		public void sub(int i){
			while(total-i <0){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
