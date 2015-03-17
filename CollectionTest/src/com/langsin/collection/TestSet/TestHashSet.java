package com.langsin.collection.TestSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {

	/**
	 * 这里迭代有问题
	 * 因为Set 是无序的   所以  没有get 第几个  这一说。
	 * @param set
	 */
	public static void showSet(Set set){
		
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			Object obj = iter.next();
			System.out.println(obj);
		}
		
	}
	
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
	
//		set.add("a");
//		set.add("b");
//		set.add("c");
//		set.add("d");
//		set.add("e");
//		set.add("e");
		
		Person p1 = new Person(1, "张三", 30);
		Person p2 = new Person(2, "李四", 40);
		Person p3 = new Person(1, "张三", 50);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		showSet(set);
		
	}
}
