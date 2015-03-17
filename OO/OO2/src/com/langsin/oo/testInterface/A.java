package com.langsin.oo.testInterface;

public class A {

	
	public IB b;
	public void test(){
		String s = b.getSth();
		System.out.println(s);
	}

	public static void main(String[] args) {
		A a = new A();
		a.test();
	}
}



