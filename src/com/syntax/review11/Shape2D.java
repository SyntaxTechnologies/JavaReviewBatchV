package com.syntax.review11;

public abstract class Shape2D {
	String color;

	public Shape2D(String color) {
		this.color = color;
	}

	public abstract double calculateArea(); // unimplemented

	public abstract double calculatePerimeter(); // unimplemented

}
