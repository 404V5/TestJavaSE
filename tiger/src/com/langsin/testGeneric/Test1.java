package com.langsin.testGeneric;
import java.util.ArrayList;
import java.util.List;


public class Test1 {

	/**
	 * 
	 * �������ᱻ����
	 * �����ڱ����ڼ���Ч
	 * List<?> �� List<String>�ĸ���ô
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		//��listת��������
		
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
