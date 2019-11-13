package com.syntax.class4;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
	//	Do While


//		
//		int num = 10;
//		while (num <= 7) {
//		System.out.println("Hello");
//		num++;
//		}
//		// rare
//		int num1 = 10;
//		do {
//		System.out.println("Bye");
//		num1++;
//		} while (num1 <= 7);
//		System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
//		// print even numbers from 20 to 50 using do while
//		// 1 way
//		int even = 20;
//		do {
//		System.out.println(even);
//		even += 2;
//		} while (even <= 50);
//		System.out.println("-------------Second way---------");
//		// 2 way
//		int even1 = 20;
//		do {
//		if (even1 % 2 == 0) {
//		System.out.println(even1);
//		}
//		even1++;
//		} while (even1 <= 50);
	





		/*Ask user to pay for a candy
		     *keep asking user to pay for coffee until entered price is not equal to 3
//		     *after user got a write amount print "Please enjoy your candy"*/
//
//		        Scanner scan = new Scanner(System.in);
//		        double price;
//
//		        do {
//		            System.out.println("Please pay for your candy");
//		            price = scan.nextDouble();
//		        } while (price != 3);
//		        
//		        System.out.println("Please enjoy your candy");
//		        
		        
		//Say good morning 5 times
		//initialize;   test condition;   increment
//		for (int i=0;    i<=4;           i++) {
//		System.out.println("Good morning");
//		}
//		//print numbers from 1-10;
//		for (int i=1; i<=10; i++) {
//		System.out.println(i);
//		}
//		//print numbers from 10-1
//		for (int i=10; i>=1; i--) {
//		System.out.println(i);
//		}
//		for (int i=0; i<=50; i+=5) {
//		System.out.println(i);//5, 10, 15, 20
//	

		/*
		* write a code to find the sum of even & odd numbers from range 1 to
		20
		* expecting 2 outputs sum for odd nums=... sum for even nums=...
		*/
//		int sumEven = 0;
//		int sumOdd = 0;
//		for (int i = 1; i <= 20; i++) {
//		if (i % 2 == 0) {
//		sumEven =sumEven+ i;
//		} else {
//		sumOdd = sumOdd+i;
//		}
//		}
//		System.out.println("The total of all even#=" + sumEven);
//		System.out.println("The total of all odd#=" + sumOdd);
		




		    /*Print numbers from 10 to 1*/
//		        for (int y=10; y>=1; y--) {
//		            System.out.println(y);
//		        }

	//	int even = 0;
		/*Print all even numbers from 40 to 10
		        for (int i=40; i>10; i - - ) {
		            if (i % 2 == 0) {
		            even =++ i;
		            }
		        }
		System.out.println("The sum of all the even numbers from 40 to 10  is " + sumEvens);






		/*write a program to find the sum of all even and odd numbers from 0 to 25?*/
//		int sumOdds = 0;
//		        int sumEvens = 0;
//
//		        for (int i = 0; i <= 25; i++) {
//		            if (i % 2 == 0) {
//		                sumEvens = sumEvens + i;
//		            } else {
//		                sumOdds = sumOdds + i;
//		            }
//		        }
//		        System.out.println("The sum of all the even numbers from 0 to 25 is " + sumEvens);
//		        System.out.println("The sum of all odd numbers from 0 to 25 is " + sumOdds);

	

		// break keyword breaks/exist the loop
//		for (int i = 0; i < 10; i++) {
//		if (i == 2) {
//		break;
//		}
//		System.out.println(i);
//		}
//		System.out.println("**********************");
//		// continue - it will skip CURRENT iteration
//		for (int i = 1; i <= 5; i++) {
//		if (i == 3 || i == 4) {
//		continue;
//		}
//		System.out.println(i);
//		}
//		System.out.println("*******************");
//		// I want to print nums from 1 to 20 except 5,6,7
//		for (int a = 1; a <= 20; a++) {//5
//		if (a >=5 && a<=17) {
//		continue;
//		}
//		System.out.println(a);






	//	Write a program from 0 to 100 and break the loop once the value  reaches 45

//		  int num =0;
//		     while(num<=100)
//		     {
//		         System.out.println("Value of variable is: "+num);
//		         if (num== 45)
//		         {
//		            break;
//		         }
//		         num++;
//		     }
//		     System.out.println("Out of while-loop");





///		Write a program  1 to 10 and skip all even numbers between them and only print the odd numbers

	//	    for (int j=0; j<=6; j++)
//		    {
//		          if ( j==2 || j==4 || j==6 || j==8 || j ==10);
//		          {
//		          continue;
//		       }
//
//		          System.out.print(j+" ");
//		    }
//		
		
		
	}

}
