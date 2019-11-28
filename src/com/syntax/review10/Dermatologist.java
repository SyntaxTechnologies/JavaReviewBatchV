package com.syntax.review10;

public class Dermatologist extends Doctor {
	
	public Dermatologist(String name, String specialty, int licenceId) {
//		super(); //Java implicitly calls/executes default constructor of the parent class.
		this.name = name;
		this.specialty = specialty;
		this.licenceId = licenceId;
	}
	
	@Override
	public void chargePatient() {
		System.out.println("Gets $250.");
	}
	
//	@Override
	public void checkUp(String name) {
		System.out.println("Doctor " + this.name + " has ordered alergy test for " + name);
	}
	
	public void applySkinTreatment() {
		System.out.println("Applies some kind of cream.");
	}

}
