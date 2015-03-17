package com.langsin.oo.test2;

public class Test {

	public static void main(String[] args) throws Exception {
		//要想调用一个类的（非static）方法，首先生成这个类的对象
		//然后，对象名.方法名
		//这句话并不严谨
		
		
		/**
		 * 生成一个类的对象    怎么弄？
		 * 类名  对象名  = new  类名();
		 * 
		 * 类的加载			（就是将类   加载到内存）
		 * 类的实例化		(就是将类   对象  创建出来)
		 * 
		 * 
		 */
		
//		int a = 3;
//		int b = 3;
//		System.out.println(a == b);
//		Book b = new Book();
//		Book b1 = new Book();
//		
//		
//		System.out.println(b == b1);
//		
//		int result = b.add(8, 10);
//		System.out.println(result);
		
		
		
		/**
		 * Book b = new Book(); 这种行为  是 将类的装载和类的实例化  合二为一
		 * 我们可以使用代码将这两个步骤分开
		 * 1. 先加载
		 * 2. 再实例化
		 */
		
		
//		Class c = Class.forName("com.langsin.oo.test2.Book");	//将Book这个类 加载到内存中
//		
//		Book b = (Book)c.newInstance();		//产生这个Book类的对象
//		
//		int result = b.add(3, 10);
//		
//		System.out.println(result);
		
		
		
		
	//	System.out.println(Integer.MAX_VALUE);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
