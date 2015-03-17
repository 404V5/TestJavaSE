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
		 * 下面的代码为什么报错？
		 * 因为Class这个类 有一个静态方法，forName，这个方法的源代码如下：
		 * public static Class<?> forName(String className) 
                throws ClassNotFoundException {
        		return forName0(className, true, ClassLoader.getCallerClassLoader());
    		}
		 * 这个方法throws了一个ClassNotFoundException
		 * 
		 * 只要一个方法   throws了一个检查异常，我们要调用它的时候，必须人工干预
		 */
		//Class.forName("java.util.ArrayList");
		
	}
}

