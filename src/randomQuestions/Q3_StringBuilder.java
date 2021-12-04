package randomQuestions;

import java.util.Scanner;

public class Q3_StringBuilder {

	public static void main(String[] args) {
	/*
	Create a program that prints an entered String in reverse with string Builder
	
	 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the string to get it reversed ");

		@SuppressWarnings("unused")
		String str;
		StringBuilder stringBuilder = new StringBuilder(str=scan.nextLine());

		
		System.out.println(stringBuilder.reverse());
		
		scan.close();
}
}
