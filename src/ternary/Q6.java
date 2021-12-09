package ternary;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// Get an int from the user and print whether it is single or double digit
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Please enter the number");
		int number=scan.nextInt();
		
		
		String finalNumber=number%2==0 ? "double":"single";

		System.out.println("The number "+ number + " is "+ finalNumber);
	
		scan.close();
	}

}
