package com.syntax.review11;

public class World {
	public static void main(String[] args) {
//		Human person1 = new Human("Andrei");
//		Human person2 = new Human("Salim", 25, 150);

		System.out.println("---America---");
		Human person3 = new American("John", 42, 250, "111-22-333");
		person3.talk();

		American americanPerson = (American) person3;
		americanPerson.taxReturns();

		American americanPerson2 = new American("James", 32, 250, "123-45-6789");
		// up-casting is done automatically
		Human obj1 = americanPerson2;
		// down-casting is done explicitly
		American americanPerson3 = (American) obj1;

		System.out.println("---Albania---");
		Human person4 = new Albanian();
		person4.talk();

		Human person5 = new Albanian("Klotilda", 20, 120, "BR345678");
		person5.talk();

		Albanian albanianPerson = (Albanian) person5;
		albanianPerson.albanianDance();

		System.out.println();
		System.out.println("The world ended!!!");
	}

}
