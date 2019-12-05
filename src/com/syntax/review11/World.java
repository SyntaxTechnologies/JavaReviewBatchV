package com.syntax.review11;

public class World {
	public static void main(String[] args) {
		Human person1 = new Human("Andrei");
		Human person2 = new Human("Salim", 25, 150);
		
		System.out.println("---America---");
		Human person3 = new American("John", 42, 250, "111-22-333");
		
		System.out.println("---Albania---");
		Human person4 = new Albanian();
		
		System.out.println();
		System.out.println("The world ended!!!");
	}

}
