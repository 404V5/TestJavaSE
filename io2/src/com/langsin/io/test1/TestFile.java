package com.langsin.io.test1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFile {
	
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\mingling");
		
		
		
		
		File[] roots = File.listRoots();
		for (int i = 0; i < roots.length; i++) {
			System.out.println(roots[i]);
		}
//		if(file.isDirectory()){
//			String[] names = file.list();
//			for (int i = 0; i < names.length; i++) {
//				File f = new File(names[i]);
//				if(f.isFile()){
//					System.out.println("����һ���ļ�:"+file.getName());
//				}else if(f.isDirectory()){
//					String[] names2 = f.list();
//					for (int j = 0; j < names2.length; j++) {
//						File f2 = new File(names[j]);
//						if(f2.isFile()){
//							System.out.println("����һ���ļ�:"+file.getName());
//						}else if(f2.isDirectory()){
//							
//						}
//					}
//				}
//			}
//		}
		
		
		
		
		
		//���file�������ļ�  ������ �򴴽�
//		if(!file.exists()){
//			file.createNewFile();
//		}
//		System.out.println(file.canRead());
//		System.out.println(file.canWrite());
//		System.out.println(file.isHidden());
//		
//		System.out.println(file.canExecute());	//�Ƿ����ִ��
//		System.out.println(file.getParent());
//		//file.delete();
//		
//		System.out.println(file.getPath());
//		System.out.println("�Ƿ���һ���ļ�:"+file.isFile());
//		System.out.println("�Ƿ���һ��Ŀ¼:"+file.isDirectory());
//		System.out.println("�޸�ʱ�䣺"+file.lastModified());
//		Date date = new Date(file.lastModified());
//		
//		//2012��9��22��, 15:32:52
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��, HH:mm:ss");
//		String time = sdf.format(date);
//		System.out.println(time);
//		
//		System.out.println("�ļ���С��"+file.length());
		
		
		
		
		
		
	}

}
