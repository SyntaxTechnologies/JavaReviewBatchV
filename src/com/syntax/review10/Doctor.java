package com.syntax.review10;

public class Doctor {
	public String name;
	public String specialty;
	public int licenceId;
	public String address;
	public String dayOff;
	
//	public Doctor(int a, String b, String c) {
//	
//	}

	public Doctor(String name, String specialty, int licenceId) {
		this.name = name;
		this.specialty = specialty;
		this.licenceId = licenceId;
	}

	public Doctor(String name, String specialty, int licenceId, String address, String dayOff) {
		this(name, specialty, licenceId);
		this.address = address;
		this.dayOff = dayOff;
		this.chargePatient();
	}

	public void checkUp(String name) {
		System.out.println("Doctor " + this.name + " has ordered blood test for " + name);
	}

	public void treatPatient() {
		System.out.println("Gives a prescription.");
	}

	public void chargePatient() {
		System.out.println("Gets $100.");
	}

	public void displayInfo() {
		System.out.println("Doctor " + this.name + " with license id: " + licenceId + " is a " + specialty);
	}
}
