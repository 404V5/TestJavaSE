package com.langsin.oo.testsingleTon;



/**
 * 单例模式    SingleTon
 * 一个类只有一个对象实例出现
 * 单例模式有两种
 * 懒汉式		上来不去实例化自己，谁来用的时候，我在实例化自己
 * 饿汉式		上来就把自己实例化出来，等待别人调用
 * 
 * 1. 构造函数私有化
 * 2. 提供一个自身的引用
 * 3. 提供一个返回自身引用的方法
 * 
 * 
 * 
 * @author Administrator
 *
 */
public class AAA {

	
	private static AAA a ;
	
	public synchronized static AAA getInstance(){
		if(a == null){
			a = new AAA();
		}
		return a;
	}
	private AAA(){
		
	}
	
	
}













