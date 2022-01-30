package stringManipulation;

import java.util.Locale;
import java.util.Scanner;

import static javax.swing.SwingConstants.SOUTH;

public class Exercise01 {
public static void main(String[] args) {
	/*
		Ask the user for a name. If
- if the name contains the letter “a” “The name you entered contains the letter a”
- if the name contains the letter “Z” “The name you entered contains the letter Z”
- if the name contains the letters “a” and “Z” “The name you entered contains the letters a and Z”
- if neither, print "The name you entered does not contain the letter a or Z"
		 */
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please type a name");
	String name = scanner.nextLine();
	
	if(name.contains("a") && name.contains("Z")){
		System.out.println("The name contains a and Z");
	}else if(name.contains("Z")){
		System.out.println("The name contains Z");
	}else if (name.contains("a")){
		System.out.println("The name contains a");
	}else {
		System.out.println("The name does not contain a or Z");
	}
	
}
}
