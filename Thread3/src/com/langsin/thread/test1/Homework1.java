package com.langsin.thread.test1;

public class Homework1 {

	int i = 0;

	public void increase() {
		i++;
	}

	public static void main(String[] args) {
		final Homework1 h = new Homework1();
		for (int i = 0; i < 4; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					int j = 100000;
					while(j>0){
						h.increase();
						--j;
					}
					
				}
			}).start();
		}
		
		while(Thread.activeCount()>1){
			//什么都不做
		}
		
		System.out.println("i的值是："+h.i);
	}

	public void go() {
		while (i < 300000) {
			i++;
		}
		System.out.println(i);
	}

}
