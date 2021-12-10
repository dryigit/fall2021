package switchCase;

import java.util.Scanner;

public class convertLetterToNumber {

	public static void main(String[] args) {
		// Let's convert the note entered as a letter into number
		
		//A = 90-100
		//B = 80-89
		//C = 65-79
		//D = 50-64
		//E = 40-49
		//F = 0-39
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter your grade in Letter from A to F");
		char grade=scan.next().toUpperCase().charAt(0);
		
		switch (grade) {
		case 'A':
			System.out.println("Your grade is between 90-100");
			break;
		case 'B':
			System.out.println("Your grade is between 80-89");
			break;
		case 'C':
			System.out.println("Your grade is between 65-79");
			break;
		case 'D':
			System.out.println("Your grade is between 50-64");
			break;
		case 'E':
			System.out.println("Your grade is between 40-49");
			break;
		case 'F':
			System.out.println("Your grade is between 0-39");
			break;

		default:
			System.out.println("Invalid entry");
			break;
		}
		scan.close();

	}

}
