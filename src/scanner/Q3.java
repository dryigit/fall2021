package scanner;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {

	// get 2 integers from the user and print the result of four operations of these 2 integers.
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter an integer");
		int num1=scan.nextInt();
		System.out.println("Enter the second integer");
		int num2=scan.nextInt();
		
		int Sum=num1+num2;
		int Minus=num1-num2;
		int Multiplication=num1*num2;
		int Divide=num1/num2;
		
		System.out.println("Sum: " + Sum + 
							"\nMinus: " + Minus +
							"\nMultiplication: " + Multiplication +
							"\nDivide : " + Divide);
		
}
}
