package com.langsin.thread.testjuc.util;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTest {
	public static void main(String[] args) {
		final CyclicBarrier cyclicBarrier = new CyclicBarrier(3); 
		ExecutorService service = Executors.newFixedThreadPool(10); 
		for (int i = 0; i < 3; i++) { 
			service.execute(new Runnable() {
				@Override
				public void run() {
					for (int i = 0; i < 5; i++) {
						try {
							Thread.sleep(new Random().nextInt(5000));
							System.out.print(Thread.currentThread().getName()
									+ "已到达集合点" + (i + 1) + "，现在共有"	
									+ (cyclicBarrier.getNumberWaiting() + 1) + 
									"个线程到达，");
							if (cyclicBarrier.getNumberWaiting() + 1 == 3) {
								System.out.println("所有线程都到齐，进行下一操作……");
							} else {
								System.out.println("正在等待其他线程……");
							}
							cyclicBarrier.await();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			});
		}
		service.shutdown();
	}
}
