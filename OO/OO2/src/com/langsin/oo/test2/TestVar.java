package com.langsin.oo.test2;

/**
 * ȫ�ֱ���   ��Ա����   �������
 * 1.   ȫ�ֱ���   �ֲ�����  ������ͻ ���ֲ�����ȫ��
 * 2.   ȫ�ֱ������Բ��ø���ʼֵ��������һ��Ĭ��ֵ
 * 3.   �ֲ����� Ҳ���Բ��ø���ʼֵ�������ͨ��������һ��ʹ��
 * ��ᱨ��
 * 4.   ������������    ����   ��ʼ����һ��{  ������ ��һ��}
 * ��������
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
