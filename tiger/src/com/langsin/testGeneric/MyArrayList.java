package com.langsin.testGeneric;

import java.io.Serializable;

public class MyArrayList<T extends Number & Serializable>{

	private Object[] data;
	private int current;
	
	public void add(T o){
		data[current]=o;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index){
		return (T)data[current];
	}
	
	public <K> void test(K k){
		
	}
	
	public MyArrayList(){
		this(10);
	}
	public MyArrayList(int size){
		data = new Object[size];
	}
	
}
