package com.langsin.thread.producerAndCustomer;

/**
 * ������
 * @author Administrator
 *
 */
public class CustomerThread implements Runnable{

	ProductContainer pc = null;
	
	public CustomerThread(ProductContainer pc){
		this.pc = pc;
	}
	@Override
	public void run() {
		while(true){
			Product p = pc.getProduct();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("������������һ����Ʒ:"+p);
		}
		
	}
}
