package com.langsin.collection.TestSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	
	public static  void showSet(Set set){
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			Object obj = iter.next();
			System.out.println(obj);
		}
	}
	
	/**
	 * 1. ��������   ��ν���
	 * 2. ������������  ��ôŪ��
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * ��������ת��
		 * �����������ͺͻ�����������֮�䲻��ֱ��ת��
		 * Object o = new Integer;
		 * int i = (int)o;����
		 * int i = (Integer)o;
		 */
		Comparator com = new Comparator(){
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				int o11 = (Integer) o1;
				int o22 = (Integer) o2;
				
				if(o11>o22){
					return 1;
				}else if(o11<o22){
					return -1;
				}else{
					return 0;
				}
				
			}
		};
		
//		TreeSet set = new TreeSet(com);
//		set.add(1);
//		set.add(3);
//		set.add(100);
//		set.add(99);
//		set.add(58);
//		set.add(1199);
//		TestTreeSet t = new TestTreeSet();
//		t.showSet(set);
		
		/**
		 * ��Գ��������������ǿ���ʹ�ñȽ���
		 * ��������һ�ַ�ʽ
		 */
//		Comparator com2 = new Comparator(){
//			@Override
//			public int compare(Object o1, Object o2) {
//				// TODO Auto-generated method stub
//				Person p1 = (Person) o1;
//				Person p2 = (Person) o2;
//				if(p1.getAge()>p2.getAge()){
//					return 1;
//				}else if(p1.getAge()<p2.getAge()){
//					return -1;
//				}else{
//				return 0;
//				}
//			}
//		};
		TreeSet set = new TreeSet();
		Person p1 = new Person(1, "����", 30);
		Person p2 = new Person(2, "����", 40);
		Person p3 = new Person(3, "����", 50);
		Person p4 = new Person(4, "����", 20);
		
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		showSet(set);
		
	}

}
