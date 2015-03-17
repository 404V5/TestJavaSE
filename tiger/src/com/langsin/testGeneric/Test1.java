package com.langsin.testGeneric;
import java.util.ArrayList;
import java.util.List;


public class Test1 {

	/**
	 * 
	 * 泛型最后会被擦除
	 * 仅仅在编译期间有效
	 * List<?> 是 List<String>的父类么
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		//将list转换成数组
		
		//Object obj = list.toArray();
		
		
		@SuppressWarnings("unused")
		String[] result = list.toArray(new String[0]);
		
		
		
		
		
		
//		List<Double> list = new ArrayList<Double>();
//		
//		//f1(list);
//		f2(new String[]{});
//		f3(list);
	}
	
	public static void f1(List<Object> list){
		
	}
	public static void f2(Object[] objs){
		
	}
	
	public static void f3(List<? extends Number> list){
		
	}
	
	
	
	
	
	
	
}
