package com.syntax.review5;

public class ArrayIntro {
	public static void main(String[] args) {
		// funny way
		int a1 = 4;
		int a2 = 5;
		int a3 = 7;
		int a4 = 2;
		int a5 = 9;

		int sum = a1 + a2 + a3 + a4 + a5;
		System.out.println(sum);

		// serious 1st way
		int[] a = new int[5];
		a[2] = 7;
		a[4] = 9;
		a[0] = 4;
		a[1] = 5;
		a[3] = 2;

		int sumA = 0;
		for (int i = 0; i < a.length; i++) {
			sumA = sumA + a[i];
		}
		System.out.println(sumA);

		// serious 2nd way

		int[] b = { 4, 5, 7, 2, 9 };
		int sumB = 0;
		for (int i = 0; i < b.length; i++) {
			sumB += b[i];
		}
		System.out.println(sumB);
		System.out.println("----------------");

		String[] s = { "dog", "cat", "mouse", "bird", "donkey", "horse" };
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

	}
}
