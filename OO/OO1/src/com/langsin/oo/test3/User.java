package com.langsin.oo.test3;

public class User {

	/**
	 * 没有参数的构造方法，也是默认的。
	 */
//	public User(){
//		System.out.println("User 被创建");
//	}
	
	public User(){
		System.out.println("构造方法执行");
	}
	
	{
		System.out.println("代码块执行");
	}
	
	
	
	private int id;
	private String name;
	private String password;
	private String email;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
