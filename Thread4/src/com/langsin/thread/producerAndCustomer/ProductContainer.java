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
	//����
	private LinkedList<Product> list = new LinkedList<Product>();
	
	//�������������
	private int maxSize = 10;
	
	/**
	 * �����������һ����Ʒ
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
	 * ���������е�һ����Ʒ
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
	 * ���������С
	 * @return
	 */
	public int checkSize(){
		return list.size();
	}
	
}
