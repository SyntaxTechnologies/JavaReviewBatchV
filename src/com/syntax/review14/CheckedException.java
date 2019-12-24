package com.syntax.review14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckedException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Please enter a number");
			int a = scan.nextInt();
		} catch (Exception e) {
//			if (e instanceof InputMismatchException) {
//				System.out.println("This is an InputMismatchException");
//			}
			System.out.println("Exception -> " + e);
			System.out.println("Message -> " + e.getMessage());		
//			System.out.println("Class -> " + e.getClass());
//			e.printStackTrace();
		} finally {
			System.out.println("Happy Ending!");
		}

//		try {
//			//check exception, you have to handle
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("Please enter another number");
//		int b = scan.nextInt();
	}

}
