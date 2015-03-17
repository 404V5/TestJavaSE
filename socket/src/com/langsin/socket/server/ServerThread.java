package com.langsin.socket.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * ��һ���ͻ��ˣ��Ϳ�һ���̡߳�
 * ����߳�ר�Ŵ���һ���ͻ��ˣ���Ӱ����������߳�ȥ��Ӧ�����ͻ���
 * 
 * �����Ҫ����ľ���һ�����ӣ���������  Socket��������ϵ
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
			String s = null;	//�ͻ��˷��͹�������Ϣ�ַ���
			try {
				s = readString(is);
				System.out.println("�ͻ��˷��͵����ݣ�"+s);
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
				
				s= "�������㲥��Ϣ��"+s+"\r\n";
				broadMsg(s);
			}
		}
	}
	
	//���ܵ�����ɾ��
	private void removeMe() {
		// TODO Auto-generated method stub
		for( ServerThread st  :  MyServer.sts){
			if(st == this){
				MyServer.sts.remove(st);
			}
		}
	}
	/**
	 * �㲥һ����Ϣ
	 * ��Ϣ�����ڿͻ���
	 * ���͸����пͻ���
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
	 * ��һ����Ϣ�������ǰ�ͻ���
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
