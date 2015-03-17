package com.langsin.collection.TestSet;

public class Manager {

	
	private int id;
	private String name;
	private int age;
	private double sal;
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
	public Manager(int id, String name, int age, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
}
