package com.langsin.thread.testjuc.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class TestCallableWithThreadPool {

	public static void main(String[] args) {
		TestCallableWithThreadPool t = new TestCallableWithThreadPool();
		t.go();
	}
	
	private void go() {
		// TODO Auto-generated method stub
		ExecutorService threadPool = Executors.newCachedThreadPool();
		Future<String> future =   threadPool.submit(new MyThread());
		try {
			String s = future.get();
			System.out.println(s);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	class MyThread implements Callable<String>{
		@Override
		public String call() throws Exception {
			// TODO Auto-generated method stub
			Thread.sleep(10000);
			return "hello,langsin!";
		}
	}
}
