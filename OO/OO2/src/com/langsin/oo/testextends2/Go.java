package com.langsin.oo.testextends2;

public class Go {

	
	public void test2(Object o){
		
	}
	public void test(Bird b){
		
		b.eat();
		b.fly();
		//������������    �������֣���Ҫ�ܹ��������Է���
		if(b instanceof Eagle  ){
			Eagle e = (Eagle) b;
			e.kill();
		}
	
		if(b instanceof Pallot){
			Pallot p = (Pallot) b;
			p.say();
		}
	}
	
	
	public static void main(String[] args) {
		Go g = new Go();
		g.test2(new String());
		
		
		
		//Bird b = new Eagle();
//		Eagle e = new Eagle();
//		Bird  b = e;
//		
//		Eagle ee = (Eagle) b;
//		
//		Pallot p = (Pallot) b;
		
		
//		Eagle e = new Eagle();
//		e.eat();//��ӡ��ӥ����
		
		
//		Bird b = new Eagle();
//		b.eat();//��ӡ��ӥ����
	
//		Bird b = new Bird();
//		b.eat();//���ڳ�
		
		
//		Eagle e = new Eagle();
//		e.eat();
//		e.fly();
//		e.kill();
		
//		Bird b = new Eagle();
//		b.eat();
//		b.fly();
//		//b.kill();
//		Eagle e = (Eagle) b ;
//		e.kill();
	
	}
}
