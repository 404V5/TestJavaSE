package com.langsin.collection.TestSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static  void showSet(Set set){
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			Object obj = iter.next();
			System.out.println(obj);
		}
	}
	public static void main(String[] args) {
		
		Comparator com2 = new Comparator(){
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Person p1 = (Person) o1;
				Manager p2 = (Manager) o2;
				if(p1.getAge()>p2.getAge()){
					return 1;
				}else if(p1.getAge()<p2.getAge()){
					return -1;
				}else{
				return 0;
				}
			}
		};
		
		TreeSet set  = new TreeSet(com2);
		Person p = new Person(1,"张三",20);
		Manager m = new Manager(1, "李经理", 50, 10000.00);
		set.add(p);
		set.add(m);
		showSet(set);
		
		
	}
}
