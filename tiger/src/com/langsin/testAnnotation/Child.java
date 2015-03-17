package com.langsin.testAnnotation;

import java.util.Date;

/**
 * @Deprecated
 * 这个注解   有两个含义
 * 1. 过期了，有更好的方法代替
 * 2. 有风险，不推荐使用
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
