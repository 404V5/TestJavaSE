package com.langsin.thread.future;

public class Go {

	public static void main(String[] args) {
		
		ProductFactory f = new ProductFactory();
		Product p = f.buildProduct();
		System.out.println("����ɵ���");
		System.out.println(p);
		
		
	}
}
