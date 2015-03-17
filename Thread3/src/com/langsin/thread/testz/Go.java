package com.langsin.thread.testz;
/**
 * 测试
 * @author 王海宁
 */
public class Go {
	public static void main(String[] args) throws InterruptedException {
		RequestHandler handler = new RequestHandler();
		Data data1 = handler.requestData();
		Data data2 = handler.requestData();
		/**
		 * 这里我们可以做其他事情，而不是等待
		 */
		System.out.println("我在做其他事情");
		//Thread.sleep(3000);
		System.out.println(data1.obtainString());
		System.out.println(data2.obtainString());
	}
}
