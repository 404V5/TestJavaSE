package com.langsin.oo.testabstract;

public abstract class Dao {
	
	
	public  int i = 10;
	
	public Dao(){
		System.out.println("������Ĺ��췽��");
	}

	public void save(){
		String sql = getLastIdSql();
		System.out.println(sql);
		System.out.println("�������save����");
	}
	
	public void update(){
		System.out.println("�������update����");
	}
	/**
	 * ������һ�����󷽷�
	 * �������ֱ���ԷֺŽ�����û��ʵ��{}
	 * @return
	 */
	public abstract String getLastIdSql();
	public abstract String getTableName();
}
