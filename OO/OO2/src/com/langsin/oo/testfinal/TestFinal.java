package com.langsin.oo.testfinal;

/**
 * 测试final修饰符
 * 1. final修饰类	这个类不能被继承
 * 2. final修饰方法	这个方法不能被覆盖
 * 3. final修饰变量	这个变量的值不能发生变化
 * 		当final修饰全局变量的时候，这个变量必须被初始化
 * 		初始化的方法有两种
 * 				1. 直接指定值
 * 				2. 在构造方法或代码块中指定值
 * 			final 修饰局部变量的时候，这个变量不用初始化，也不
 * 			报错
 * 	   	1. 基本数据类型
 * 			代表这个类型不能发生变化
 * 		final int i = 3;
 * 		i = 5;		则报错
 * 		2. 抽象数据类型
 * 			被final修饰的抽象数据类型 ，，是什么不能改变？？？
 * 			是引用不能发生改变，而引用的值  是可以随便更改的。
 * 
 * 
 * 一个内部类  要使用 外部类的变量，那么这个外部类的变量一定是  final类型的。
 * 			
 * @author Administrator
 *
 */
public class TestFinal {

	public final void f1(){
		System.out.println("f1");
	}
	
	
	final public  int i = 3;
	public final int b;

	public final User user =  new User(1,"张三","123");
	
	public TestFinal(){
		b = 3;
	}
	public void f2(){
		
//		user.setId(2);
//		user.setUsername("李四");
//		user.setPassword("567");
//		
//		System.out.println(user.getId());
//		System.out.println(user.getUsername());
//		System.out.println(user.getPassword());
		
		
		User u2 = new User(3,"aaa","bbb");
		
//		user = u2;//引用发生改变，于是会报错。 
		
		
		
		//i = 5;
		//b = 3;
		
//		final int c = 3;
//		final int d;
		
		
	}
	
	
	public static void main(String[] args) {
		TestFinal tf = new TestFinal();
		tf.f2();
	}
	
	
}












