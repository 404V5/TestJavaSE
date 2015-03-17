package com.langsin.io.test3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class TestDataStream {

	/**
	 * ��װ��
	 * ����  inputstream  outputstream ���а�װ  �ṩ����Ĺ���
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//����һ�������   ָ��1.txt
		OutputStream out = new FileOutputStream("c:\\1.txt");
		//�����洴������������а�װ����װ��������
		DataOutputStream dous = new DataOutputStream(out);
		
		byte[] s = "�й�".getBytes();
		dous.writeBytes("�й�");
		dous.writeByte(300);		//0000 0001    01
		dous.writeShort(2);		//0000 0000 0000 0002	00 02
		dous.writeInt(3);		//						00 00 00 03		
		dous.writeLong(4);
		dous.writeBoolean(false);
		dous.writeDouble(3.14);
		dous.writeFloat(3.14f);
		dous.writeChar('a');
		dous.writeChars("abc");
		dous.flush();
		dous.close();
		
		
//		InputStream in = new FileInputStream("c:\\1.txt");
//		DataInputStream dins = new DataInputStream(in);
//		
//		System.out.println(dins.readInt());
		
		
//		byte b = dins.readByte();
//		System.out.println(b);
//		short s = dins.readShort();
//		System.out.println(s);
	//	readCommon();
		
		
//		writeCommon();
//		InputStream in = new FileInputStream("c:\\2.txt");
//		DataInputStream dins = new DataInputStream(in);
//		
//		System.out.println(dins.readByte());
//		System.out.println(dins.readShort());
//		System.out.println(dins.readInt());
//		
//		System.out.println(2>>>8);
	}
	
	public static void readCommon() throws Exception{
		FileInputStream fis = new FileInputStream("c:\\1.txt");
		
		int result = fis.read();
		result = fis.read();
		result = fis.read();
		result = fis.read();
		result = fis.read();
		result = fis.read();
		result = fis.read();
		System.out.println(result);
	}
	
	public static void writeCommon() throws Exception{
		FileOutputStream fos = new FileOutputStream("c:\\2.txt");
		fos.write(1);	//���writeByte
		//���writeShort(2);
		fos.write((20000 >>> 8) & 0xFF);
		fos.write((20000 >>> 0) & 0xFF);
		//���writeInt(3);
		fos.write((3 >>> 24) & 0xFF);
		fos.write((3 >>> 16) & 0xFF);
		fos.write((3 >>> 8) & 0xFF);
		fos.write((3 >>> 0) & 0xFF);
		
		fos.flush();
		fos.close();
	}
	
	
	
	
}
