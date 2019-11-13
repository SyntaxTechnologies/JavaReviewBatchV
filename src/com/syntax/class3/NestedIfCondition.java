package com.syntax.class3;

import java.util.Scanner;

public class NestedIfCondition {

	public static void main(String[] args) {
		
		/*Verify if button is displayed on the page
		 * if button is displayed then we need to verify text on
		 * if text equal to sign in --> Test case pass
		 * otherwise --> Wrong text is displayed */
//		      boolean isDisplayed=true;
//		      String buttonText="Sign In";
//		      if (isDisplayed ==false) {
//		      System.out.println("Button is displayed");
//		           if (buttonText.equals("Sign In")) {
//		             System.out.println("Test case pass");
//		      }else {
//		           System.out.println("Wrong text is displayed");
//		      }
//		} 
//		        else {
//		      System.out.println("Button is not displayed");          
//		}
		      
		        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		         * Create a Java program that will ask if user has a credit card or 
		        not. If you
		         * user does not have a credit card then offer them. If they do have 
		        one ask
		         
		         * what is balance on the card? If balance of the card is larger than 
		        1000, tell
		         * them to pay off otherwise you can tell them that they can spend more
		         
		         *
		         */
//		        
//		Scanner input = new Scanner(System.in);
//		System.out.println("Do you have a credit card? true or false");
//		boolean cc = input.nextBoolean();
//		if (cc == true) {
//			System.out.println("What is the balance on your card?");
//			int balance = input.nextInt();
//			if (balance > 1000) {
//				System.out.println("Please pay off your balance");
//			} else {
//				System.out.println("You can spend more money");
//			}
//
//		}
//		else {
//			System.out.println("Would you like to apply for credit card");
//		}
		        
		        

		        
		        
		        
		        
		        
		        
		        
		        
		        
		        //Write a program with one int value for salary and four String values for different cars
		                //If you make over 50000 a year, you may buy a brand new car otherwise you should buy a used car. For those you can afford a new car there are different price ranges
		                //I want anything under 70k to be Audi A5
		                //I want anything under 80k to be Mercedes-Benz
		                //I want anything under 90k to be Jaguar
		                //I want anything under 100k to be Tesla
		                // And if you make less than 60k output to read "Save up money and wait until next year"
	
		
		
		
		
		
//		
//		Scanner scan;
//	    int salary;
//	    
//	    System.out.println("Please enter your salary");
//	    
//	    scan=new Scanner(System.in);
//	    salary=scan.nextInt();
//	    
//	    String car1,car2,car3,car4;
//	    
//	    car1="Audi A5";
//	    car2="Mercedes-Benz";
//	    car3="Jaguar";
//	    car4="Tesla";
//	    
//	    if(salary>50000) {
//	        System.out.println("You may buy a brand new car");
//	        if(salary>=50000 && salary<60000) {
//	            System.out.println("Save up money until next year");
//	        } else if(salary>=60000 && salary<70000) {
//	            System.out.println("You may buy "+car1);
//	        }
//	        else if(salary>=70000 && salary<80000) {
//	            System.out.println("You may buy "+car2);
//	        } else if(salary>=80000 && salary<90000) {
//	            System.out.println("You may buy "+car3);
//	        } else if(salary>=90000 && salary<100000) {
//	            System.out.println("You may buy "+car4);
//	        } 
//	    }else {
//	        System.out.println("You should buy a used car");
//	    }
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		                
//		              int salary = 65000;
//		              String a="Audi A5";
//		                     String b="Mercedes-Benz";
//		              String c="Jaguar";
//		              String d="Tesla";
//		              
//		          if(salary>50000) {
//		                  if(salary>=60000) {
//		                      System.out.println("With this salary you afford "+a);
//		                  }
//		                  else if (salary>=70000) {
//		                      System.out.println("With this salary you afford "+b);
//		                  }
//		                  else if (salary>=80000) {
//		                      System.out.println("With this salary you afford "+c);
//		                  } 
//		                  else if (salary>=90000) {
//		                      System.out.println("With this salary you afford "+d);
//		                  }
//		                  else {
//		                      System.out.println("Save up money and wait until next year");
//		                  }
//		          } else  {
//		              System.out.println("Sorry unfortunately you might want to buy a use car instead");
//		          }	
		
		
		
		
		
		
		
		///
//	Write a program that prints out if it is good weather to go for a bike ride. The weather is good if the temperature is between 60 degrees and 100 degrees inclusive unless it is raining. If temperature is less than 60 program should say
	//	it is too cold, if the temperature is more than 100, program should say it is too hot.

		
		/*If the temperature is between 40 degrees and 80 degrees inclusive & no
		     * rain--> we will go for hiking otherwise--> we will not go hiking
		If temperature is between 25 and 40 inclusive & snowing -->going snowboarding
		     * otherwise we are not going snowboarding it
		if temperature is more than 80 & sunny--> go to the beach otherwise --> not go to the beach*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		        Scanner scan;
		        boolean snow, rain, sunny;
		        int temp;
		        String activity;

		        scan = new Scanner(System.in);

		        System.out.println("Please enter a temperature");

		        temp = scan.nextInt();

		        if (temp >= 40 && temp < 80) {
		            System.out.println("Is it raining?");
		            rain = scan.nextBoolean();

		            if (rain) {
		                activity = "Watch a movie";
		            }
		            else {
		                activity = "Go hiking";
		            }
		        } else if (temp >= 25 && temp < 40) {
		            System.out.println("Is it snowing?");
		            snow = scan.nextBoolean();
		            if (snow) {
		                activity = "Snowboarding";
		            } else {
		                activity = "Let’s code";
		            }
		        } else if (temp >= 80) {
		            System.out.println("Is it sunny");
		            sunny = scan.nextBoolean();
		            if (sunny) {
		                activity = "Go to the beach";
		            } else {
		                activity = "Do more coding";
		            }
		        }
		        
		        else {
		            System.out.println("Please enter different temperature");
		            activity = "Unknown";
		        }
		        
		        System.out.println("My activity for today is " + activity);
		
		
		
		
		
		
		
		

	}

}
