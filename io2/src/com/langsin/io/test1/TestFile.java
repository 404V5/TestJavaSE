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
//					System.out.println("这是一个文件:"+file.getName());
//				}else if(f.isDirectory()){
//					String[] names2 = f.list();
//					for (int j = 0; j < names2.length; j++) {
//						File f2 = new File(names[j]);
//						if(f2.isFile()){
//							System.out.println("这是一个文件:"+file.getName());
//						}else if(f2.isDirectory()){
//							
//						}
//					}
//				}
//			}
//		}
		
		
		
		
		
		//如果file描述的文件  不存在 则创建
//		if(!file.exists()){
//			file.createNewFile();
//		}
//		System.out.println(file.canRead());
//		System.out.println(file.canWrite());
//		System.out.println(file.isHidden());
//		
//		System.out.println(file.canExecute());	//是否可以执行
//		System.out.println(file.getParent());
//		//file.delete();
//		
//		System.out.println(file.getPath());
//		System.out.println("是否是一个文件:"+file.isFile());
//		System.out.println("是否是一个目录:"+file.isDirectory());
//		System.out.println("修改时间："+file.lastModified());
//		Date date = new Date(file.lastModified());
//		
//		//2012年9月22日, 15:32:52
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日, HH:mm:ss");
//		String time = sdf.format(date);
//		System.out.println(time);
//		
//		System.out.println("文件大小："+file.length());
		
		
		
		
		
		
	}

}
