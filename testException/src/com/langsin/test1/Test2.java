package com.langsin.test1;

public class Test2 {

	/**
	 * 
	 * ����  
	 * try{
	 * 
	 * }catch(�쳣����    ������){
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
			//ִ�д����
			
			Class.forName("java.lang.Object");
			
			System.out.println(9/0);
			
			//String s = null;
			//System.out.println(s.length());
			
			
			
		}catch(ClassNotFoundException e){
			System.out.println("��û����");
			
			
		}catch(ArithmeticException e){
			
			e.printStackTrace();
			
			//ץס�쳣��ʱ��Ĵ������
			System.out.println("��������");
			
			
			
			
		}catch(Exception e){
			System.out.println("�����쳣");
		}finally{
			//������ζ���ִ�е�һ�δ���
			System.out.println("������ζ�ִ�е�finally");
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
