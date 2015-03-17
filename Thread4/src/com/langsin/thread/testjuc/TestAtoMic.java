package com.langsin.thread.testjuc;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 我们要将i加到  Integer.MaxValue
 * @author Administrator
 *
 */
public class TestAtoMic {
	V v = new V();
	
	public static void main(String[] args) {
		TestAtoMic t = new TestAtoMic();
		t.go();
	}
	
	private void go() {
		for (int i = 0; i < 3; i++) {
			new Thread(new Runnable(){
				int j = 0;
				@Override
				public void run() {
					// TODO Auto-generated method stub
					while(j<100000){
						v.increase();
						j++;
					}
				}
			}).start();
		}
		
		while(Thread.activeCount()>1){
			
		}
		System.out.println(v.ai.get());
	}

	class V{
		//public int i;
		public AtomicInteger ai = new AtomicInteger(0);
		public  void increase(){
			//i++;
			ai.getAndIncrement();
		}
	}

}
