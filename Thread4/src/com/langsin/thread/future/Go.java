package com.langsin.thread.future;

public class Go {

	public static void main(String[] args) {
		
		ProductFactory f = new ProductFactory();
		Product p = f.buildProduct();
		System.out.println("我想干点别的");
		System.out.println(p);
		
		
	}
}
