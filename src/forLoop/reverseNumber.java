package forLoop;

import java.util.Scanner;

public class reverseNumber {

	
	/*
	Write a program that prompts the user to input an integer and then
	outputs the number with the digits reversed.
	For example, if the input is 12345, the output should be 54321.
	
	 */
	public static void main(String args[])
	{
		System.out.println("Please enter the number");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		
		int reverse=0;
		
		for( ;num != 0; num=num/10)
		{
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("The reverse of the given number is: " + reverse);
		
		
	}
}