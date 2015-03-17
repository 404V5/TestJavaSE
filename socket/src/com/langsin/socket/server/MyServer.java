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
		System.out.println("服务器启动成功，监听端口号  9999...");
		while(true){
			//这个方法是阻塞方法
			Socket client = server.accept();
			System.out.println("有客户端的链接...");
			InputStream is = client.getInputStream();
			OutputStream out = client.getOutputStream();
			String welcomeMsg = "你好，欢迎测试服务器\r\n";
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
	 * 在输入流中读取字符串
	 * 以\r\n为结尾就是一个完整字符串
	 * 只有inputstream 
	 * 1	 将inputstream 包装成  BufferedReader
	 * 2.   \r\n  放到一个stringbuffer，
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











