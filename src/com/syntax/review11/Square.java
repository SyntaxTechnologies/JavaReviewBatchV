package com.syntax.review11;

public class Square extends Shape2D {
	int side;

	public Square(int side, String color) {
		super(color);
		this.side = side;
	}

	@Override
	public double calculateArea() { // implemented
		return side * side;
	}

	@Override
	public double calculatePerimeter() {
		return 4 * side;
	}

}
