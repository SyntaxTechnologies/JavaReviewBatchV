package com.syntax.review11;

public class Cube extends Shape3D {
	int size;

	public Cube(int size, String color) {
		super(color);
		this.size = size;
		System.out.println("A " + this.color + " cube with size " + this.size + " is instantiated");
	}

	@Override
	public double calculateVolume() {
//		return size * size * size;
		return Math.pow(size, 3);
	}

	@Override
	public double calculateArea() {
		return 6 * size * size;
	}

}