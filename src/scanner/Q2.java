package scanner;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		/*
		* Get a three-digit number from the user
		* and print the digits of the number as ones, tens and hundreds digits
		*
		*
		* Example : Inputs : 853
		* Output : ONES digit of the number you entered : 3
		* Tens digit of the number you entered: 5
		* Hundreds digit of the number you entered: 8
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a three digit number");
		
		int num=scan.nextInt();
		
		if (num<=999 && num>=100) {
			
			int ones=num%10;
			int tens=(num/10)%10;
			int hundreds=(num/100)%10;
			
			System.out.println("Ones digit of the number you entered is: "+ ones + 
								"\nTens digit of the number you entered is: "+  tens + 
								" \nHundreds digit of the number you entered is: " + hundreds);
			
		} else {
			System.out.println("Please enter a 3-digit number");
		}
		

		scan.close();
	}

}
