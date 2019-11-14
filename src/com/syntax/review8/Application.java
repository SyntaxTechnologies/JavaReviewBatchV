package com.syntax.review8;

public class Application {
	public static void main(String[] args) {
		MathOperations mathOps = new MathOperations();

		int sum = mathOps.add(3, 4, 5);
		System.out.println(sum);

		int sum2 = mathOps.add(3, 6, 7);
		System.out.println(sum2);

		System.out.println(mathOps.add(2, 1, 3));

//		String str = "abc";
//		int size = str.length();
//		System.out.println("length is " + size);

		int result = mathOps.substract(10, 3);
		System.out.println("The substraction result is " + result);

		double d1 = mathOps.multiply(3, 4.5);
		System.out.println("The multiplication result is " + d1);

		double d2 = mathOps.divide(4.8, 1.2);
		System.out.println("The division is " + d2);

		double d3 = mathOps.divide(9.3, 0);
		System.out.println("The division is " + d3);

		int i = mathOps.multiply2(3.4, 2.3);
		System.out.println("The multiplication result is " + i);

		String str = mathOps.dummy(3);
		System.out.println(str);
	}
}
