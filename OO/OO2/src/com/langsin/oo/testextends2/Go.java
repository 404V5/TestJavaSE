package com.langsin.oo.testextends2;

public class Go {

	
	public void test2(Object o){
		
	}
	public void test(Bird b){
		
		b.eat();
		b.fly();
		//当传进来的是    具体物种，我要能够调用特性方法
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
//		e.eat();//打印老鹰吃肉
		
		
//		Bird b = new Eagle();
//		b.eat();//打印老鹰吃肉
	
//		Bird b = new Bird();
//		b.eat();//鸟在吃
		
		
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
