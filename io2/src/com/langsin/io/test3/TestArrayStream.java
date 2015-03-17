package com.langsin.io.test3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * 内存流
 * 字节数组
 * @author Administrator
 *
 */
public class TestArrayStream {

	public static void main(String[] args) throws IOException {
		byte[] bs = {1,2,3,4,5,6,7,8,9};
		ByteArrayInputStream bais = new ByteArrayInputStream(bs);
		DataInputStream dis = new DataInputStream(bais);
		int v1 = dis.read();
		int v2 = dis.read();
		int v3 = dis.read();
		int v4 = dis.read();
		int result = (v1<<24)+(v2<<16)+(v3<<8)+v4;
		System.out.println(result);
		
		
//		ByteArrayOutputStream baos = new ByteArrayOutputStream();
//		baos.write(1);
//		baos.write(2);
//		baos.write(3);
//		baos.flush();
//		byte[] buffer = baos.toByteArray();
//		for (int i = 0; i < buffer.length; i++) {
//			System.out.println(buffer[i]);
//		}
		
		
	}
}
