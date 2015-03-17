package com.langsin.thread.producerAndCustomer;

import java.util.LinkedList;

public class ProductContainer {

	private static ProductContainer instance = null;
	
	private ProductContainer(){}
	
	public static synchronized ProductContainer getInstance(){
		if(instance == null){
			instance = new ProductContainer();
		}
		return instance;
	}
	//容器
	private LinkedList<Product> list = new LinkedList<Product>();
	
	//容器的最大限制
	private int maxSize = 10;
	
	/**
	 * 往容器中添加一个产品
	 * @param product
	 */
	public synchronized void putProduct(Product product){
		while(list.size()>=maxSize){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		list.addLast(product);
		notifyAll();
		
	}
	
	/**
	 * 消费容器中的一个产品
	 * @return
	 */
	public synchronized Product getProduct(){
		while(list.size()<=0){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Product product = list.removeFirst();
		notifyAll();
		return product;
	}
	/**
	 * 检查容器大小
	 * @return
	 */
	public int checkSize(){
		return list.size();
	}
	
}
