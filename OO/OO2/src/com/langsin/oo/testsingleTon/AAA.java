package com.langsin.oo.testsingleTon;



/**
 * ����ģʽ    SingleTon
 * һ����ֻ��һ������ʵ������
 * ����ģʽ������
 * ����ʽ		������ȥʵ�����Լ���˭���õ�ʱ������ʵ�����Լ�
 * ����ʽ		�����Ͱ��Լ�ʵ�����������ȴ����˵���
 * 
 * 1. ���캯��˽�л�
 * 2. �ṩһ�����������
 * 3. �ṩһ�������������õķ���
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













