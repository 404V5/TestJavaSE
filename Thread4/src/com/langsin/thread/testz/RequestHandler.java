package com.langsin.thread.testz;
/**
 * ����Data����  ���Ƶ������ϰ�
 * @author ������
 *
 */
public class RequestHandler {
	public Data requestData() {
		final Future future = new Future();
		new Thread(){
			public void run() {
				Real real = new Real();
				future.setReal(real);
			}
		}.start();
		return future;
	}
}
