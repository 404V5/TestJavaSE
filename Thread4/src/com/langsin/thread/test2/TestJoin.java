package com.langsin.thread.test2;

public class TestJoin {
	
	
	public static void main(String[] args) {
		
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100; i++) {
					System.out.println("线程名："+Thread.currentThread().getName()+",i的值为："+i);
					if(i==30){
						//让另外一个线程加三进来，让它先运行完毕后，我在继续执行
						Thread joinThread = new Thread(new Runnable() {
							@Override
							public void run() {
								// TODO Auto-generated method stub
								for (int j = 1000; j < 1050; j++) {
									System.out.println("线程名："+Thread.currentThread().getName()+",j的值为："+j);
								}
							}
						});
						
						joinThread.start();
						try {
							joinThread.join();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}).start();
		
		
		
		
		
	}

}
