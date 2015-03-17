package com.langsin.io.test3;

import java.io.Serializable;
import java.util.List;

/**
 * 一对多
 * @author Administrator
 *
 */
public class Teacher implements Serializable{

	private int id;			//老师的id
	private String name;		
	private List students;	//老师的学生们
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getStudents() {
		return students;
	}
	public void setStudents(List students) {
		this.students = students;
	}
	
	
}
