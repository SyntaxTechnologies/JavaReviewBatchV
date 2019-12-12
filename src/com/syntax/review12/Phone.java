package com.syntax.review12;

public class Phone {
	private String serialNumber;
	String color;

	public String getSerialNumber(String password) {
		String result = "";
		if (password.equals("123456")) {
			result = serialNumber;
		} else {
			result = "Access denied!";
		}
		return result;
	}

	public Phone(String serialNr) {
		this.serialNumber = serialNr;
	}

	public void sendText(String number, String text) {
		System.out.println("Sending: " + text + " to " + number);
	}

	public void call(String number) {
		System.out.println("Calling: " + number);
	}

	public void displayInfo() {
		System.out.println("I am a " + color + " phone. Serial Number is: " + serialNumber);
	}

}
