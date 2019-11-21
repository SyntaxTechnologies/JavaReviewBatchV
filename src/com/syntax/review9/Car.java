package com.syntax.review9;

public class Car {
	String make;
	String color;

	public Car() {

	}
	
	public Car(String type) {
		make = type;
	}
	
	public Car(String type, String carColor) {
		make = type;
		color = carColor;
	}

	public void displayInfo() {
		System.out.println("This a car. Type is: " + make + ", color is: " + color);
	}
}
