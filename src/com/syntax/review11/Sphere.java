package com.syntax.review11;

public class Sphere extends Shape3D {
	int radius;

	public Sphere(int radius, String color) {
		super(color);
		this.radius = radius;
		System.out.println("A " + this.color + " sphere with radius " + this.radius + " is instantiated");
	}

	@Override
	public double calculateVolume() {
//		return (4 / 3) * pi * radius * radius * radius;
		return (4 / 3) * pi * Math.pow(radius, 3);
	}

	@Override
	public double calculateArea() {
		return 4 * pi * radius * radius;
	}

}