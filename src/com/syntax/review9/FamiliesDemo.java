package com.syntax.review9;

public class FamiliesDemo {

	public static void main(String[] args) {

		SmithMember member1 = new SmithMember();
		member1.increment();
		member1.firstName = "John";
		SmithMember.lastName = "Smith";
		member1.gender = 'M';
		member1.salary = 5000;
		SmithMember.addIncome(member1.salary);

		member1.memberInfo();

		SmithMember member2 = new SmithMember();
		member2.increment();
		member2.firstName = "Jane";
//		member2.lastName = "Smith";
		member2.gender = 'F';
		member2.salary = 6000;
		SmithMember.addIncome(member2.salary);

		member2.memberInfo();

		System.out.println("There are " + member2.count + " members.");

//		SmithMember.lastName = "Doe";
//		System.out.println("Lastname has changed to Doe.");

//		member1.memberInfo();
//		member2.memberInfo();

		System.out.println("Baby is born");
		SmithMember baby = new SmithMember();
		baby.increment();
		baby.firstName = "Adam";
		baby.gender = 'M';
		baby.salary = 500;
		System.out.println("There are " + SmithMember.count + " members in the " + SmithMember.lastName + " family.");
		baby.memberInfo();
		SmithMember.addIncome(baby.salary);

		System.out.println(SmithMember.lastName + " family's income is: " + SmithMember.familyIncome);

		System.out.println();
		System.out.println("Let's \"create\" James Family members!");
		System.out.println();

		JamesMember jMember1 = new JamesMember();
		jMember1.increment();
		jMember1.firstName = "Lebron";
		JamesMember.lastName = "James";
		jMember1.gender = 'M';
		jMember1.salary = 100000;

		JamesMember jMember2 = new JamesMember();
		jMember2.increment();
		jMember2.firstName = "Savannah";
		jMember2.gender = 'F';
		jMember2.salary = 200;

		jMember1.memberInfo();
		jMember2.memberInfo();

		System.out.println("There are " + JamesMember.count + " members in the " + JamesMember.lastName + " family.");

	}

}
