package com.langsin.collection.TestList;

import java.util.List;
import java.util.Vector;

/**
 * Vector 和 ArrayList只有一个区别
 * 
 * Vector是线程安全的
 * ArrayList是线程不安全的
 * 
 * 即便是在线程不安全的前提下要保证线程安全，也不推荐使用Vector
 * 而使用Collections工具类将ArrayList转换成线程安全的
 * 
 * StringBuffer
 * StringBuilder
 * 
 * 所谓线程安全无非就是 在方法上加上了     synchronized
 * 
 * @author Administrator
 *
 */
public class TestVector {

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
		Vector list = new Vector();
		list.add("a");
		list.add("b");
		list.add("d");
		list.add("c");
		list.add("b");
		
		
		Object o = list.remove(0);
		System.out.println(o);
		System.out.println("----------------------");
		showList(list);
		
		list.add(2, "f");
		
		
		Vector list2 = new Vector();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		
		list.addAll(list2);
		showList(list);
		
		System.out.println(list.contains("G"));
		System.out.println(list.indexOf("g"));
		
		/**
		 * remove 和 get 都是取得元素
		 * remove		是拿出来
		 * get	是查看
		 */
		
		
	}
}
