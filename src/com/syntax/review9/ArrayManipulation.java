package com.syntax.review9;

public class ArrayManipulation {

	public int largestNumber(int[] array) {
		int max = array[0];

		for (int element : array) {
			if (element > max) {
				max = element;
			}
		}

		return max;
	}

	public static int sumOfArray(int[] array) {
		int total = 0;

		for (int element : array) {
			total += element;
		}

		return total;
	}

}
