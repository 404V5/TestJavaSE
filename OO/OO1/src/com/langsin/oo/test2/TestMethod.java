package com.langsin.oo.test2;

public class TestMethod {

	
	
	/**
	 * �������η�  ����ֵ   ������([��ʽ�����б�]){
	 * 		[return]
	 * }
	 * 
	 * ��������
	 * 
	 * 1. ��ͬһ������   һ�����еķ��������Լ����е���һ������
	 * ֱ�ӵ��á�
	 */
	public void f1(){
		System.out.println("����f1");
		f2(10);
	}
	
	public void f2(int a){
		f1();
	}
	
	public boolean test(){
		return true;
	}
	
	
	//�����ĵݹ����
	public void f3(){
		f3();
	}
	
	//����n�Ľ׳�  5!   5*4*3*2*1
	public int jiecheng(int n){
		if(n == 1){
			return 1;
		}
		return n*jiecheng(n-1);
	}
	
	/**
	 * ����������       overload
	 * ������ ��ͬ   ��������ʽ����  ��ͬ
	 * 1. ������ͬ
	 * 2. ���Ͳ�ͬ
	 * 3. 
	 * @param args
	 */
	
	public void t1(){
		System.out.println("����t1");
	}
	
	public void t1(int i){
		System.out.println("������һ��int���Ͳ�����   t1");
	}
	
	public void t1(char i){
		System.out.println("����һ����char     t1");
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
