package com.langsin.oo.testabstract;

public class Go {

	public static void main(String[] args) {
		Dao d = new JdbcDao();
		d.save();
		d.update();
	}
}
