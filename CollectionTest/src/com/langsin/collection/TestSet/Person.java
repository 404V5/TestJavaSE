package com.langsin.collection.TestSet;

public class Person implements Comparable{
	private int id;
	private String name;
	private int age;
	public Person(){}
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(!(o instanceof Person)){
			throw new RuntimeException("不是一个对象");
		}
		
		Person other = (Person) o;
		if(this.age > other.getAge()){
			return 1;
		}else if(this.age < other.getAge()){
			return -1;
		}else{
		return 0;
		}
	}
	
	
	

}
