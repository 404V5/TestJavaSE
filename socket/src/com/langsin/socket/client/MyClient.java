package com.langsin.socket.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	
	
	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("localhost",9999);
		System.out.println("���ӷ������ɹ�");
		InputStream is = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		ClientThread ct = new ClientThread(socket);
		ct.start();
		
		while(true){
			String c = readFromConsole();
			if("quit".equals(c)){
				ct.shutdown();
			}
			sendMsg(c, out);
		}
		
	
	}
	
	
	private static void sendMsg(String msg,OutputStream out) throws IOException{
		msg = msg+"\r\n";
		out.write(msg.getBytes());
		out.flush();
	}
	/**
	 * �ӿ���̨��ȡ
	 * @return
	 * @throws IOException 
	 */
	public static String readFromConsole() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String msg = null;
		msg = br.readLine();
		return msg;
	}
	
}
