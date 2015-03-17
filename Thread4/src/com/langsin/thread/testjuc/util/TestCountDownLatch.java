package com.langsin.thread.testjuc.util;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class TestCountDownLatch {

	public void go() {
		final Random r = new Random();
		final CountDownLatch latch = new CountDownLatch(3);		
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("子线程1正在工作");
				try {
					Thread.sleep(r.nextInt(3000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("子线程1工作完毕");
				latch.countDown();									
			}
		}, "子线程1").start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("子线程2正在工作");
				try {
					Thread.sleep(r.nextInt(3000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("子线程2工作完毕");
				latch.countDown();
			}
		}, "子线程2").start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("子线程3正在工作");
				try {
					Thread.sleep(r.nextInt(3000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("子线程3工作完毕");
				latch.countDown();
			}
		}, "子线程3").start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("主线程等待子线程全部完毕……");
				try {
					latch.await();									
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("所有子线程工作完毕，主线程开始工作……");
			}
		}, "主线程").start();
	}

	public static void main(String[] args) {
		TestCountDownLatch test = new TestCountDownLatch();
		test.go();
	}
}
