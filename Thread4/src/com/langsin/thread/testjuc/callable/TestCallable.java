package com.langsin.thread.testjuc.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * 1. 创建Callable接口对象，实现call方法，这个call方法不仅是线程的执行体，也可以有返回值。 
 * 2. 使用FutureTask类包装Callable对象，因为FutureTask对象实现了Runnable接口，
 * 	      因此可以作为Thread的执行载体。 FutureTask封装了Callable对象的call方法返回值。 
 * 3. 使用FutureTask对象作为Thread对象的载体创建并启动线程。 
 * 4. 使用FutureTask对象的get()方法获取线程执行结果。
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
		
		System.out.println("我在干别的事情，等待结果来了之后我拿结果");
		
		//Integer i = ft.get();	//直接写get()，
		Integer i = ft.get(1000, TimeUnit.SECONDS);
		System.out.println(i);
		
	}

	/**
	 * 这其实也是一个线程 是一个增强版 1. 有返回值 2. 能够throws异常
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
