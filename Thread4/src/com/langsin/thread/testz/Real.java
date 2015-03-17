package com.langsin.thread.testz;

import java.util.Random;

/**
 * 类似于产品  实际数据  蛋糕
 * @author 王海宁
 */
public class Real implements Data {

	public Real(){
		Random r = new Random();
		try {
			int i = r.nextInt(10000);
			System.out.println(i);
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public String obtainString() {
		return "hello,langsin!";
	}

}
