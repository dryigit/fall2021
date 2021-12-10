package switchCase;

import java.util.Scanner;

public class printWordBasedOnLetter {

	public static void main(String[] args) {
		// Ask the user to type one of the letters in the abbreviation SDET.
		// If user enters S "Software"
		//If user enters D "Developer"
		//If user enters E "Engineer"
		//If user enters T "in Testing"
		
		System.out.println("Type one of the letters in the abbreviation SDET");
		Scanner scan= new Scanner(System.in);
		
		char abrv=scan.next().toUpperCase().charAt(0);
		
		switch (abrv) {
		case 'S':
			System.out.println("Software");
			break;
		case 'D':
			System.out.println("Developer");
			break;
		case 'E':
			System.out.println("Engineer");
			break;
		case 'T':
			System.out.println("In Testing");
			break;

		default:
			System.out.println("invalid entry");
			break;
		}

		scan.close();
	}

}
