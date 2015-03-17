package com.langsin.thread.testjuc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
	V v = new V();

	public static void main(String[] args) {
		TestLock tl = new TestLock();
		tl.go();
	}

	private void go() {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					v.printString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
				}
			}
		}).start();

		// TODO Auto-generated method stub
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					v.printString("TTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
				}
			}
		}).start();
	}

	class V {
		Lock lock = new ReentrantLock();
		public  void printString(String s) {
			try {
				lock.lock();
				for (int i = 0; i < s.length(); i++) {
					System.out.print(s.charAt(i));
				}
				System.out.println();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				lock.unlock();
			}
		}
	}

}
