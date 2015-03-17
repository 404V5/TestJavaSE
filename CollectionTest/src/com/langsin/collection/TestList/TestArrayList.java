package com.langsin.collection.TestList;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

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
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("d");
		list.add("c");
		list.add("b");
		
		
		Object o = list.remove(0);
		System.out.println(o);
		System.out.println("----------------------");
		showList(list);
		
//		list.add(2, "f");
//		
//		
//		ArrayList list2 = new ArrayList();
//		list2.add("1");
//		list2.add("2");
//		list2.add("3");
//		
//		list.addAll(list2);
//		showList(list);
//		
//		System.out.println(list.contains("G"));
//		System.out.println(list.indexOf("g"));
		
		/**
		 * remove 和 get 都是取得元素
		 * remove		是拿出来
		 * get	是查看
		 */
		
		
	}
}
