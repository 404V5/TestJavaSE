package com.langsin.io.test2;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestConsole {

	/**
	 * һ�ζ�ȡһ������ã�
	 * ��Ȼ���ǿ���ͨ���ж�\r\n������һ�еĽ�����
	 * ���������Ķ����ŵ�StringBuffer��
	 * BufferedReader br readLine
	 * 
	 * ����BufferedReader��Ҫ����һ��Reader	�ַ���
	 * ��System.in��һ��Stream				�ֽ���
	 * ת����     ���ֽ���ת��Ϊ�ַ���
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
//			System.out.println("���������Ϊ:"+s);
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

















