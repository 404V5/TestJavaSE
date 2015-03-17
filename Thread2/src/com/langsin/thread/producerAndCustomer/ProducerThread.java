package com.langsin.thread.producerAndCustomer;

/**
 * 生产者
 * @author Administrator
 *
 */
public class ProducerThread implements Runnable{

	ProductContainer pc = null;
	
	public ProducerThread(ProductContainer pc) {
		this.pc = pc;
	}



	@Override
	public void run() {
		int i = 0;
		while(true){
			Product p = new Product(++i, "产品"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pc.putProduct(p);
		}
	}
}
