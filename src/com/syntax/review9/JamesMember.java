package com.syntax.review9;

public class JamesMember {
	static String lastName;
	static int count;
	// HW: Do the family income for James family

	String firstName;
	char gender;
	int salary;

	public void increment() {
		count++;
	}

	public void memberInfo() {
		System.out.println(firstName + " " + lastName + " makes $" + salary + " monthly");
	}
}
