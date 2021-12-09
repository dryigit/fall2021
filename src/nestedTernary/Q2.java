package nestedTernary;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// Get a letter from the user.
		// if it is a lower case print "Lower case"
		// if it's uppercase print "Capital Letter"
		// otherwise write "the character you entered is not a letter".

		Scanner scan=new Scanner (System.in);
		System.out.println("Please type a letter");
		char letter=scan.next().charAt(0);
		
		
		String finalVersion= letter>='a'&& letter<='z' ? ("Lower case"):
							(letter>='A'&& letter<='Z' ? "Capital Letter": "the character you entered is not a letter");
		
		System.out.println(finalVersion);
		
		scan.close();
	}

}
