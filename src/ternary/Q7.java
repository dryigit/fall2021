package ternary;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// Get a number from the user. If the number is positive, print "the number is positive." 
		//If the number is negative, print the square of the number.

		Scanner scan=new Scanner (System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		
		String finalNumber=number>0 ? "the number is positive": "The square of the number is "+number*number;
	
		System.out.println(finalNumber);
		
		scan.close();
	}

}
