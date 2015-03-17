package com.langsin.io.test2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestIOReaderWriter {

	public static void main(String[] args) throws IOException {
		write2();
	}
	
	public static void write2() throws IOException{
		
		PrintWriter out = new PrintWriter("c:\\4.txt");
		out.println("hello,浪曦");
		out.println("nice to meet u");
		out.flush();
		
		
		
		System.out.println();
		
	}
	public static void read2() throws IOException{
		FileReader fr = new FileReader("c:\\3.txt");
		BufferedReader br = new BufferedReader(fr);//缓存的字符输入流
//		br.readLine();	//一次读一行
		String s = null;
		while((s=br.readLine())!=null){
			System.out.println(s);
		}
	}
	
	
	public static void read() throws IOException{
		FileReader fr = new FileReader("c:\\3.txt");
		char[] c = new char[32];
		int hasRead = 0;
		while(     ( hasRead = fr.read(c) )!=-1     ){
			String s = new String(c,0,hasRead);
			System.out.println(s);
		}
	}
	
	public static void write() throws IOException{
		String s = "庄生晓梦迷蝴蝶,望帝春心托杜鹃\r\n";
		FileWriter fw = new FileWriter("c:\\3.txt",true);
		fw.write(s);
		fw.flush();
		fw.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
