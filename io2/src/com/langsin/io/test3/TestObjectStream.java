package com.langsin.io.test3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * 测试对象流
 * @author Administrator
 *
 */
public class TestObjectStream {
	
	public static void readObject() throws Exception{
		InputStream in = new FileInputStream("c:\\obj.txt");
		ObjectInputStream ois = new ObjectInputStream(in);
		Object o = ois.readObject();
		Book b = (Book) o;
		System.out.println(b.getId());
		System.out.println(b.getName());
		System.out.println(b.getAuthor());
		System.out.println(b.getPrice());
		
		Object o2 = ois.readObject();
		Book b2 = (Book) o2;
		System.out.println(b2.getId());
		System.out.println(b2.getName());
		System.out.println(b2.getAuthor());
		System.out.println(b2.getPrice());
		
	}
	
	public static void writeObject(Object obj) throws IOException{
		OutputStream out = new FileOutputStream("c:\\obj.txt",true);
		ObjectOutputStream oos = new ObjectOutputStream(out);
		oos.writeObject(obj);
		oos.flush();
		oos.close();
	}
	
	public static void main(String[] args) throws Exception {
		Book b = new Book();
		b.setId(1);
		b.setName("java编程思想");
		b.setAuthor("bruce");
		b.setPrice(101.00);
		writeObject(b);
		
		b = new Book();
		b.setId(2);
		b.setName("决战NGINX");
		b.setAuthor("aaa");
		b.setPrice(110);
		//writeObject(b); 
		readObject();
		
	}

}
