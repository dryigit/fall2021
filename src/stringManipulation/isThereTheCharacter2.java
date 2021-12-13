package stringManipulation;

import java.util.Scanner;

public class isThereTheCharacter2 {

	public static void main(String[] args) {
		//get a sentence and a letter from the user
		// print following;
		//1- The word does not exist in the sentence
		//2- the word is used once in the sentence
		//3- the word is used in the sentence more than once
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please type the sentence");
		String str=scan.nextLine();
		
		System.out.println("Which word do you want to look for?");
		String word=scan.next();
		
		int index=str.indexOf(word);
		
		if (index<0) {
			System.out.println("The word does not exists in the sentece");
		} else if  (str.indexOf(word, index+1)<0) {
			System.out.println("The word exist in the sentence once");
		} else {
			System.out.println("the word is used in the sentence more than once");
		}
		
		scan.close();

	}

}
