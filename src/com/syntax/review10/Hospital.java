package com.syntax.review10;

public class Hospital {
	public static void main(String[] args) {
		Doctor d1 = new Doctor("John", "Family Doctor", 123456);
//		d1.name = "John";
//		d1.specialty = "Family Doctor";
//		d1.licenceId = 123456;
		
		d1.displayInfo();
		d1.checkUp("Adam");
		d1.chargePatient();
		
		System.out.println("---Doctor 2---");
		Doctor d2 = new Doctor("James", "Eye Doctor", 234567, "123 Main St.", "Sunday");
//		d2.chargePatient();
		d2.displayInfo();
	}
}
