package com.langsin.oo.testextends;

public class Father extends GrandFather{

	public String name ;
	public int age;
	
	public Father(String name){
		System.out.println("����һ�������ĸ��๹�췽��");
	}
	
	public Father(){
		System.out.println("���๹�캯��");
	}
	
	public void f1(){
		System.out.println("���Ǹ����f1");
	}
	
	public int add(int a,int b){
		return a+b;
	}
}

