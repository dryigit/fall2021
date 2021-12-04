package randomQuestions;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		/*
		 * Create a program that prints an entered int in reverse
		 */

		{
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the number to get it reversed ");

			int number = scan.nextInt();
			int reverse = 0;

			for (;number != 0; number = number / 10) {
				int remainder = number % 10;
				reverse = reverse * 10 + remainder;
			}
			System.out.println("The reverse of the given number is: " + reverse);

			scan.close();
		}

	}

}
