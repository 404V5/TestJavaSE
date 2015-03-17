package com.langsin.thread.test2;

public class TestJoin2 {

	public static void main(String[] args) {
		TestJoin2 t = new TestJoin2();
		t.go();
	}
	
	public void go(){
		MainThread mainT = new MainThread();
		mainT.start();
		
	}
	class MainThread extends Thread{
		@Override
		public void run() {
			int i = 0;
			while(++i<100){
				if(i == 30){
					JoinThread joinT = new JoinThread();
					joinT.start();
					try {
						joinT.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}

	class JoinThread extends Thread{
		@Override
		public void run() {
			int i = 1000;
			while(++i<1050){
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
}


