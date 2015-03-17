package com.langsin.thread.testjuc.util;
import java.util.concurrent.Semaphore;
public class TestSemaphore {
	DoSth dosth = new DoSth();
	public void go(){
		 final Semaphore semaphore = new Semaphore(3);		
		 for (int i = 0; i < 10; i++) {
			 final int tmp = i;
			 new Thread(new Runnable(){
					@Override
					public void run() {	
						try {
							//
							semaphore.acquire();					
							dosth.work();
							semaphore.release();					
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
					}
				},"线程"+i).start();
		}
	}
	public static void main(String[] args) {
		TestSemaphore ts = new TestSemaphore();
		ts.go();
	}
	class DoSth{
		public void work(){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("当前线程的名字:"+Thread.currentThread().getName());
		}
	}
}
