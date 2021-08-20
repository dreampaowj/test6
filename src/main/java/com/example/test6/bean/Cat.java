package com.example.test6.bean;

public class Cat {
	private String name;
	private int age;
	
	public Cat() {}
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return this.getName() + " " + this.getAge();
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
}