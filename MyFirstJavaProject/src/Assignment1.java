// AUTHOR: Sean Solomon
	// FILENAME: Lab1
	// SPECIFICATION: Read 3 test grades and then calculate and print the average.
	// FOR: CS 1400- Assignment #1
	// TIME SPENT: 2 hours
	//-----------------------------------------------------------*/
//*

//a 15 is multiplied by 5 and the result is added to 16 with sum 91
//b 15 mod 5 results to 0 and the result is added to the quotient of 17 divided by 17 with sum 1
//c 15 is added to 1 with sum 16
//d 17 mod 5 results to 2
//e 17 divided by 5 with quotient 3
//f 15 is divided by 17 with quotient 0 and added to 17 and 16 with sum 33
//g 17 is added to 15 and is divided by the sum of 17 and 16 which results to quotient 0
//h The square root of the product of 15 and 15 is 15.0
//i 15 raised to the power of 2 results to 225.0
//j The largest return between 15 and 16 is 16 */

import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double throw1, throw2, throw3;
		String comp;
		
		double yards1, yards2, yards3, feet1, feet2, feet3; 
		double      
		inches1, inches2, inches3, cm1, cm2, cm3;
		
		double yards, feet, inches, cm;
		
		yards = 1.093;
		feet = 3;
		cm = 100;
		inches = 12;
		
		System.out.println("Enter the competitor's name: ");
		comp = input.nextLine(); 
		System.out.println();
		System.out.println("\t\t" + "Olympic Javelin Throws");
		System.out.print("\t" + "Enter the distances, in meters, for "); 
		System.out.println(comp);
		System.out.println();
		
		System.out.println("Please enter the distance for throw 1: ");
		throw1 = input.nextDouble(); 
		System.out.println("Please enter the distance for throw 2: ");	
		throw2 = input.nextDouble(); 
		System.out.println("Please enter the distance for throw 3: ");	
		throw3 = input.nextDouble(); 
		
		System.out.println("\nYards\tFeet\tInches\tCm");
		
		yards1 = throw1 * yards;
		yards2 = throw2 * yards;
		yards3 = throw3 * yards;
		
		feet1= yards1 * feet;
		feet2= yards2 * feet;
		feet3= yards3 * feet;
		
		inches1= feet1 * inches;
		inches2= feet2 * inches;
		inches3= feet3 * inches;
		
		cm1 = throw1 * cm;
		cm2 = throw2 * cm;
		cm3 = throw3 * cm;

		System.out.printf("\n%-9.2f",yards1);
		System.out.printf("%-8.2f",feet1);
		System.out.printf("%-10.2f",inches1);
		System.out.printf("%-8.2f",cm1);
		
		System.out.printf("\n%-9.2f",yards2);
		System.out.printf("%-8.2f",feet2);
		System.out.printf("%-10.2f",inches2);
		System.out.printf("%-8.2f",cm2);
		
		System.out.printf("\n%-9.2f",yards3);
		System.out.printf("%-8.2f",feet3);
		System.out.printf("%-10.2f",inches3);
		System.out.printf("%-8.2f",cm3);
		
	}

}
