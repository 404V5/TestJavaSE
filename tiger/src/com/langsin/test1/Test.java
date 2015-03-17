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
		System.out.println("无参数");
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
	 * 测试不定长参数
	 * 1. 使用原始参数，无法做到不定长
	 * 2. 使用数组，可以做到不定长参数，有一个问题：无法不传参数
	 * 3. 不定长参数  语法   类型... 形参
	 * 4. 细节2
	 * 		不定长参数  必须在最后一位
	 */
	public void test1(int... a){
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	/**
	 * 测试自动拆箱装箱
	 * 基本数据类型和对应的包装类 可以直接交互性操作
	 */
	public void test2(){
		
		int i = 3;
		Integer ii = i;
		f2(3);
	}

	public void f2(Object o){
		
	}
	
	
	/**
	 * 测试增强的for循环
	 * for(容器中装的类型   变量名   :  容器){
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
