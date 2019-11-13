package com.syntax.class2;

public class NestedIfStatement {

	public static void main(String[] args) {

//		I want to eat
//	    if I have money
//	        if the resutrant is near by
//	            I will eat in the resturant
//
//	    otherwise
//	        I will not eat outside
//
//	 Find if the number is 2 digit, 3 digit or 4 digit

		boolean hasMoney = false;
		boolean isRestNear = false;
		// boolean notHave=true;

		if (hasMoney) {
			if (isRestNear) {
				System.out.println("I will eat in the resturant");
			}
		}else {
			System.out.println("I don't have money");
		}

	}
}
