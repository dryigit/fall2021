package forLoop;

import java.util.Scanner;

public class Q13 {
public static void main(String[] args) {
	
	/*Ask the user to enter a letter. If the entered letter is a vowel, it is a vowel,
    if not, let it print the consonant on the screen. If the entered value is not a letter,
           show an error message. (The test is sensitive to the case of the entered letter.)
            
	 */
	
	System.out.println("Please type a letter");
	Scanner scan = new Scanner (System.in);
	char letter=scan.next().toLowerCase().charAt(0);
	
		int letterint=65;
		
		for (letterint=65 ; letterint<122   ;letterint++){
			
			switch (letter) {
				
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					System.out.println("The letter you typed is vowel");
					break;
				case 'b':
				case 'c':
				case 'd':
				case 'f':
				case 'g':
				case 'h':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					System.out.println("The letter you typed is consonant");
					break;
				default:
					System.out.println("The entry is not a letter");
				
				
			}break;
	
}
}
}
