package com.langsin.oo.test3;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//���ȫ����  ��ļ�����
		Class c = Class.forName("com.langsin.oo.test3.TestStatic");
		Object o = c.newInstance();
		TestStatic ts = (TestStatic) o;
	//	TestStatic t = new TestStatic();
//		int i = Integer.parseInt("123");
//		System.out.println(i);
	}
}
