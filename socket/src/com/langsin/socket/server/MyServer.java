package com.langsin.socket.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyServer {

	public static List<ServerThread> sts = new CopyOnWriteArrayList<ServerThread>();
	
	
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9999);
		System.out.println("�����������ɹ��������˿ں�  9999...");
		while(true){
			//�����������������
			Socket client = server.accept();
			System.out.println("�пͻ��˵�����...");
			InputStream is = client.getInputStream();
			OutputStream out = client.getOutputStream();
			String welcomeMsg = "��ã���ӭ���Է�����\r\n";
			out.write(welcomeMsg.getBytes());
			out.flush();
			
			ServerThread st = new ServerThread(client);
			sts.add(st);
			st.start();
			
			
			
//			int hasRead = 0;
//			while( (hasRead = is.read())!=-1  ){
//				System.out.println((char)hasRead);
//			}
			
//			while(true){
//				String s = readString(is);
//				if("quit".equals(s)){
//					client.close();
//					break;
//				}else{
//				System.out.println(s);
//				}
//			}
			
		}
		
	
	}
	
	/**
	 * ���������ж�ȡ�ַ���
	 * ��\r\nΪ��β����һ�������ַ���
	 * ֻ��inputstream 
	 * 1	 ��inputstream ��װ��  BufferedReader
	 * 2.   \r\n  �ŵ�һ��stringbuffer��
	 * @return
	 * @throws IOException 
	 */
	public static String readString(InputStream is) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String s = null;
//		while( ( s = br.readLine() )!=null      ){
//			
//		}
		 s = br.readLine();
		return s;
	}
	
	public static String readString2(InputStream is ) throws Exception{
		StringBuilder sb = new StringBuilder();
		int hasRead = 0;
		while(    (hasRead=is.read())!=13    ){
			sb.append((char)hasRead);
		}
		return sb.toString();
	}
}











