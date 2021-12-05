package scanner;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		//Write a program that converts the DOUBLE number entered by the user to an integer.
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter a double number");
		double number=scan.nextDouble();
		int newNumber=0;
		
		newNumber=(int) number;
		System.out.println("The double number was "+number +" and the int number is "+ newNumber);
				

		scan.close();
	}

}
