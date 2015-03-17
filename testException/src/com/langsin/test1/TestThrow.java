package com.langsin.test1;

public class TestThrow {

	public static void main(String[] args) {
		div(3,0);
	}
	
	
	
	public void showScore(int score){
//		try{
//			if(score>=90){
//				throw new MyRuntimeException();
//			}else if(){
//				
//			}
//		}catch(MyRuntimeException e){
//			System.out.println("优秀");
//		}cat
	}
	
	
	
	public static void f1(){
		//这是人工扔出去的异常
		throw new RuntimeException("测试异常");
	}
	
	public void login(String username,String password){
		
	}
	
	public static void div(int a, int b){
		if(b == 0){
			throw new MyRuntimeException("除数不能为0");
		}else{
			System.out.println(a/b);
		}
	}
}
