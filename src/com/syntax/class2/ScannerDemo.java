package com.syntax.class2;

import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		
		// Scanner is a class present in java.util package
		// which allows us to take user input.
		//Mac users: Command+Shift+O  Windows: Ctrl+Shift+O
		//System.out.println("Hello");
		Scanner keyBInput = new Scanner(System.in);
		System.out.print("Are you a male : ");
		boolean isMale=keyBInput.nextBoolean();
		
		if(isMale) {
			System.out.println("Hey! You are a male");
		}else {
			System.out.println("You are not a male");
		}
	}

}
