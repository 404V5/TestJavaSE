package com.langsin.io.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	/**
	 * �ļ��Ŀ���
	 * @param src	Դ�ļ� Ҫ���������ļ�
	 * @param dest	����������ȥ
	 * @throws IOException 
	 */
	public static void copy(File src ,File dest) throws IOException{
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		int hasRead = 0;
		byte[] buffer = new byte[1024*1024*20];
		
		while(  (hasRead = fis.read(buffer))!=-1 ){
			fos.write(buffer,0,hasRead);
			fos.flush();
		}
	}
	
	public static void main(String[] args) throws IOException {
		long beginTime = System.currentTimeMillis();
		copy( new File("F:\\Oracle Database 10G.rar"),new File("c:\\oracle.rar"));
		long endTime = System.currentTimeMillis();
		long result = endTime - beginTime;
		System.out.println(result);
	}
	
	
}
