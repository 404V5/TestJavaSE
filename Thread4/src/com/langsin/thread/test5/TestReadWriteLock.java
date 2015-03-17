package com.langsin.thread.test5;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestReadWriteLock {
	Random r = new Random();
	Data data = new Data();
	public void go(){
		for (int i = 0; i < 3; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					data.get(r.nextInt(100));
				}
			},"读线程"+i).start();
		}
		
		for (int i = 0; i < 3; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					data.add(r.nextInt(100));
				}
			},"写线程"+i).start();
		}
	}
	public static void main(String[] args) {
		TestReadWriteLock trw = new TestReadWriteLock();
		trw.go();
	}
}
class Data{
	private List elementData ;
	ReadWriteLock rw = new ReentrantReadWriteLock();
	Random r = new Random();
	public Data(){
		init();
	}
	private void init() {
		// TODO Auto-generated method stub
		this.elementData = new ArrayList();
		for (int i = 0; i < 100; i++) {
			elementData.add(i);
		}
	}
	public void add(Object data){
		rw.writeLock().lock();
		try{
			System.out.println("当前线程:"+Thread.currentThread().getName()+"正在写入");
			Thread.sleep(r.nextInt(1000));
			elementData.add(data);
			System.out.println("当前线程:"+Thread.currentThread().getName()+"写入完毕");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			rw.writeLock().unlock();
		}
	}
	public Object get(int index){
		rw.readLock().lock();
		try{
			System.out.println("当前线程:"+Thread.currentThread().getName()+"正在读取");
			Thread.sleep(r.nextInt(1000));
			System.out.println("当前线程:"+Thread.currentThread().getName()+"读取完毕");
			return elementData.get(index);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			rw.readLock().unlock();
		}
		return null;
	}
	
}
