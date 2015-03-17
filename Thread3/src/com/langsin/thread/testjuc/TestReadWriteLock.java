package com.langsin.thread.testjuc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 测试读写锁
 * 1. 要考虑 有一个地方存储东西
 * 2. 提供读和写两个方法   对这个地方进行操作
 * 3. 开启多个线程  有读 有写  
 * 4. 证明  读的时候可以读  
 * @author Administrator
 *
 */
public class TestReadWriteLock {
	
	public static void main(String[] args) {
		TestReadWriteLock t = new TestReadWriteLock();
		t.go();
	}
	Random r = new Random();
	Data d = new Data();
	
	private void go() {
		// TODO Auto-generated method stub
		
		
//		for (int i = 0; i < 3; i++) {
//			new Thread(new Runnable() {
//				@Override
//				public void run() {
//					// TODO Auto-generated method stub
//					d.read(r.nextInt(100));
//				}
//			},"读线程"+i).start();
//		}
//		
//		for (int i = 0; i < 3; i++) {
//			new Thread(new Runnable() {
//				@Override
//				public void run() {
//					// TODO Auto-generated method stub
//					d.write(r.nextInt(100));
//				}
//			},"写线程"+i).start();
//		}
//
		
		
		for (int i = 0; i < 5; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
						d.read(r.nextInt(999));
				}
			},"读线程"+i).start();
		}
		
		for (int i = 0; i < 3; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
						d.write(r.nextInt(1000));
				}
			},"写线程" +i).start();
		}
//		
		
	}


	
	
	
	
	
	
	
	
	
}
class Data{
//	List<Integer> list = new ArrayList<Integer>();
//	//使用代码块   初始化list   里面有0-999这些数字
//	{
//		for (int i = 0; i < 1000; i++) {
//			list.add(i);
//		}
//	}
//	//创建一个读写锁发生器
//	ReadWriteLock rw = new ReentrantReadWriteLock();
////	//通过发生器创建   读锁
////	Lock readLock = lock.readLock();
////	//通过发生器创建   写锁
////	Lock writeLock = lock.writeLock();
	
	private List elementData ;
	ReadWriteLock rw = new ReentrantReadWriteLock();
	Random r = new Random();
	public Data(){
		init();
	}
	private void init() {
		// TODO Auto-generated method stub
		this.elementData = new ArrayList();
		for (int i = 0; i < 1000; i++) {
			elementData.add(i);
		}
	}
	
	public  int read(int index){
		int i = 0 ;
		rw.readLock().lock();
		try {
			System.out.println(Thread.currentThread().getName()+"进入读取的方法");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i = (Integer) elementData.get(index);
			System.out.println("读到的数据位："+i);
			System.out.println(Thread.currentThread().getName()+"读取完毕");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			rw.readLock().unlock();
		}
		return i;
	}
	
	public  void write(int data){
		rw.writeLock().lock();
		try {
			System.out.println(Thread.currentThread().getName()+"进入写方法");
			try {
				Thread.sleep(r.nextInt(1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			elementData.add(data);
			System.out.println(Thread.currentThread().getName()+"写入完毕");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			rw.writeLock().unlock();
		}
	}
	
}
