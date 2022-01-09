package doWhile;

import java.util.Scanner;

public class repeatedOperation {

public static void main(String[] args) {
	
	/*
	Write a do-while loop that asks the user to enter two numbers.
	The numbers should be added and the sum displayed.
	The loop should ask the user whether he or she wishes to perform the operation again.
	If so, the loop should repeat; otherwise it should terminate.
	
	 */
	Scanner scan = new Scanner (System.in);
	
	int slct=0;
	do{
		System.out.println("Please enter a number");
		int num1=scan.nextInt();
		System.out.println("Please enter the second number");
		int num2=scan.nextInt();
		System.out.println("The sum of numbers you entered is : " + (num1+num2));
		System.out.println("Do you want to perform the operation again? \n 1= Yes ");
		slct=scan.nextInt();
		
	} while(slct==1);
	
	System.out.println("The operation is terminated.");
}
}
