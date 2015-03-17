package com.langsin.io.test2;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestConsole {

	/**
	 * 一次读取一行是最好，
	 * 当然我们可以通过判断\r\n来分析一行的结束，
	 * 曾经读到的东西放到StringBuffer中
	 * BufferedReader br readLine
	 * 
	 * 构建BufferedReader需要的是一个Reader	字符流
	 * 而System.in是一个Stream				字节流
	 * 转换流     将字节流转换为字符流
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
//		InputStream is = System.in;
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(isr);
//		
//		String s = null;
//		while(		(s = br.readLine())!= null ){
//			System.out.println("输入的内容为:"+s);
//		}
		
	
//		Scanner s = new Scanner(System.in);
//		String read = s.next();
//		System.out.println(read);
		Scanner s = new Scanner(System.in);
		String read = null;
		while( ( read=s.next())!=null ){
			System.out.println(read);
		}
	}
}

















