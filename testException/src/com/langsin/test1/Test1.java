package com.langsin.test1;

import java.io.IOException;

public class Test1 {
	
	
	
	public static void test1() throws IOException,ClassNotFoundException{
		Class.forName("java.lang.Object1");
	}
	
	public static void test2() throws  IOException,ClassNotFoundException{
			test1();
	
	}
	
	
	public static void test3(){
		try {
			test2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) throws Exception{
			test1();
		
		
			
			
			
		/**
		 * ����Ĵ���Ϊʲô����
		 * ��ΪClass����� ��һ����̬������forName�����������Դ�������£�
		 * public static Class<?> forName(String className) 
                throws ClassNotFoundException {
        		return forName0(className, true, ClassLoader.getCallerClassLoader());
    		}
		 * �������throws��һ��ClassNotFoundException
		 * 
		 * ֻҪһ������   throws��һ������쳣������Ҫ��������ʱ�򣬱����˹���Ԥ
		 */
		//Class.forName("java.util.ArrayList");
		
	}
}

