package com.langsin.collection.TestList;

import java.util.List;

public class TestMyArrayList {
	
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
		MyArrayList list = new MyArrayList();
		list.add("a");
		list.add("b");
		list.add("d");
		list.add("c");
		list.add("b");
		
		list.add("a");
		list.add("b");
		list.add("d");
		list.add("c");
		list.add("b");
		
		list.add("1");
		list.add("a");
		list.add("b");
		list.add("d");
		list.add("c");
		list.add("b");
		
		list.add("a");
		list.add("b");
		list.add("d");
		list.add("c");
		list.add("b");
		
		list.add("1");
		
		showList(list);
	}

}
