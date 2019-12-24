package com.syntax.review14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = 0, b = 0;
		int result = 0;

		try {
			System.out.println("Please enter a number");
			a = scan.nextInt();

			System.out.println("Please enter another number");
			b = scan.nextInt();
		} catch (InputMismatchException ime) {
			System.out.println("Sorry, you didn't enter a correct number!");
			System.out.println(ime);
		} catch (Exception ex) {
			System.out.println("Some error occurred!");
		}

		try {
			result = a / b;
			System.out.println("The division result is: " + result);
		} catch (ArithmeticException ae) {
			System.out.println("I couldn't divide!");
			System.out.println(ae);
		} catch (InputMismatchException ime) {
			System.out.println("Sorry, you didn't enter a correct number!");
		} catch (Exception ex) {
			System.out.println("Some error occurred!");
		}

		System.out.println("Happy Ending!");

	}
}
