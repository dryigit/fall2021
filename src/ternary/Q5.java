package ternary;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// Get two numbers from the user and print the small one
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Please enter a number");
		int num1=scan.nextInt();
		System.out.println("Please enter the second number");
		int num2=scan.nextInt();
		
		int smallNumber= num1<num2 ? num1:num2;
		System.out.println("The small number is: "+smallNumber);

		scan.close();
	}

}
