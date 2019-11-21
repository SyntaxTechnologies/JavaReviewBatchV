package com.syntax.review9;

public class SmithMember {
	static String lastName;
	static int count;
	static int familyIncome;

	String firstName;
	char gender;
	int salary;	
	
	public static void addIncome(int memberIncome) {
		familyIncome += memberIncome;
	}

	public void increment() {
		count++;
	}
	
	public void memberInfo() {
		System.out.println(firstName + " " + lastName + " makes $" + salary + " monthly");
	}

}
