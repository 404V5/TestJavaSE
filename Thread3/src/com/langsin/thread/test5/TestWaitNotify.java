package com.langsin.thread.test5;

public class TestWaitNotify {

	public static void main(String[] args) {
		TestWaitNotify t = new TestWaitNotify();
		t.go();
	}
	
	V v = new V();
	private void go() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					v.f1();
				}
			}
		},"A线程").start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					v.f2();
				}
			}
		},"B线程").start();
	}

	class V{
		public boolean flag = true;
		public synchronized void f1(){
			while(flag){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("F1:"+Thread.currentThread().getName());
			flag = true;
			notifyAll();
		}
		
		public synchronized void f2(){
			while(!flag){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("F2:"+Thread.currentThread().getName());
			flag = false;
			notifyAll();
			
		}
	}
}
