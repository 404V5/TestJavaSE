package com.langsin.thread.testz;

import java.util.Random;

/**
 * �����ڲ�Ʒ  ʵ������  ����
 * @author ������
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
