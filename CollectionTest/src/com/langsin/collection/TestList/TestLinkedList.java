package com.langsin.collection.TestList;

import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList和ArrayList的区别是什么？
 * ArrayList底层是用数组存储
 * LinkedList底层是用的链表存储
 * 
 * 
 * 链表:  修改比较快     查找慢
 * 数组: 	查找块  	修改慢
 * 
 * 
 * @author Administrator
 *
 */
public class TestLinkedList {
	/**
	 * 迭代给定的List
	 * @param list
	 */
	public static void showList(List list){
		for(int i = 0; i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		
		list.add("a");
		list.add("b");
		list.add("d");
		list.add("c");
		list.add("b");
		
		//如果以List的身份来运行
//		Object firstData = list.get(0);	//取
//		Object firstData2 = list.remove(0);
//		list.add("z");
//		list.add(list.size(), "zz");
		
		//如果以Queue的身份来运行
		Object firstData = list.peek();
		Object firstData2 = list.poll();
		
		LinkedList list2 = new LinkedList();
		list2.push(1);
		list2.push(2);
		list2.push(3);
		
		System.out.println(list2.pop());
		
		System.out.println(list2.pop());
		
		System.out.println(list2.pop());
		
		
	
		
	}
}
