package com.syntax.class4;

public class BreakAndContinue {

	public static void main(String[] args) {
		// Break

		// break keyword breaks/exist the loop

		for (int i = 0; i < 10; i++) {
			if (i == 2) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("**********************");

		// continue - it will skip CURRENT iteration
		for (int i = 1; i <= 5; i++) {
			if (i == 3 || i == 4) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("*******************");

		// I want to print nums from 1 to 20 except 5,6,7
		for (int a = 1; a <= 20; a++) {// 5
			if (a >= 5 && a <= 17) {
				continue;
			}
			System.out.println(a);
		}

		// Task 1

//		Write a program from 0 to 100 and break the loop once the value  reaches 45

		int num = 0;
		while (num <= 100) {
			System.out.println("Value of variable is: " + num);
			if (num == 45) {
				break;
			}
			num++;
		}
		System.out.println("Out of while-loop");

//Task 2
//		Write a program  1 to 10 and if the value is 10 

		for (int i = 0; i <= 11; i++) {
			if (i == 10) {
				continue;
			}
			System.out.println(i);

		}

	}
}
