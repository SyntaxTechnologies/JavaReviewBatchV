package com.syntax.review8;

public class MathOperations {

	int add(int number1, int number2, int number3) {
		int sum = number1 + number2 + number3;
//		System.out.println("The sum of " + number1 + " + " + number2 + " + " + number3 + " is " + sum);
		return sum;
	}

	int substract(int number1, int number2) {
		int result = number1 - number2;
//		System.out.println(number1 + " - " + number2 + " is " + result);
		return result;
	}

	double multiply(double num1, double num2) {
		double result = num1 * num2;
//		System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + result);
		return result;
	}

	int multiply2(double num1, double num2) {
		double result = num1 * num2;
		int resultInt = (int) result;
		return resultInt;
	}

	double divide(double num1, double num2) {
		double result = 0;
		if (num2 == 0) {
			System.out.println("We cannot divide by zero!");
		} else {
			result = num1 / num2;
//			System.out.println("The division of " + num1 + " by " + num2 + " is " + result);
		}
		return result;
	}
	
	String dummy(int num) {
		return "hahaha";
	}
}
