package com.langsin.thread.testz;
/**
 * 返回Data对象  类似蛋糕店的老板
 * @author 王海宁
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
