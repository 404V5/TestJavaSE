package com.langsin.oo.testsingleTon;

public class Go {

	public static void main(String[] args) {
		AAA a = AAA.getInstance();
		AAA b = AAA.getInstance();
		AAA c = AAA.getInstance();
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(c == b);
		
	}
}
