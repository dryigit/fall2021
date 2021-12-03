package ternary;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// Get two numbers from the user and print the big one
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please enter a number");
		int num1=scan.nextInt();
		
		System.out.println("Please enter the second number");
		int num2=scan.nextInt();
		
		int biggerNumber=num1>num2 ? num1:num2; 

		System.out.println("The number "+ biggerNumber + " is the bigger one.");
		
		scan.close();
		
	}

}
