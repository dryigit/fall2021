package randomQuestions;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		/*
		Create a program that prints an entered String in reverse
		 */

		System.out.println("Type a string");
		Scanner scan=new Scanner (System.in);
		String str=scan.nextLine();
		
		String newString="";
		
		for (int i = 0; i < str.length(); i++) {
			newString+=str.charAt(str.length()-i-1);

		}
		System.out.println(newString);
		
		
		
		
		// with String Builder
		
					StringBuilder stringBuilder=new StringBuilder(str=scan.next());
					System.out.println(stringBuilder.reverse());

		
		

		scan.close();
		
	}

}
