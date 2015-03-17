package com.langsin.test1;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public void f1(int a){
		System.out.println("int");
	}
	public void f1(Object a){
		System.out.println("object");
	}
	public void f1(int... a){
		System.out.println("int...");
	}
	public void f1(Integer a){
		System.out.println("Integer");
	}
	public void f1(Integer... a){
		System.out.println("Integer...");
	}
	public void f1(){
		System.out.println("�޲���");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		int[] a = new int[]{1,1,1,2,3,4,5};
		//t.test0();
		//t.f1(null);
		t.test3();
	}
	
	
	public void test0(int[] a){
		
	}
	
	/**
	 * ���Բ���������
	 * 1. ʹ��ԭʼ�������޷�����������
	 * 2. ʹ�����飬����������������������һ�����⣺�޷���������
	 * 3. ����������  �﷨   ����... �β�
	 * 4. ϸ��2
	 * 		����������  ���������һλ
	 */
	public void test1(int... a){
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	/**
	 * �����Զ�����װ��
	 * �����������ͺͶ�Ӧ�İ�װ�� ����ֱ�ӽ����Բ���
	 */
	public void test2(){
		
		int i = 3;
		Integer ii = i;
		f2(3);
	}

	public void f2(Object o){
		
	}
	
	
	/**
	 * ������ǿ��forѭ��
	 * for(������װ������   ������   :  ����){
	 * 
	 * }
	 * 
	 */
	public void test3(){
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		
		for (Object o : list) {
			if("1".equals(o)){
				list.remove(o);
			}
		}
		
//		Set set = new HashSet();
//		set.add("1");
//		set.add("2");
//		set.add("3");
		
//		Iterator iter = set.iterator();
//		while(iter.hasNext()){
//			Object o = iter.next();
//			System.out.println(o);
//		}
		
//		for( int i = 0 ;i<set.size() ;i++ ){
//			set.get(i);
//		}
		
//		for(Object o  : set){
//			System.out.println(o);
//		}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
