package com.syntax.review5;

public class Pyramid {
	public static void main(String[] args) {
		// funny way
//		System.out.println("1");
//		System.out.println("12");
//		System.out.println("123");
//		System.out.println("1234");
//		System.out.println("12345");
//		System.out.println("--------------");

		// serious way
		for (int row = 1; row <= 5; row++) {

			for (int col = 1; col <= row; col++) {
				System.out.print(col * col + " ");
			}
			System.out.println();
		}

	}

}
