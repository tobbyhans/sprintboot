package com.udemy.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {
	@NotNull
	@Size(min= 2, max=25)
	private String name;
	
	@NotNull
	@Min(18)
	private int age;

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

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// INICIALIZAR SIN DATOS CONTRUCTOR EN BLANCO
	public Person() {
	}
// generate to string para los logs
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
