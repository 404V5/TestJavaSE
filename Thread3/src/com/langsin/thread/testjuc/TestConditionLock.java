package com.langsin.thread.testjuc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestConditionLock {

	V v = new V();

	public static void main(String[] args) {
		TestConditionLock t = new TestConditionLock();
		t.go();

	}

	private void go() {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					v.f1();
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					v.f2();
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					v.f3();
				}
			}
		}).start();
	}

	class V {

		Lock lock = new ReentrantLock();
		Condition c1 = lock.newCondition();
		Condition c2 = lock.newCondition();
		Condition c3 = lock.newCondition();
		int token = 1;
		public void f1() {
			lock.lock();
			try {
				while(token!=1){
					try {
						c1.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("f1 invoked!");
				token = 2;
				c2.signal();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				lock.unlock();
			}
		}

		public void f2() {
			lock.lock();
			try {
			while(token!=2){
				try {
					c2.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("f2 invoked!");
			token = 3;
			c3.signal();
			}finally{
				lock.unlock();
			}
		}

		
		public void f3() {
			lock.lock();
			try {
			while(token!=3){
				try {
					c3.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("f3 invoked!");
			token = 1;
			c1.signal();
			}finally{
				lock.unlock();
			}
		}

	}

}
