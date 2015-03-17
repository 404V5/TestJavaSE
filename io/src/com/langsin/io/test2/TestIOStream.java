package com.langsin.io.test2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.langsin.io.test1.User;

public class TestIOStream {

	public static void main(String[] args) throws IOException {
		write() ;
	}
	
	
	/**
	 * read()方法，一个字节一个字节的  读取流中的数据
	 * read(byte[] buffer)
	 * @throws IOException
	 */
	public static void read() throws IOException{
		//建立FileInputStream对象  相当于搭建管道
		FileInputStream fis = new FileInputStream("c:\\3.txt");
//		int result = 0;
//		while( ( result = fis.read() ) != -1){
//			System.out.print((char)result);
//		}
		
		byte[] buffer = new byte[1024];		//定义一个缓冲区
		int hasRead =  0;					//实际读了多少
		while(      (hasRead = fis.read(buffer) )!=-1   ){
			String s = new String(buffer);
			String s1 = new String(buffer,0,hasRead);
			System.out.println(s1);
		}
		fis.close();
	}
	
	public static void write() throws IOException{
		
		FileOutputStream fos = new FileOutputStream("c:\\2.txt");
		String s = "庄生晓梦迷蝴蝶,望帝春心托杜鹃";
		byte[] bs = s.getBytes();
		fos.write(bs);
		fos.flush();		//刷新
		fos.close();
		
	}
	
	
	public static void write2(){
		FileOutputStream fos = null;
		try{
		fos = new FileOutputStream("c:\\2.txt");
		String s = "庄生晓梦迷蝴蝶,望帝春心托杜鹃";
		byte[] bs = s.getBytes();
		fos.write(bs);
		fos.flush();
		}catch(IOException e){
			//记录日志
			e.printStackTrace();
		}finally{
			try {
				fos.close();	//这个代码一定写到finally里面
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}











