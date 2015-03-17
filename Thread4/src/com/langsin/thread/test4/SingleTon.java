package com.langsin.thread.test4;

public class SingleTon {

	private SingleTon(){}
	
	private static SingleTon instance = null;
	
	public static SingleTon getInstance(){
		synchronized (SingleTon.class) {
			if(instance == null){
				instance = new SingleTon();
			}
		}
		return instance;
	}
	
}
