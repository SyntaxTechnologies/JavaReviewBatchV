package com.syntax.review11;

public abstract class Human {
	String name;
	int age;
	int weight;

	public Human() {
		// super();
		System.out.println("A human being is created.");
	}

	public Human(String name) {
		
		this(); // first statement

//		System.out.println("The name of that person is " + this.name);
		this.name = name; // second statement
		System.out.println("The name of that person is " + this.name);	
	}

	public Human(String name, int age, int weight) {
		this(name);
		this.age = age;
		this.weight = weight;
	}

	public abstract String greeting();

	public abstract void talk();

}
