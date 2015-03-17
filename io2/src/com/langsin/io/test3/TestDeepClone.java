package com.langsin.io.test3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestDeepClone {

	
	public static Object clone(Object obj) throws Exception{
		FileOutputStream fos = new FileOutputStream("1.dat");
		ObjectOutputStream ous = new ObjectOutputStream(fos);
		ous.writeObject(obj);
		ous.flush();
		ous.close();
		
		
		FileInputStream fis = new FileInputStream("1.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object cloneObj = ois.readObject();
		ois.close();
		return cloneObj;
	}
	
	public static void main(String[] args) throws Exception {
		
		
		
		Teacher t1 = new Teacher();
		t1.setId(1);
		t1.setName("王");
		
		Student s = new Student();
		s.setId(1);
		s.setName("小马");
		s.setAge(18);
		s.setTeacher(t1);
		
		Student cloneS = (Student) clone(s);
		
		System.out.println(cloneS.getId());
		System.out.println(cloneS.getAge());
		System.out.println(cloneS.getName());
		
		Teacher cloneT = cloneS.getTeacher();
		System.out.println(cloneT.getId());
		System.out.println(cloneT.getName());
		cloneT.setId(2);
		cloneT.setName("张");
		System.out.println(cloneT.getId());
		System.out.println(cloneT.getName());
		
		
		Teacher oldT = s.getTeacher();
		System.out.println(oldT.getId());
		System.out.println(oldT.getName());
		
		
		
		
		
//		Student s2 = new Student();
//		s2.setId(2);
//		s2.setName("小孙");
//		s2.setAge(19);
//		s2.setTeacher(t1);
//		
//		List list = new ArrayList();
//		list.add(s);
//		list.add(s2);
//		t1.setStudents(list);
		
		
		
		
		
		
		
		
	}
}
