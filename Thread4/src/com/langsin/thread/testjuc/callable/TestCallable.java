package com.langsin.thread.testjuc.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * 1. ����Callable�ӿڶ���ʵ��call���������call�����������̵߳�ִ���壬Ҳ�����з���ֵ�� 
 * 2. ʹ��FutureTask���װCallable������ΪFutureTask����ʵ����Runnable�ӿڣ�
 * 	      ��˿�����ΪThread��ִ�����塣 FutureTask��װ��Callable�����call��������ֵ�� 
 * 3. ʹ��FutureTask������ΪThread��������崴���������̡߳� 
 * 4. ʹ��FutureTask�����get()������ȡ�߳�ִ�н����
 * 
 * @author Administrator
 * 
 */
public class TestCallable {
	private void go() throws Exception {
		MyThread mt = new MyThread();
		FutureTask<Integer> ft = new FutureTask<Integer>(mt);
		Thread thread = new Thread(ft);
		thread.start();
		
		System.out.println("���ڸɱ�����飬�ȴ��������֮�����ý��");
		
		//Integer i = ft.get();	//ֱ��дget()��
		Integer i = ft.get(1000, TimeUnit.SECONDS);
		System.out.println(i);
		
	}

	/**
	 * ����ʵҲ��һ���߳� ��һ����ǿ�� 1. �з���ֵ 2. �ܹ�throws�쳣
	 * 
	 * @author Administrator
	 */
	class MyThread implements Callable<Integer> {
		@Override
		public Integer call() throws Exception {
			Thread.sleep(10000);
			return 1000;
		}
	}
	
	public static void main(String[] args) throws Exception {
		TestCallable t = new TestCallable();
		t.go();
	}
}
