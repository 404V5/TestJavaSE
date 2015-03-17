package com.langsin.socket.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * �첽���ܷ��������͹���������
 * @author Administrator
 *
 */
public class ClientThread extends Thread{
	
	private Socket socket;
	private InputStream is;
	private OutputStream out;
	private boolean go = true;
	
	public void shutdown(){
		go = false;
	}
	
	public ClientThread(Socket socket) {
		this.socket = socket;
		try {
			init();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private void init() throws IOException {
		// TODO Auto-generated method stub
		is = socket.getInputStream();
		out = socket.getOutputStream();
	}


	@Override
	public void run() {
		while(go){
			String msg = null;	//�������˷��͹�������Ϣ�ַ���
			try {
				msg = readString(is);
				
				System.out.println("�������˷��͹�������Ϣ��"+msg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	
	}
	/**
	 * �ӷ������˶�ȡ���������͵������ַ���
	 * @param is
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
}
