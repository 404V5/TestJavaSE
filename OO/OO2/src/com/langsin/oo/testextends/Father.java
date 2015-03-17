package com.langsin.oo.testextends;

public class Father extends GrandFather{

	public String name ;
	public int age;
	
	public Father(String name){
		System.out.println("带有一个参数的父类构造方法");
	}
	
	public Father(){
		System.out.println("父类构造函数");
	}
	
	public void f1(){
		System.out.println("我是父类的f1");
	}
	
	public int add(int a,int b){
		return a+b;
	}
}

