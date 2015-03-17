package com.langsin.thread.testjuc.cache;

public class Go {

	public static void main(String[] args) {
		//单线程模式
//		HardWork hw = new HardWork();
//		int result = hw.work(2);
//		int result2 = hw.work(2);
//		System.out.println(result);
//		System.out.println(result2);
		
		//多线程模式
		long begin = System.currentTimeMillis();
		final HardWork hw = new HardWork();
		for (int i = 0; i < 2; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					int result = hw.work(2);
					System.out.println(result);
				}
			}).start();
		}
		
		while(Thread.activeCount()>1){
			
		}
		long end = System.currentTimeMillis();
		long result = end-begin;
		System.out.println("耗时:"+result);
		System.out.println("耗时:"+result/1000);
		
		
		
	}
}
