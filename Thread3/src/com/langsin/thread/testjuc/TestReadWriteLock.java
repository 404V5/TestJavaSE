package com.langsin.thread.testjuc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ���Զ�д��
 * 1. Ҫ���� ��һ���ط��洢����
 * 2. �ṩ����д��������   ������ط����в���
 * 3. ��������߳�  �ж� ��д  
 * 4. ֤��  ����ʱ����Զ�  
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
//			},"���߳�"+i).start();
//		}
//		
//		for (int i = 0; i < 3; i++) {
//			new Thread(new Runnable() {
//				@Override
//				public void run() {
//					// TODO Auto-generated method stub
//					d.write(r.nextInt(100));
//				}
//			},"д�߳�"+i).start();
//		}
//
		
		
		for (int i = 0; i < 5; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
						d.read(r.nextInt(999));
				}
			},"���߳�"+i).start();
		}
		
		for (int i = 0; i < 3; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
						d.write(r.nextInt(1000));
				}
			},"д�߳�" +i).start();
		}
//		
		
	}


	
	
	
	
	
	
	
	
	
}
class Data{
//	List<Integer> list = new ArrayList<Integer>();
//	//ʹ�ô����   ��ʼ��list   ������0-999��Щ����
//	{
//		for (int i = 0; i < 1000; i++) {
//			list.add(i);
//		}
//	}
//	//����һ����д��������
//	ReadWriteLock rw = new ReentrantReadWriteLock();
////	//ͨ������������   ����
////	Lock readLock = lock.readLock();
////	//ͨ������������   д��
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
			System.out.println(Thread.currentThread().getName()+"�����ȡ�ķ���");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i = (Integer) elementData.get(index);
			System.out.println("����������λ��"+i);
			System.out.println(Thread.currentThread().getName()+"��ȡ���");
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
			System.out.println(Thread.currentThread().getName()+"����д����");
			try {
				Thread.sleep(r.nextInt(1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			elementData.add(data);
			System.out.println(Thread.currentThread().getName()+"д�����");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			rw.writeLock().unlock();
		}
	}
	
}
