package stringManipulation;

import java.util.Scanner;

public class isThereTheCharacter {

	public static void main(String[] args) {
		//get a sentence and a letter from the user
		// print whether the letter exists in the sentence
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please type the sentence");
		String str=scan.nextLine();
		
		System.out.println("Which character do you want to look for?");
		char character=scan.next().charAt(0);
		
		int index=str.indexOf(character);
		
		if (index>1) {
			System.out.println("The character exists in the sentece");
		} else {
			System.out.println("The character doesn't exist");
		}
		scan.close();

	}

}
