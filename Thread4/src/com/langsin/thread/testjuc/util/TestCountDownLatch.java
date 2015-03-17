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
				System.out.println("���߳�1���ڹ���");
				try {
					Thread.sleep(r.nextInt(3000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("���߳�1�������");
				latch.countDown();									
			}
		}, "���߳�1").start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("���߳�2���ڹ���");
				try {
					Thread.sleep(r.nextInt(3000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("���߳�2�������");
				latch.countDown();
			}
		}, "���߳�2").start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("���߳�3���ڹ���");
				try {
					Thread.sleep(r.nextInt(3000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("���߳�3�������");
				latch.countDown();
			}
		}, "���߳�3").start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("���̵߳ȴ����߳�ȫ����ϡ���");
				try {
					latch.await();									
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("�������̹߳�����ϣ����߳̿�ʼ��������");
			}
		}, "���߳�").start();
	}

	public static void main(String[] args) {
		TestCountDownLatch test = new TestCountDownLatch();
		test.go();
	}
}
