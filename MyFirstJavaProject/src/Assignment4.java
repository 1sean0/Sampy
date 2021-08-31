// AUTHOR: Sean Solomon
// FILENAME: Assignment4
// SPECIFICATION: Write a program that reads in a sequence of positive integers until a user enters -1 to quit
// FOR: CS 1400 - ASSIGNMENT #4
// TIME SPENT: 2hours //*/
import java.util.Scanner;

	public class Assignment4 {
		
		//Declare static variables
		static double averageCalc = 0;
		
		static int max = 0;
		
		static int min = 999999999;
		
		static int sum = 0;
	
		public static void main(String[] args) {

			//Declare local variables
			
			int count = 0; 
			
			int number = 0;
			
			Scanner scanner = new Scanner(System.in);
			 
			 do {
			 System.out.println("Enter a positive integer. Enter -1 to quit");
			 
			 number = scanner.nextInt();
			 
			 if (number == -1)
				 
				 break;
			 
			 //Call methods that calculate max, min, and sum
			 maxChecker(number); 
			 
			 minChecker(number); 
			 
			 sumCalc(number); 
			 
			 //Count number of loop iterations
			 count++;
			 
			//Call method which sees if input is prime
			isPrime(number);
			
			 } while (number != -1);
			 
			 //Calls method that calculates the average
			 average(sum,count);
			 
			 //how the double is formatted
			 String avgDisp = String.format("%.2f", averageCalc);
			 
			 //Print out max, min, sum, count, and average
			 System.out.print("\n");
			 
			 System.out.println("The maximum positive number is: " + max);
			 
			 System.out.println("The minimum positive number is: " + min);
			 
			 System.out.println("The sum is: " + sum);
			 
			 System.out.println("The count of number(s) is: " + count);
			 
			 System.out.println("The average is: " + avgDisp);
			 
			 }
			
		private static void isPrime(int number){
			
			//Checks if number is prime
		    boolean primeCheck = true;
		    for (int i = 2; i <= number / 2; ++i) {
		      if (number % i == 0) {
		    	  
		    	  primeCheck = false;
		        break;
		      }
		    }
		    
		    //Print if number input is prime or not
			 if (primeCheck)
			      System.out.println("The number " + number + " is a prime number.");
			    else
			      System.out.println("The number " + number + " is not a prime number.");
		}
		
		private static void average(int sum, int count) {
			 
			 //Divides sum and count, then stores value inside averageCalc
			 averageCalc = (double)sum/count;
		 }
		
		 private static void maxChecker(int number) {
			//If number has greater value than the max then it will be set to the same value
			 if (number > max) {
				 max = number;
			 }
			 
		 }

		 private static void minChecker(int number) {
			//If  number has lower value than min then it will be set to the same value
			 if (number < min) {
				 min = number;
			 }
		 }
		 
		 private static void sumCalc(int number) {
			 //Add all iterations of number with the current value of sum
			 sum = number + sum;
		 }
	
		}	
	