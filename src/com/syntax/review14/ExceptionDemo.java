package com.syntax.review14;

public class ExceptionDemo {

	public static void main(String[] args) {

		int a = 6;
		int b = 0;
		int c = 0;

		try {
			c = a / b;
		} catch (Exception ae) {
			System.out.println("Exception: " + ae);
			System.out.println("Message: " + ae.getMessage());
			ae.printStackTrace();
		}

		System.out.println(c);

		System.out.println("Happy Ending!");

	}

}
