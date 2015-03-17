package com.langsin.oo.testextends;

public class Go {

	public static void main(String[] args) {
		
		Child c = new Child();
		Father f = c;
		
		
		Father ff = new Father();
		Child cc = (Child) ff;
	}
}
