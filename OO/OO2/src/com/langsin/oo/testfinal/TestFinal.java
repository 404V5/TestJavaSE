package com.langsin.oo.testfinal;

/**
 * ����final���η�
 * 1. final������	����಻�ܱ��̳�
 * 2. final���η���	����������ܱ�����
 * 3. final���α���	���������ֵ���ܷ����仯
 * 		��final����ȫ�ֱ�����ʱ������������뱻��ʼ��
 * 		��ʼ���ķ���������
 * 				1. ֱ��ָ��ֵ
 * 				2. �ڹ��췽����������ָ��ֵ
 * 			final ���ξֲ�������ʱ������������ó�ʼ����Ҳ��
 * 			����
 * 	   	1. ������������
 * 			����������Ͳ��ܷ����仯
 * 		final int i = 3;
 * 		i = 5;		�򱨴�
 * 		2. ������������
 * 			��final���εĳ����������� ������ʲô���ܸı䣿����
 * 			�����ò��ܷ����ı䣬�����õ�ֵ  �ǿ��������ĵġ�
 * 
 * 
 * һ���ڲ���  Ҫʹ�� �ⲿ��ı�������ô����ⲿ��ı���һ����  final���͵ġ�
 * 			
 * @author Administrator
 *
 */
public class TestFinal {

	public final void f1(){
		System.out.println("f1");
	}
	
	
	final public  int i = 3;
	public final int b;

	public final User user =  new User(1,"����","123");
	
	public TestFinal(){
		b = 3;
	}
	public void f2(){
		
//		user.setId(2);
//		user.setUsername("����");
//		user.setPassword("567");
//		
//		System.out.println(user.getId());
//		System.out.println(user.getUsername());
//		System.out.println(user.getPassword());
		
		
		User u2 = new User(3,"aaa","bbb");
		
//		user = u2;//���÷����ı䣬���ǻᱨ�� 
		
		
		
		//i = 5;
		//b = 3;
		
//		final int c = 3;
//		final int d;
		
		
	}
	
	
	public static void main(String[] args) {
		TestFinal tf = new TestFinal();
		tf.f2();
	}
	
	
}












