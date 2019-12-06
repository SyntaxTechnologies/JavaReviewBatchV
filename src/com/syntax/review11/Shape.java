package com.syntax.review11;

public abstract class Shape {
	final double pi = 3.14;
	String color;

	public Shape(String color) {
		this.color = color;
	}

	public abstract double calculateArea(); // unimplemented
}
