package com.langsin.socket.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 来一个客户端，就开一个线程。
 * 这个线程专门处理一个客户端，不影响服务器主线程去响应其他客户端
 * 
 * 这个类要处理的就是一个连接，所以它对  Socket是依赖关系
 * @author Administrator
 *
 */
public class ServerThread extends Thread{

	private Socket client;
	private InputStream is ;
	private OutputStream out;
	public ServerThread(Socket socket) {
		this.client = socket;
		init();
	}
	private void init() {
		// TODO Auto-generated method stub
		try {
			is = client.getInputStream();
			out=client.getOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while(true){
			String s = null;	//客户端发送过来的消息字符串
			try {
				s = readString(is);
				System.out.println("客户端发送的数据："+s);
				System.out.println("quit".equals(s));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if("quit".equals(s)){
				close();
				removeMe();
				break;
			}else{
				//System.out.println(s);
				
				s= "服务器广播消息："+s+"\r\n";
				broadMsg(s);
			}
		}
	}
	
	//不能迭代中删除
	private void removeMe() {
		// TODO Auto-generated method stub
		for( ServerThread st  :  MyServer.sts){
			if(st == this){
				MyServer.sts.remove(st);
			}
		}
	}
	/**
	 * 广播一条消息
	 * 消息来自于客户端
	 * 发送给所有客户端
	 */
	private void broadMsg(String msg){
		for( ServerThread st  :  MyServer.sts){
			try {
				st.sendMsg(msg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 将一条消息输出给当前客户端
	 * @param msg
	 * @throws IOException 
	 */
	private void sendMsg(String msg) throws IOException{
		if(!client.isClosed()){
			out.write(msg.getBytes());
			out.flush();
		}
		
	}
	
	private void close(){
		try {
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String readString(InputStream is) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String s = null;
		s = br.readLine();
		return s;
	}
}
