package com.langsin.thread.test2;

public class TestJoin {
	
	
	public static void main(String[] args) {
		
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100; i++) {
					System.out.println("�߳�����"+Thread.currentThread().getName()+",i��ֵΪ��"+i);
					if(i==30){
						//������һ���̼߳���������������������Ϻ����ڼ���ִ��
						Thread joinThread = new Thread(new Runnable() {
							@Override
							public void run() {
								// TODO Auto-generated method stub
								for (int j = 1000; j < 1050; j++) {
									System.out.println("�߳�����"+Thread.currentThread().getName()+",j��ֵΪ��"+j);
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
