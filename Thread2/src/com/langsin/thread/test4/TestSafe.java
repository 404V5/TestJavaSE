package com.langsin.thread.test4;

public class TestSafe {

	V v = new V();
	
	public void go(){
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					try {
						Thread.sleep(0,1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					V.printString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
				}
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					try {
						Thread.sleep(0,1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					V.printString("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
				}
			}
		}).start();
		
	}
	static class V{
		
		static Object o = new Object();
		public static void printString(String s){
			/**
			 * 假设这里还有很多代码
			 * 粒度
			 */
			
			synchronized (TestSafe.class){
				for (int i = 0; i < s.length(); i++) {
					System.out.print(s.charAt(i));
				}
				System.out.println("");
			}
			/**
			 * 假设这里还有很多代码
			 */
			
		}
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		TestSafe t = new TestSafe();
		t.go();
	}
	
}
