package com.langsin.thread.testjuc.collections;

import java.util.Random;
import java.util.concurrent.SynchronousQueue;


public class TestSynchronousQueue {
	public static void main(String[] args) {
		TestSynchronousQueue test = new TestSynchronousQueue();
		test.go();
	}
	DoSth ds = new DoSth();
	private void go() {
		for (int i = 0; i < 3; i++) {
			final String value = i+"";
			new Thread(new Runnable() {
				@Override
				public void run() {
					while(true){
						System.out.println("线程"+Thread.currentThread().getName()+"准备放入数据"+value);
						ds.addData(value);
						System.out.println("线程"+Thread.currentThread().getName()+"放入数据"+value+"成功");
					}
				}
			}).start();
		}
		for (int i = 0; i < 2; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					while(true){
						System.out.println("线程"+Thread.currentThread().getName()+"准备取数据");
						String value = ds.getData();
						System.out.println("线程"+Thread.currentThread().getName()+"成功取数据"+value);
					}
				}
			}).start();
		}
	}
	class DoSth{
		SynchronousQueue<String> queue = new SynchronousQueue<String>();
		Random r = new Random();
		public void addData(String s){
			try {
				Thread.sleep(r.nextInt(2000));
				queue.put(s);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public String getData(){
			try {
				Thread.sleep(r.nextInt(2000));
				String value = queue.take();
				return value;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
	}
}
