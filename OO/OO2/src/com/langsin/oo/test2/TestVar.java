package com.langsin.oo.test2;

/**
 * 全局变量   成员变量   类的属性
 * 1.   全局变量   局部变量  发生冲突 ，局部覆盖全局
 * 2.   全局变量可以不用赋初始值，它会有一个默认值
 * 3.   局部变量 也可以不用赋初始值，编译会通过，但是一旦使用
 * 则会报错。
 * 4.   变量的作用域    就是   开始于上一个{  结束语 下一个}
 * 生命周期
 * 
 * @author Administrator
 *
 */
public class TestVar {

	public int i = 10;
	public int b;
	public double d;
	public float f;
	public boolean flag;
	public char c;
	public void f1(){
		int  aa = 10;
		System.out.println(aa);
//		int i = 20;
//		System.out.println(d);
//		System.out.println(c);
//		System.out.println(flag);
		
		
	}
	public void f2(){
	
//		if(3==3){
//			int aa = 3;
//		}
//		System.out.println(aa);
	}
	public static void main(String[] args) {
		TestVar t = new TestVar();
		t.f1();
	}
}
