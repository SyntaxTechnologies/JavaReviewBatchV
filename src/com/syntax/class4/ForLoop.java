package com.syntax.class4;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// For Loop
		// Say good morning 5 times
		// initialize; test condition; increment
		for (int i=0;    i<=4;              i++) {
		System.out.println("Good morning");
		}
		
		//print numbers from 1-10;
		for (int i=1; i<=10; i++) {
		System.out.println(i);
		}
		
		//print numbers from 10-1
		for (int i=10; i>=1; i--) {
		System.out.println(i);
		}
		
		
		for (int i=0; i<=50; i+=5) {
		System.out.println(i);//5, 10, 15, 20

		}
		

		/*
		 * write a code to find the sum of even & odd numbers from range 1 to 20
		 * expecting 2 outputs sum for odd nums=... sum for even nums=...
		 */
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 1; i <= 20; i++) {
		if (i % 2 == 0) {
		sumEven =sumEven+ i;
		} else {
		sumOdd = sumOdd+i;
		}
		}
		System.out.println("The total of all even#=" + sumEven);
		System.out.println("The total of all odd#=" + sumOdd);



		for (int y = 50; y >= 25; y--) {
			if (!(y % 2 == 0)) {
				System.out.println(y);
			}
		}
		
	}

}
