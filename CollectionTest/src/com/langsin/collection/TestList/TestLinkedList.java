package com.langsin.collection.TestList;

import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList��ArrayList��������ʲô��
 * ArrayList�ײ���������洢
 * LinkedList�ײ����õ�����洢
 * 
 * 
 * ����:  �޸ıȽϿ�     ������
 * ����: 	���ҿ�  	�޸���
 * 
 * 
 * @author Administrator
 *
 */
public class TestLinkedList {
	/**
	 * ����������List
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
		
		//�����List�����������
//		Object firstData = list.get(0);	//ȡ
//		Object firstData2 = list.remove(0);
//		list.add("z");
//		list.add(list.size(), "zz");
		
		//�����Queue�����������
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
