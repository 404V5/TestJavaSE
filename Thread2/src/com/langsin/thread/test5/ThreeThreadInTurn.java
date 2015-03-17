package com.langsin.thread.test5;

public class ThreeThreadInTurn {

	public static void main(String[] args) {
		new ThreeThreadInTurn().go();
	}

	V v = new V();

	public void go() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					v.f1();
				}
			}
		}, "线程A").start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					v.f2();
				}
			}
		}, "线程B").start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					v.f3();
				}
			}
		}, "线程C").start();
	}

	class V {
		public int i = 1;

		public synchronized void f1() {
			while (i != 1) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("f1:" + Thread.currentThread().getName());
			i = 2;
			notifyAll();
		}

		public synchronized void f2() {
			while (i != 2) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("f2:" + Thread.currentThread().getName());
			i = 3;
			notifyAll();
		}

		public synchronized void f3() {
			while (i != 3) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("f3:" + Thread.currentThread().getName());
			i = 1;
			notifyAll();
		}

	}

}
