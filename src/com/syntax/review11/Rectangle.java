package com.syntax.review11;

public class Rectangle extends Shape2D{
	int width;
	int height;

	public Rectangle(int width, int height, String color) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public double calculateArea() {
		return width * height;
	}

	public double calculatePerimeter() {
		return 2 * (width + height);
	}

}
