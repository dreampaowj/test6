package com.example.test6.bean;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor(staticName = "create")
public class Dog {
	private final String name;
	private final int age;
	
	public static void main(String[] args) {
		Dog dog = Dog.create("tom", 20);
		System.out.println(dog.getName() + " " + dog.getAge());
	}
}
