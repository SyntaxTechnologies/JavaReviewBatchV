package com.syntax.review6;

public class TwoD_ArrayDemo2 {
	public static void main(String[] args) {
		int[][] b = { 
				{ 7, 3, 5 }, 
				{ 9, 4, 2, 6 }, 
				{ 8, 1, 0, 3, 4 }, 
				{ 3, 5, 1 } 
		};

//		System.out.println(b.length);
//		System.out.println(b[0].length);
//		System.out.println(b[2].length);

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
//				if (j != 1 && (i != 1 && i != 3)) {
					System.out.print(b[i][j] + " ");
//				}
			}
			System.out.println();
		}
	}
}
