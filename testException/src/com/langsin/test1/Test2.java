package com.langsin.test1;

public class Test2 {

	/**
	 * 
	 * 测试  
	 * try{
	 * 
	 * }catch(异常类型    对象名){
	 * 
	 * }finally{
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
	public static void test1(){
		try{
			//执行代码的
			
			Class.forName("java.lang.Object");
			
			System.out.println(9/0);
			
			//String s = null;
			//System.out.println(s.length());
			
			
			
		}catch(ClassNotFoundException e){
			System.out.println("类没找着");
			
			
		}catch(ArithmeticException e){
			
			e.printStackTrace();
			
			//抓住异常的时候的处理代码
			System.out.println("算数错误");
			
			
			
			
		}catch(Exception e){
			System.out.println("其他异常");
		}finally{
			//无论如何都会执行的一段代码
			System.out.println("无论如何都执行的finally");
		}
		
		
	}
	
	public static int test2(){
		int i = 1;
		try{
			System.out.println(9/0);
			return ++i;
		}catch(Exception e){
			
			
			
			
			return ++i;
		}finally{
			return ++i;
		}
		
	}
	
	
	public static void main(String[] args) {
		test1();
//		int result = test2();
//		System.out.println(result);
		
		
	}
}
