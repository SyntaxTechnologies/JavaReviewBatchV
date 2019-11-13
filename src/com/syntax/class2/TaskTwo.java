package com.syntax.class2;

public class TaskTwo {

	
	public static void main(String[] args) {
		
		
      int num = 100;
      
      if (num < 100) {
          if (num >= 10) {
              System.out.println("Its a two digit number");
          }
      } else if (num < 1000) {
          if (num >= 100) {
              System.out.println("Its a three digit number");
          }
      } else if (num < 10000) {
          if(num >= 1000) {
              System.out.println("Its a four digit number");
          }
          
      } else if (num < 100000) {
          if(num >= 10000) {
              System.out.println("Its a five digit number");
          }
          
      } else {
          System.out.println("number is not between 1 & 99999");
      }
		
		
		
	}
}
