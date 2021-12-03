package ternary;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// Ask the user to enter a character
        // If it is lowercase, print "Small Letter" on the screen
        // If it is a capital letter, print "Capital Letter" on the screen
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please type e character");
		
		char character=scan.next().charAt(0);
		
		System.out.println(character<=91 ? "Capital character": "Small chacarter");

		scan.close();
	}

}
