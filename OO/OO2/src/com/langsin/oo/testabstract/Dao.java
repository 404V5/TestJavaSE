package com.langsin.oo.testabstract;

public abstract class Dao {
	
	
	public  int i = 10;
	
	public Dao(){
		System.out.println("抽象类的构造方法");
	}

	public void save(){
		String sql = getLastIdSql();
		System.out.println(sql);
		System.out.println("抽象类的save方法");
	}
	
	public void update(){
		System.out.println("抽象类的update方法");
	}
	/**
	 * 定义了一个抽象方法
	 * 这个方法直接以分号结束，没有实现{}
	 * @return
	 */
	public abstract String getLastIdSql();
	public abstract String getTableName();
}
