package com.syntax.review5;

public class ReverseArray {
	public static void main(String[] args) {
//The last index of the array is one less than the length!!!

//		String[] animals = { "dog", "cat", "mouse", "bird", "donkey", "horse" };
		String[] animals = { "dog", "cat", "bird" };

		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println("---Reverse---");
		for (int i = animals.length - 1; i >= 0; i--) {
			System.out.println(animals[i]);
		}
	}
}
