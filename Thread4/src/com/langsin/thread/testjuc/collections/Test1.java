package com.langsin.thread.testjuc.collections;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<Integer>();
		

		for (int i = 1; i < 55; i++) {
			list.add(i);
		}
		
		for (Integer i : list) {
			System.out.println(i);
			if(i == 30){
				list.remove(i);
			}
		}
		
		System.out.println("µÚ¶þ´Î");
		for (Integer i : list) {
			System.out.println(i);
		}
	
		
	}
}
