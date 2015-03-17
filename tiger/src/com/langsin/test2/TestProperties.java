package com.langsin.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
//		p.put("0531", "济南");
//		p.put("0532", "青岛");
//		FileOutputStream out = new FileOutputStream("a.properties");
//		p.store(out ,"这是一个测试");
		
		FileInputStream fis = new FileInputStream("a.properties");
		p.load(fis);
		String s= (String) p.get("0531");
		System.out.println(s);
	}
}
