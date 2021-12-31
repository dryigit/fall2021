package forLoop;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// Ask the user to enter a name and a character,
		//then check how many times the character is repeated in the name using loops.
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter a string");

		String str=scan.nextLine();
		System.out.println("Which character do you want to check the number of?");
		char ch1=scan.next().charAt(0);
		
		int counter=0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==ch1) {
			counter++;	
			}
			
		}
		System.out.println("The character "+ch1+ " exists in the string "+counter +" times");

		scan.close();
		
	}

}
