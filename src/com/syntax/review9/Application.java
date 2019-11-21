package com.syntax.review9;

public class Application {
	public static void main(String[] args) {
		int[] arr = { 5, 8, 2, 9, 13, 6 };
		
		int sum = ArrayManipulation.sumOfArray(arr);
		System.out.println("The sum of the array is: " + sum);
		
		ArrayManipulation obj1 = new ArrayManipulation();
		int largest = obj1.largestNumber(arr);
		System.out.println("The largest number is: " + largest);

	}
}
