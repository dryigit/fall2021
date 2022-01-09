package stringManipulation;

import java.util.Scanner;

public class encryptLetters {
public static void main(String[] args) {
	/*
	ask the user to enter ssn 9 digits
	print the ssn on the console after converting first five digits to *
	
	 */
	
	System.out.println("Please enter your ssn");
	Scanner scan = new Scanner (System.in);
	String ssn = scan.next();
	
	String firstFive= ssn.substring(0,5).replaceAll("\\w", "*");
	String lastFour=ssn.substring(5);
	
	System.out.println("Your SSN is: "+ firstFive+lastFour);
}
}
