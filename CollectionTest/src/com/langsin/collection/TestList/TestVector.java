package com.langsin.collection.TestList;

import java.util.List;
import java.util.Vector;

/**
 * Vector �� ArrayListֻ��һ������
 * 
 * Vector���̰߳�ȫ��
 * ArrayList���̲߳���ȫ��
 * 
 * ���������̲߳���ȫ��ǰ����Ҫ��֤�̰߳�ȫ��Ҳ���Ƽ�ʹ��Vector
 * ��ʹ��Collections�����ཫArrayListת�����̰߳�ȫ��
 * 
 * StringBuffer
 * StringBuilder
 * 
 * ��ν�̰߳�ȫ�޷Ǿ��� �ڷ����ϼ�����     synchronized
 * 
 * @author Administrator
 *
 */
public class TestVector {

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
		 * remove �� get ����ȡ��Ԫ��
		 * remove		���ó���
		 * get	�ǲ鿴
		 */
		
		
	}
}
