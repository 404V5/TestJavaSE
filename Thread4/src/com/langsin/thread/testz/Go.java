package com.langsin.thread.testz;
/**
 * ����
 * @author ������
 */
public class Go {
	public static void main(String[] args) throws InterruptedException {
		RequestHandler handler = new RequestHandler();
		Data data1 = handler.requestData();
		Data data2 = handler.requestData();
		/**
		 * �������ǿ������������飬�����ǵȴ�
		 */
		System.out.println("��������������");
		//Thread.sleep(3000);
		System.out.println(data1.obtainString());
		System.out.println(data2.obtainString());
	}
}
