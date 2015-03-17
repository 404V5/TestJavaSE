package com.langsin.thread.testjuc;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Book {

	private static Book instance = null;
	private static ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

	private Book() {
	}

	public static Book getInstance() {
		try {
			rwl.readLock().lock();
			if (instance == null) {
				rwl.readLock().unlock();
				rwl.writeLock().lock();
				if (instance == null) {
					instance = new Book();
				}
				rwl.readLock().lock();
			    rwl.writeLock().unlock(); 
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			rwl.readLock().unlock();
		}
		return instance;
	}

}
