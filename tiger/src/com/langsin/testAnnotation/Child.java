package com.langsin.testAnnotation;

import java.util.Date;

/**
 * @Deprecated
 * ���ע��   ����������
 * 1. �����ˣ��и��õķ�������
 * 2. �з��գ����Ƽ�ʹ��
 * @author Administrator
 *
 */

public class Child extends Father{
	@NeedCk(cc='a',name="lisi")
	public int i = 3;

	@NeedCk(cc='a',name="zhangsan")
	public void f1() {
		
	}
	@Deprecated
	public void f2(){
		
	}
	@SuppressWarnings("unused")
	@NeedCk(cc='a',name="lisi")
	public static void main(String[] args) {
		
		int i = 3;
		Child c = new Child();
		Date d = new Date();
		Thread t = new Thread();
	}
}
