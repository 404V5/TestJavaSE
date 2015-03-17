package com.langsin.thread.producerAndCustomer;

public class Go {
	
	public static void main(String[] args) {
		
		final ProductContainer pc =  ProductContainer.getInstance();
		
		for (int i = 0; i < 10; i++) {
			new Thread(new ProducerThread(pc)).start();
		}
		for (int i = 0; i < 10; i++) {
			new Thread(new CustomerThread(pc)).start();
		}
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					try {
						Thread.sleep(30);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					int size = pc.checkSize();
					System.err.println(size);
				}
			}
		}).start();
		
	}

}
