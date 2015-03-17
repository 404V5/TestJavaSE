package com.langsin.oo.test3;

public  class TestStatic {

	{
		System.out.println("普通代码块");
	}
	
	public TestStatic(){
		System.out.println("构造方法");
	}
	
	static{
		System.out.println("static代码块");
	}
	
	
	
	public static int i = 10;
	public static String s = "hello";
	public int a = 3;
	
	public void f2(){
		System.out.println(s);
		f1();
	}
	public static void f1(){
	}
	
}
