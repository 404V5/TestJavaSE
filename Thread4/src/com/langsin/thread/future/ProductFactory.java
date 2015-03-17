package com.langsin.thread.future;

/**
 * 生产产品
 * @author Administrator
 *
 */
public class ProductFactory {

	public Product buildProduct(){
		return new Product(1,"李东阳 王老师");
	}
}
