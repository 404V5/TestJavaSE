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
	 * read()������һ���ֽ�һ���ֽڵ�  ��ȡ���е�����
	 * read(byte[] buffer)
	 * @throws IOException
	 */
	public static void read() throws IOException{
		//����FileInputStream����  �൱�ڴ�ܵ�
		FileInputStream fis = new FileInputStream("c:\\3.txt");
//		int result = 0;
//		while( ( result = fis.read() ) != -1){
//			System.out.print((char)result);
//		}
		
		byte[] buffer = new byte[1024];		//����һ��������
		int hasRead =  0;					//ʵ�ʶ��˶���
		while(      (hasRead = fis.read(buffer) )!=-1   ){
			String s = new String(buffer);
			String s1 = new String(buffer,0,hasRead);
			System.out.println(s1);
		}
		fis.close();
	}
	
	public static void write() throws IOException{
		
		FileOutputStream fos = new FileOutputStream("c:\\2.txt");
		String s = "ׯ�������Ժ���,���۴����жž�";
		byte[] bs = s.getBytes();
		fos.write(bs);
		fos.flush();		//ˢ��
		fos.close();
		
	}
	
	
	public static void write2(){
		FileOutputStream fos = null;
		try{
		fos = new FileOutputStream("c:\\2.txt");
		String s = "ׯ�������Ժ���,���۴����жž�";
		byte[] bs = s.getBytes();
		fos.write(bs);
		fos.flush();
		}catch(IOException e){
			//��¼��־
			e.printStackTrace();
		}finally{
			try {
				fos.close();	//�������һ��д��finally����
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}











