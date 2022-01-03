package forLoop;

import java.util.Scanner;

public class Q14 {
public static void main(String[] args) {
	/*Ask the user to enter a letter. If the entered letter is a vowel, it is a vowel,
    if not, let it print the consonant on the screen. If the entered value is not a letter,
           show an error message. (The test is sensitive to the case of the entered letter.)
           
	 */
	
	System.out.println("Please type a letter");
	Scanner scan = new Scanner (System.in);
	String letter=scan.next();
	
	String wovels="aeiou";
	String consonants="bcdfghjklmnprstvyzxwq";
	
	int word=letter.length();
	
	if (letter.length()==1)
	{
		
		for (int i = 0; i <word; i++)
		{
			if(wovels.contains(letter))
			{ System.out.println("wovel"); }
			else if (consonants.contains(letter))
			{ System.out.println("consonant"); }
			else {
				System.out.println("Not a letter!!");
			}
		}
	}
	else {
		System.out.println("Please type only one letter");
}
}
	
}
