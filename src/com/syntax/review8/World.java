package com.syntax.review8;

public class World {
	public static void main(String[] args) {		
		
		Baby baby1 = new Baby();

		baby1.cry();

		baby1.firstName = "John";
		baby1.lastName = "Doe";
		baby1.gender = 'M';
		baby1.hairColor = "Yellow";
		baby1.weight = 7;

		System.out.println(baby1.firstName);

		System.out.println(baby1.gender);

		baby1.walk(3);

		System.out.println("Done with baby one");

		Baby baby2 = new Baby();
		baby2.cry();

		baby2.firstName = "Ann";
		baby2.lastName = "Smith";
		baby2.hairColor = "Black";
		baby2.gender = 'F';
		baby2.weight = 6;

		baby2.cry();

		baby2.talk();
		System.out.println("Full name of baby 2 " + baby2.firstName + " " + baby2.lastName);
		baby2.walk(2);

		System.out.println("-----------------");
		baby1.displayBabyInfo();
		baby2.displayBabyInfo();
	}
}
