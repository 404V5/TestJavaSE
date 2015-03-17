package com.langsin.thread.testjuc.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test2 {

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.go();
	}
	V v = new V();
	private void go() {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				v.show();
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				v.mod();
			}
		}).start();
	}

	class V{
		
		private List<Integer> list = new CopyOnWriteArrayList<Integer>();
		public V(){
			for (int i = 0; i < 100; i++) {
				list.add(i);
			}
		}
		
		public void mod(){
			for (int i = 200; i < 300; i++) {
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				list.add(i);
			}
		}
		public void show(){
			for (Integer i : list) {
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
		}
	}
}
