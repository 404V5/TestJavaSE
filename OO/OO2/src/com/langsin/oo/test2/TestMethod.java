package com.langsin.oo.test2;

public class TestMethod {

	
	
	/**
	 * 访问修饰符  返回值   方法名([形式参数列表]){
	 * 		[return]
	 * }
	 * 
	 * 方法调用
	 * 
	 * 1. 在同一个类中   一个类中的方法调用自己类中的另一个方法
	 * 直接调用。
	 */
	public void f1(){
		System.out.println("我是f1");
		f2(10);
	}
	
	public void f2(int a){
		f1();
	}
	
	public boolean test(){
		return true;
	}
	
	
	//方法的递归调用
	public void f3(){
		f3();
	}
	
	//计算n的阶乘  5!   5*4*3*2*1
	public int jiecheng(int n){
		if(n == 1){
			return 1;
		}
		return n*jiecheng(n-1);
	}
	
	/**
	 * 方法的重载       overload
	 * 方法名 相同   方法的形式参数  不同
	 * 1. 个数不同
	 * 2. 类型不同
	 * 3. 
	 * @param args
	 */
	
	public void t1(){
		System.out.println("我是t1");
	}
	
	public void t1(int i){
		System.out.println("我是有一个int类型参数的   t1");
	}
	
	public void t1(char i){
		System.out.println("我是一个有char     t1");
	}
	public void t1(int i ,char c){
		System.out.println("  int    char   t1");
	}
	public void t1(char c,int i){
		System.out.println(  "char   int  t1" );
	}
	
	
	
	
	public static void main(String[] args) {
		TestMethod t = new TestMethod();
//		t.t1('c');
//		int i = 5;
//		t.test6(i);
//		System.out.println(i);
//		String s = "langsin";
//		t.test7(s);
//		System.out.println(s);
		
//		Person p = new Person();
//		t.test8(p);
//		System.out.println(p.age);
//		System.out.println(p.name);
		
	//	System.out.println();
		
		
	}
	
	public void test8(Person p){
		p.name = "lisi";
		p.age = 100;
	}
	public void test7(String s){
		s = "abc";
	}
	
	public void test6(int n){
		n = 3;
	}
	
	
	
	
	
	
	
	
	
	
}
