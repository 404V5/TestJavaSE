package com.langsin.thread.testjuc.util;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExchangerTest {

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		final Exchanger<String> exchanger = new Exchanger<String>();
		service.execute(new Runnable(){
			public void run() {
				try {				

					String data1 = "aaa";
					System.out.println("�߳�" + Thread.currentThread().getName() + 
					"���ڰ�����" + data1 +"����ȥ");
					Thread.sleep((long)(Math.random()*10000));
					String data2 = exchanger.exchange(data1);
					System.out.println("�߳�" + Thread.currentThread().getName() + 
					"���ص�����Ϊ" + data2);
				}catch(Exception e){
					
				}
			}	
		}); 
		service.execute(new Runnable(){
			public void run() {
				try {				

					String data1 = "bbb";
					System.out.println("�߳�" + Thread.currentThread().getName() + 
					"���ڰ�����" + data1 +"����ȥ");
					Thread.sleep((long)(Math.random()*10000));					
					String data2 = exchanger.exchange(data1);
					System.out.println("�߳�" + Thread.currentThread().getName() + 
					"���ص�����Ϊ" + data2);
				}catch(Exception e){
					
				}				
			}	
		});		
		
		service.execute(new Runnable(){
			public void run() {
				try {				

					String data1 = "ccc";
					System.out.println("�߳�" + Thread.currentThread().getName() + 
					"���ڰ�����" + data1 +"����ȥ");
					Thread.sleep((long)(Math.random()*1000));					
					String data2 = exchanger.exchange(data1);
					System.out.println("�߳�" + Thread.currentThread().getName() + 
					"���ص�����Ϊ" + data2);
				}catch(Exception e){
					
				}				
			}	
		});		
		
	
	}
}
