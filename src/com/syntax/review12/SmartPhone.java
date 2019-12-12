package com.syntax.review12;

public class SmartPhone extends Phone implements Weather, Camera {

	public SmartPhone(String serialNr) {
		super(serialNr);
	}

	public SmartPhone(String serialNr, String color) {
		super(serialNr);
		super.color = color;
	}
	
	//polymorphism
	@Override
	public void displayInfo() {
		System.out.println("I am a " + color + " smart phone!");
	}

	@Override
	public void showWeather() {
		System.out.println("Showing the weather...");
	}

	@Override
	public void takePicture() {
		System.out.println("Taking a high quality picture...");
	}

	@Override
	public void recordVideo() {
		System.out.println("Recording a video...");
	}

}
