package methodCreation;

import java.util.Scanner;

public class methodA {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * Create the name1 and name2 variables. If the number of characters in the
		 * variable name1 is even, place name2 in the middle of the word. If the number
		 * of characters in the variable name1 is odd, print "name1 is not even." Create
		 * a method that prints "We couldn't place it in the middle" e.g: name1= John
		 * name2= Emil Print ==> JoEmilhn
		 */

		addEvenName();

	}

	static void addEvenName() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first string");
		String name1 = scan.next();
		System.out.println("Please enter the second string");
		String name2 = scan.next();

		if (name1.length() % 2 == 0) {
			String lasthalf = name1.substring(name1.length() / 2);
			String firstHalf = name1.replaceAll(lasthalf, "");

			System.out.println("The new string is: " + firstHalf + name2 + lasthalf);

		} else {
			System.out.println("First string is not even");
		}

	}

}
