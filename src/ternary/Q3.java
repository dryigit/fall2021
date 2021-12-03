package ternary;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// Get two numbers from the user.
		// print the sum of the numbers if the first number is greater than the second number
		// print the multiplication of the numbers if the first number is less than the second number
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter the first number");
		int num1=scan.nextInt();
		
		System.out.println("Please enter the second number");
		int num2=scan.nextInt();
		
		String result= num1>num2 ? "The sum of the numbers is " + (num1+num2): "The multiplication of the numbers is " + (num1*num2);
		
		System.out.println(result);

		scan.close();
	}

}
