package scanner;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		/* Ask the user to enter his name, surname, age, height, and weight
		    * print the user's name, surname, age, height and weight
		    */

		Scanner scan = new Scanner (System.in);
		
		System.out.print("Please enter your name:");
		String name=scan.next();
		System.out.print("Please enter your surname:");
		String surname=scan.next();
		System.out.print("Please enter your age:");
		int age=scan.nextInt();
		System.out.print("Please enter your height:");
		double height=scan.nextDouble();
		System.out.print("Please enter your weight:");
		double weight=scan.nextDouble();
		
		System.out.println("Your name and surname is " + name + " " +surname +"\nYour age is: "+age +" \nYour height is: "+height +"\nYour weight is: "+weight);
	
		scan.close();
	}

}
