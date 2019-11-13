package com.syntax.class2;

public class IfElseLadderStatement {

	public static void main(String[] args) {
		
//		
//		I’m creating my schedule
//	    if it’s 7 o’clock
//	        I study Java
//	    otherwise if it’s 8 o’clock
//	        I study SDLC
//	    otherwise if it’s 9 o’clock
//	        I do my homework
//	    otherwise
//	        It is not my study time
	
		
		int time=8;
		
		if(time==7) {
			System.out.println("I study Java");
		}else if(time ==8) {
			System.out.println("I study SDLC");
		}else if(time==9) {
			System.out.println("I do my homework");
		}else {
			System.out.println("It is not my study time");
		}
		
		
		
		
	}
	
}
