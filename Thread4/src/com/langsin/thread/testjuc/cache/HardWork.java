package com.langsin.thread.testjuc.cache;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class HardWork {

	public  int work(final int i){
//		if(LsCache.hasKey(i)){
//			return LsCache.popCache(i);
//		}
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		int result = i<<3;
//		LsCache.addCache(i, result);
//		return result;
		Integer result = null;
		if(LsCache.hasKey(i)){
			
			try {
				result = LsCache.popCache(i).get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
		}
		
		
		//如果没有？？？
		Callable<Integer> task = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				Thread.sleep(5000);
				return i<<3;
			}
		};
		
		FutureTask<Integer> ft = new FutureTask<Integer>(task);
		LsCache.addCache(i, ft);
		new Thread(ft).start();
		try {
			result = ft.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			LsCache.removeValue(i);
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			LsCache.removeValue(i);//ESCACHE  OSCACHE
			e.printStackTrace();
		}
		
	
		return result;
	}
}
